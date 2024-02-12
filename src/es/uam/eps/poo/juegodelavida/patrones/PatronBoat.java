/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uam.eps.poo.juegodelavida.patrones;

/**
 *
 * @author flipi
 */
public class PatronBoat extends PatronCelular{
    
    public final static char SIMBOLO = 'T';
    public final static int ID = 2;

    public PatronBoat(){

        super(3,3);
        
        super.getCels()[0][0].setEstado(true,SIMBOLO);
        super.getCels()[0][1].setEstado(true,SIMBOLO);
        super.getCels()[1][0].setEstado(true,SIMBOLO);
        super.getCels()[1][2].setEstado(true,SIMBOLO);
        super.getCels()[2][1].setEstado(true,SIMBOLO);

    }
    
}
