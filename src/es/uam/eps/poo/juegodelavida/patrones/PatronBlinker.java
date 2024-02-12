/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uam.eps.poo.juegodelavida.patrones;


public class PatronBlinker extends PatronCelular{
    
    public final static char SIMBOLO = 'P';
    public final static int ID = 5;

    public PatronBlinker(){

        super(1,3);
        
        super.getCels()[0][0].setEstado(true,SIMBOLO);
        super.getCels()[0][1].setEstado(true,SIMBOLO);
        super.getCels()[0][2].setEstado(true,SIMBOLO);
        
    }    
}
