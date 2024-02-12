
package es.uam.eps.poo.juegodelavida;

import es.uam.eps.poo.juegodelavida.excepciones.*;
import es.uam.eps.poo.juegodelavida.utils.IOUtils;
import java.util.*;



public class InterfazTexto extends Interfaz{

    public static void main(String[] args){
        
        try {
            JuegoDeLaVida jdv;
            InterfazTexto interfaz = new InterfazTexto();
            Scanner teclado = new Scanner(System.in);
            
            final String patrones = "Elija un patron:\nID:  -  Patron:\n0  -  PatronBlock\n1  -  PatronToad\n2  -  PatronBoat\n3  -  PatronGlinder\n4  -  PatronLWSS\n5  -  PatronBlinker";
            
            char lecturaChar;
            int lecturaInt;
            String lectura;
            int var_x;
            int var_y;
            boolean run, salida;

            if(args[0].matches("-d")){
                
                if(args.length!=4)
                    throw new ExcepcionArgs();
            
                jdv = new JuegoDeLaVida();
                jdv.setMapa(IOFile.leerMapa(args[1]));
                jdv.setMapa(Simulador.ejecutarNPasos(jdv.getMapa(), Integer.valueOf(args[3]))); //COMPROBAR Simulador
                IOFile.GuardarMapa(jdv.getMapa(), args[2]);
                
            }
            
            else if(args[0].matches("-p")){
                
                if(args.length!=3)
                    throw new ExcepcionArgs();
                
                jdv = new JuegoDeLaVida(Integer.parseInt(args[1]), Integer.parseInt(args[2])); //vigilar excepciones
                
                run = true;
                while(run){
                   
                        
                        interfaz.mostrarMapa(jdv.getMapa());

                        System.out.println("Seleciona una opcion:\n(a) ejecutar la siguiente generacion\n(b) cambiar el tamanio de la malla\n(c) insertar un nuevo patron en el tablero\n(d) activar/desactivar una celula del tablero\n(e) cargar un nuevo mapa\n(f) guardar el mapa actual\n(g) salir del juego\n");
                        
                        lecturaChar = teclado.next().charAt(0);
                        teclado.nextLine();
                        switch (lecturaChar) {
                            case 'a': //siguiente iteracion//

                                jdv.setMapa(Simulador.ejecutarPaso(jdv.getMapa()));
                                
                                break;
                            case 'b': //cambiar tamaño//
                                salida = true;
                                while(salida){
                                    try{
                                        System.out.println("Introduza el nuevo numero de filas:");
                                        var_x = IOUtils.checkDim(teclado.nextLine());
                                        System.out.println("Introduzca el nuevo numero de columnas:");
                                        var_y = IOUtils.checkDim(teclado.nextLine());

                                        jdv.getMapa().cambiarTamanioMalla(var_x, var_y);

                                        salida = false;
                                        
                                    }catch(ExcepcionDimensionError d){
                                        System.out.println("---- No introduzcas dimensiones negativas ni caracteres, intentalo de nuevo ----\n");
                                        
                                    }
                                }
                            break;

                            case 'c': //insertar patron//
                                salida = true;
                                while(salida){
                                    try{
                                        System.out.println("Escribe la coordenada x:");                                
                                        var_x = IOUtils.checkDim(teclado.nextLine());
                                        System.out.println("Escribe la coordenada y:");
                                        var_y = IOUtils.checkDim(teclado.nextLine());

                                        System.out.println(patrones);           
                                        lecturaInt= IOUtils.checkDim(teclado.nextLine());

                                        jdv.getMapa().addPatron(var_x, var_y, lecturaInt);
                                        
                                        salida=false;
                                    }catch(ExcepcionDimensionError d){
                                        System.out.println("---- No introduzcas coordenadas ni Id negativos, intentalo de nuevo ----\n");
                                    }
                                }
                                break;
                            case 'd':
                                salida = true;
                                while(salida){
                                        try{
                                            System.out.println("Escribe la coordenada x:");
                                            var_x = IOUtils.checkDim(teclado.nextLine());
                                            System.out.println("Escribe la coordenada y:");
                                            var_y = IOUtils.checkDim(teclado.nextLine());                                           
                                            System.out.println("Escribe el estado nuevo de la celula:\n1 - viva\n0 - muerta");
                                            lecturaInt =IOUtils.checkDim(teclado.nextLine());


                                            switch (lecturaInt) {
                                                case 0: jdv.getMapa().setCels_fromMalla(var_x, var_y, false); break;
                                                case 1:jdv.getMapa().setCels_fromMalla(var_x, var_y, true); break;

                                                default:{break;}//throw exception
                                            }
                                            
                                            salida= false;

                                            }catch(ExcepcionDimensionError d){
                                                    System.out.println("---- No introduzcas dimensiones ni estados negativos o caracteres, intentalo de nuevo ----\n");
                                            }
                                }
                            break;
                            
                            case 'e': //cargar fichero//
                                
                                Malla aux;
                                System.out.println("Escribe el nombre del fichero de donde desea leer el mapa:");
                                lectura = teclado.nextLine();
                                
                                aux = IOFile.leerMapa(lectura);
                                
                                if(aux == null){
                                    System.out.println("Error leyendo el mapa");
                                    throw new Exception();
                                }
                                else{
                                    jdv.setMapa(aux);
                                    System.out.println("Mapa cargado con exito!");
                                }


                                break;
                            case 'f': //guardar fichero//
                                
                                System.out.println("Escribe el nombre del fichero donde desea guardar el mapa:");
                                lectura = teclado.nextLine();
                                
                                if(!IOFile.GuardarMapa(jdv.getMapa(),IOFile.PATH_mapas + lectura)){
                                    System.out.println("Error guardando el mapa");
                                    throw new Exception();  // Dejar esto así?
                                }
                                    
                                else
                                    System.out.println("Mapa guardado con exito!");

                                break;
                            case 'g': //finalizar simulacion//

                                run = false;

                                break;
                            default:
                                System.out.println("No se ha seleccionado ninguna opcion disponible.\nPruebe otra vez");
                        }
                }
            }

            else{
                throw new ExcepcionArgs();
            }
        }catch(ExcepcionArgs e){
        System.out.println("Error en los argumentos");

        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }   
    }
    
    @Override
    public void mostrarMapa(Malla mapa){
            
        int fil = mapa.getDim()[0];
        int col = mapa.getDim()[1];
        
        System.out.println("");
        for(int i = 0;i<fil;i++){
            for(int j = 0;j<col;j++){
                System.out.print(""+mapa.getCels_fromMalla(i,j)+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}


    

