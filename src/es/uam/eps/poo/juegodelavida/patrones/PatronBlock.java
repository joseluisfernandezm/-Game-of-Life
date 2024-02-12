/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uam.eps.poo.juegodelavida.patrones;

/**
 *
 * @author flipi
 */
public class PatronBlock extends PatronCelular{

    public final static char SIMBOLO = 'B';
    public final static int ID = 0;
    
    public PatronBlock(){

        super(2,2);
        super.getCels()[0][0].setEstado(true,SIMBOLO);
        super.getCels()[0][1].setEstado(true,SIMBOLO);
        super.getCels()[1][0].setEstado(true,SIMBOLO);
        super.getCels()[1][1].setEstado(true,SIMBOLO);

   
    }
    
}
