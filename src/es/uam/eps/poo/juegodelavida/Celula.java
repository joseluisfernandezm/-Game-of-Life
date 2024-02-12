
package es.uam.eps.poo.juegodelavida;

public class Celula {
    
    //atributos
    public static final char MUERTA='.';
    public static final char VIVA='X';
    protected boolean estado;
    protected char valor;
    
    
    public Celula(boolean estado, char valor) {
        this.estado = estado;
        this.valor = valor;
    }
    
    public Celula() {
        this.estado = false;
        this.valor = MUERTA;
    }

    public void setEstado(boolean estadoAux){
    
        this.estado=estadoAux;
        if(estadoAux)
            valor = VIVA;
        if(!estadoAux)
            valor = MUERTA;
    }

    public void setEstado(boolean estadoAux, char valor){
    
        this.estado=estadoAux;
        this.valor=valor; 
    
    }

    @Override
    public String toString(){
        return "" + this.valor;
    
    }  
    
}
