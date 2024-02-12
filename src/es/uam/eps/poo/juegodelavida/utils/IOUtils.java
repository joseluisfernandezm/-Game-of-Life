package es.uam.eps.poo.juegodelavida.utils;
import es.uam.eps.poo.juegodelavida.excepciones.*;

public class IOUtils {
    
    public static int checkDim(String x)throws ExcepcionDimensionError{
        
        if(x == null) {
            throw new ExcepcionDimensionError();
        }
        try {
            int number = Integer.parseInt(x);
            
            if(number >= 0)
                return Integer.parseInt(x);
            else
                throw new ExcepcionDimensionError();
            
        } catch (NumberFormatException nfe){
            throw new ExcepcionDimensionError();
        }
       
    }
}
