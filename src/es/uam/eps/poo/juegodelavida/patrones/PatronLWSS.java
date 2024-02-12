/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uam.eps.poo.juegodelavida.patrones;

/**
 *
 * @author flipi
 */
public class PatronLWSS extends PatronCelular{
    
    public final static char SIMBOLO = 'N';
    public final static int ID = 4;

    public PatronLWSS(){

        super(4,5);

        super.getCels()[0][1].setEstado(true,SIMBOLO);
        super.getCels()[0][4].setEstado(true,SIMBOLO);
        super.getCels()[1][0].setEstado(true,SIMBOLO);
        super.getCels()[2][0].setEstado(true,SIMBOLO);
        super.getCels()[2][4].setEstado(true,SIMBOLO);
        super.getCels()[3][0].setEstado(true,SIMBOLO);
        super.getCels()[3][1].setEstado(true,SIMBOLO);
        super.getCels()[3][2].setEstado(true,SIMBOLO);
        super.getCels()[3][3].setEstado(true,SIMBOLO);

    }    
}
