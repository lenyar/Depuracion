/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import Entitys.FormatoArchivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author RVelasco
 */

@ManagedBean(name = "CargaArchivo")
public class CargaArchivo {
    
    String ruta = "D:\\"; //Ruta de los archivos
    
    /*Leer los archivos de la base de datos 
    */
    
    public void cargarArchivos() throws FileNotFoundException, IOException{
        
            
            
        //Nombre de los archivos
        String[] nombreArchivo = new String[1]; 
        nombreArchivo[0] = "Archivo.txt";
        
        //Campos del archivo.
         
        
        String linea; //para leer el contenido de los archivo
        int i = 0; //Control del total de archivos a leer
        
        
        while(i < nombreArchivo.length){ //bucle para leer los archivos
            
            FormatoArchivo formato;
            
        File archivo = new File (ruta+nombreArchivo[i]); //Crear el archivo
            try (FileReader fr = new FileReader (archivo)) { 
                BufferedReader br = new BufferedReader(fr); 
                
                System.out.println(nombreArchivo[i]);
                
                while (( linea = br.readLine())!=null){ //Leyendo lineas del archivo
                 
                 if(linea.length() < 141){ //Si el String llega de un tamaño menor a 141 (total del tamaño de los campos sumados) este lo rrellena de espacios hasta llegar a esta longitud.
                     linea = String.format("%1$-141s",linea);
                 }
              
                 formato = new FormatoArchivo(linea);
                 
                    System.out.println(linea);
                   System.out.println(formato.getOficina()+" "+formato.getFecha()+" "+formato.getBoletín()+" "+formato.getSeñalAutomatización()+" "+
                            formato.getNumeroSecuencia()+" "+formato.getNumeroReferencia()+" "+formato.getCuenta()+" "+formato.getTercero()+" "+formato.getMoneda()+" "+
                            formato.getDepartamento()+" "+formato.getOficinaReceptora()+" "+formato.getOficinaTerminal()+" "+formato.getTipoForma()+" "+formato.getTipoInter()+" "+
                            formato.getTipoRegistro()+" "+formato.getTipoimputación()+" "+formato.getMonto()+" "+formato.getSeñalConciliación()+" "+formato.getSeñalComprobante()+" "+
                            formato.getSeñalInter()+" "+formato.getDetalle()+" "+formato.getTasa());
                }

                i++;
            }
        }

    }
    
    
    
   public static void main(String[] args) throws IOException{
         CargaArchivo a = new CargaArchivo();
         a.cargarArchivos();
       
    }

    
}

