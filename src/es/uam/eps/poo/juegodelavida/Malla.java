
package es.uam.eps.poo.juegodelavida;
import es.uam.eps.poo.juegodelavida.patrones.*;

import javax.swing.*;


public class Malla {

    private int filas;
    private int columnas;
    private Celula mallacelular[][];


   public Malla(int fil, int cols){

    this.filas = fil;
    this.columnas = cols;
    
    borrar();
    
    }

    public void cambiarTamanioMalla(int fil, int cols){



        Celula mallacelularAux[][]= new Celula[fil][cols];
        

        for(int i=0; i<fil;i++){
            for(int j=0;j<cols;j++){
                if(i>=this.filas || j>=this.columnas)
                    mallacelularAux[i][j] = new Celula();
                else
                    mallacelularAux[i][j]=mallacelular[i][j];
            }
        }
        
        this.filas = fil;
        this.columnas = cols;
        this.mallacelular = mallacelularAux;
    }
    

    public void addPatron(int fil, int col, int ID){
       
        boolean check;
        PatronCelular patron =  null;

        switch(ID){
           
            case 0:
                patron = new PatronBlock();
            break;
            
            case 1:
                patron = new PatronToad();
            break;
            
            case 2:
                patron = new PatronBoat();
            break;
            
            case 3:
                patron = new PatronGlinder();
            break;
            
            case 4:
                patron = new PatronLWSS();
            break;
            
            case 5:
                patron = new PatronBlinker();
            break;
            
            default:
                //throw "No existe este patrón, pruebe otra vez"
            break;

        }

        if(patron.filas > this.filas || patron.columnas > this.columnas){
            //throw "El patron no entra en el mapa, pruebe otra vez"
        }

        
        for(int i=0;i<patron.filas;i++){
            for(int j=0;j<patron.columnas;j++){
                mallacelular[(i+fil)%this.filas][(j+col)%this.columnas].setEstado(patron.getCels()[i][j].estado,patron.getCels()[i][j].valor);

            }
        }
    }
    
    public void borrar(){
        
        mallacelular = new Celula[filas][columnas];
        for(int i=0; i<filas;i++){
            for(int j=0;j<columnas;j++){
                mallacelular[i][j] = new Celula();
            }
        }
    
    }
    
    public Celula getCels_fromMalla(int x, int y){
        return mallacelular[(filas+(x%filas))%filas][(columnas+(y%columnas))%columnas];
    }
    
    public void setCels_fromMalla(int x, int y, boolean state){
        mallacelular[x][y].setEstado(state);
    }

    public int[] getDim(){
        int[] aux = {filas , columnas};
        return aux;
    } 

    @Override
     public String toString(){

         for(int i=0;i<=this.filas;i++){
             for(int j=0;j<=this.columnas;j++){
                 System.out.print("");
             }
         }   
         return null;
     }
     
}
