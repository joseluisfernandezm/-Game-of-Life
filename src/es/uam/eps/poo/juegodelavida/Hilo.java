
package es.uam.eps.poo.juegodelavida;

public class Hilo extends Thread{

    private Mipanel canvasMalla;
    private int velocidad=1000;
    private boolean ejecucion=false;
    private int contador_gen;
    
    public Hilo(Mipanel canvasMalla) {
        this.canvasMalla = canvasMalla;
    }

    public void SetVelocidad(int velocidad){
        this.velocidad=velocidad;
    }
    
    public int getContador_gen(){
        return this.contador_gen;
    }
    
    public Malla DetenerHilo(){
        //extraer canvasmalla
        ejecucion=false;
        return this.canvasMalla.getMapa();
    }
    
    public void ArrancarHilo(Malla mapa){
        //cargar canvasmalla
        this.canvasMalla.setMapa(mapa);
        contador_gen = 0;
        ejecucion=true;
    }
    
    @Override
    public void run() {
        while(!Hilo.currentThread().isInterrupted()){
            
            try {
                if(ejecucion == true){
                    Malla nueva_malla = Simulador.ejecutarNPasos(this.canvasMalla.getMapa(),1);
                    canvasMalla.setMapa(nueva_malla);
                    canvasMalla.repaint();
                    Hilo.sleep(velocidad);
                    contador_gen++;
                    //System.out.println("ejecucion true");
                }
               
            }catch(InterruptedException a){
                System.out.println("ERROR: interrupcion");
                this.interrupt();
            }
        }
        // revisar la detencion del hilo
    }// Resisar parte de la excepción de cambio de velocidad






    
}
