package es.uam.eps.poo.juegodelavida;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import es.uam.eps.poo.juegodelavida.patrones.*;

public class Mipanel extends JPanel {

   private Malla mapa;
   private int sobrante_x;
   private int sobrante_y;

    public Mipanel(Malla mapa) {
        this.setBackground(Color.WHITE);
        this.mapa = mapa;
    }
    
    public int getPositionInMap_X(int pixel_x){

        int dim_y = mapa.getDim()[1];
        int height_cell = (int) (this.getWidth())/dim_y;
        return (int)(correccion_Y(pixel_x) / height_cell);
        
        
    }
    public int getPositionInMap_Y(int pixel_y){

        int dim_x = mapa.getDim()[0];
        int width_cell = (int) (this.getHeight())/dim_x;
        return (int)((correccion_X(pixel_y) / width_cell));
        
    }

    public Malla getMapa(){
        return mapa;
    }
    
    public void setMapa(Malla mapa){
        this.mapa = mapa;
    }
    
   @Override
    public void paintComponent(Graphics g) {
        
        int anchoTotal = this.getWidth();
        int altoTotal = this.getHeight();
        int dim_x = mapa.getDim()[0];
        int dim_y = mapa.getDim()[1];
        
        g.setColor(new Color(204, 255, 204));
        g.fillRect(0, 0, anchoTotal, altoTotal);
        
        int width_cell = (int) (altoTotal)/dim_x;
        int height_cell = (int) (anchoTotal)/dim_y;
        sobrante_x = (anchoTotal)%dim_x/2;
        sobrante_y = (altoTotal)%dim_y/2;
          
        
        for(int i=0;i<dim_x;i++){
            for(int j=0;j<dim_y;j++){
                g.setColor(setColor(mapa.getCels_fromMalla(i,j).valor));
                g.fillRect(sobrante_x + j*height_cell, sobrante_y + i*width_cell, height_cell, width_cell);
            }
        }
        
        g.setColor(Color.BLACK);
        for(int i=0;i<dim_x;i++)
            for(int j=0;j<dim_y;j++)
                g.drawRect(sobrante_x + j*height_cell, sobrante_y + i*width_cell, height_cell, width_cell);
        
    }
    
    public int correccion_Y(int y){
        return y - sobrante_x;
    }
    
    public int correccion_X(int x){
        return x - sobrante_y;
    }
    
    public boolean dentroLimites(int x, int y){
        if(x>sobrante_x && x<(this.getWidth() - sobrante_x ) && y>sobrante_y && y<(this.getHeight() - sobrante_y -1)){
            return true;
        }
        else
            return false;
    }
    
    private Color setColor(char valor){
    
        switch(valor){
            case PatronBlinker.SIMBOLO:
                return Color.YELLOW;
                
            case PatronBlock.SIMBOLO:
                return Color.PINK;
                
            case PatronBoat.SIMBOLO:
                return Color.CYAN;
                
            case PatronGlinder.SIMBOLO:
                return Color.RED;
                
            case PatronLWSS.SIMBOLO:
                return Color.MAGENTA;
                
            case PatronToad.SIMBOLO:
                return Color.GREEN;
                
            case PatronCelular.VIVA:
                return Color.GRAY;
                
            case PatronCelular.MUERTA:
                return Color.WHITE;
        
        }
        
        return Color.black;
    }
}

    

