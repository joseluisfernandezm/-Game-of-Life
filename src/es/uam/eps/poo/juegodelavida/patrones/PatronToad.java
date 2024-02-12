/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uam.eps.poo.juegodelavida.patrones;

/**
 *
 * @author flipi
 */
public class PatronToad extends PatronCelular{

    public final static char SIMBOLO = 'S';
    public final static int ID = 1;

    public PatronToad(){

        super(2,4);
        
        super.getCels()[0][1].setEstado(true,SIMBOLO);
        super.getCels()[0][2].setEstado(true,SIMBOLO);
        super.getCels()[0][3].setEstado(true,SIMBOLO);
        super.getCels()[1][0].setEstado(true,SIMBOLO);
        super.getCels()[1][1].setEstado(true,SIMBOLO);
        super.getCels()[1][2].setEstado(true,SIMBOLO);        

    }
    
}
