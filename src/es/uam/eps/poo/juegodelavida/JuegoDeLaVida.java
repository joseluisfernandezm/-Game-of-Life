
package es.uam.eps.poo.juegodelavida;


public class JuegoDeLaVida{
    
    private Malla mapa;
    
    public JuegoDeLaVida(){

    }
    
    public JuegoDeLaVida(int fil, int col){
        mapa = new Malla(fil, col);
    }
    
    public Malla getMapa(){
        return mapa;
    }
    
    public void setMapa(Malla mapa){
        this.mapa = mapa;
    }
    
}
