
package es.uam.eps.poo.juegodelavida.patrones;

import es.uam.eps.poo.juegodelavida.Celula;


public abstract class PatronCelular {

    public int filas;
    public int columnas;
    public final static char MUERTA = '.';
    public final static char VIVA = 'X';
    private Celula cel[][];
    
    
    public PatronCelular(int fil, int cols){    //DUDA NOTAS P1

        this.filas = fil;
        this.columnas = cols;        
        cel = new Celula[fil][cols];

        for(int i=0; i<fil;i++){
            for(int j=0;j<cols;j++){
                cel[i][j] = new Celula();
            }
        }
    }
    
    public Celula[][] getCels(){
    
        return cel;
    }
    
}
