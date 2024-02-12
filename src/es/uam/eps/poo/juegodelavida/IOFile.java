
package es.uam.eps.poo.juegodelavida;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IOFile {
    
    final static String PATH_mapas = "mapas_guardados/";
    
    public static boolean GuardarMapa(Malla mapa, String fichero){
        
        try{
            FileWriter escribir = new FileWriter(fichero + ".txt");
            
            BufferedWriter bw = new BufferedWriter(escribir);
            bw.write("");
            
            escribir.write(mapa.getDim()[0] + "\n");
            escribir.write(mapa.getDim()[1] + "\n");
            
            for(int i=0;i<mapa.getDim()[0];i++){
                for(int j=0;j<mapa.getDim()[1];j++){
                    escribir.write(mapa.getCels_fromMalla(i, j).valor);
                }
                escribir.write("\n");
            }
            
            bw.close();
            
            return true;
        
        }catch(IOException e){
            System.out.println("Error al leer el fichero");
            System.exit(0);
            return false;
        }
        
    }
    
    public static Malla leerMapa(String fichero){
        Malla mapa;
        int fil;
        int col;
        String lectura;
        char valor;
        
        try{
            FileReader lector = new FileReader(fichero);

            BufferedReader contenido=new BufferedReader(lector);
            
            fil = Integer.parseInt(contenido.readLine());
            col = Integer.parseInt(contenido.readLine());
            mapa = new Malla(fil, col);
            
            for(int i=0;i<fil;i++){
                if((lectura = contenido.readLine())!=null){
                    for(int j=0;j<col;j++){

                        valor = lectura.charAt(j);
                        if(valor != '.')
                            mapa.getCels_fromMalla(i, j).setEstado(true, valor);
                    }
                }
            }
            
            return mapa;
        
        }catch(IOException e){
            
            System.out.println("Error al leer el fichero");
            return null;
        }
    }
    
}
