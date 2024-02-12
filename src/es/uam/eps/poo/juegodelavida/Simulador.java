package es.uam.eps.poo.juegodelavida;


public class Simulador {
                                                        
    public static Malla ejecutarPaso(Malla oldMapa){
        
        int fil = oldMapa.getDim()[0];
        int col = oldMapa.getDim()[1];
        
        Malla newGenMalla = new Malla(fil,col);
        int vivas;
        
        for(int i=0;i<fil;i++){
            for(int j=0;j<col;j++){
                
                if(oldMapa.getCels_fromMalla(i, j).estado == true)// MEJORAR ELEGANTE
                    vivas = -1;
                else
                    vivas = 0;
                            
                for(int x=-1;x<2;x++){
                    for(int y=-1;y<2;y++){
                        if(oldMapa.getCels_fromMalla(i+x, j+y).estado == true)
                            vivas++;
                    }
                }
                
                if(vivas == 3)
                    newGenMalla.setCels_fromMalla(i,j,true);
                
                if(vivas == 2)
                    newGenMalla.setCels_fromMalla(i,j,oldMapa.getCels_fromMalla(i, j).estado);

                if(vivas !=3 && vivas != 2)
                    newGenMalla.setCels_fromMalla(i,j,false);
                
            }
        }
        
        return newGenMalla;
    }
    
    public static Malla ejecutarNPasos(Malla mapa, int n){//throw
        
        for(int i=0;i<n;i++)
            mapa = ejecutarPaso(mapa);
        
        return mapa;
    }

}
