
package es.uam.eps.poo.juegodelavida;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import es.uam.eps.poo.juegodelavida.patrones.*;

public class MenuContextual extends JPopupMenu {
    
    private Ventanilla.Oyente oyentemenu;

    public MenuContextual(Ventanilla.Oyente oyente){
        
        this.oyentemenu = oyente;
        
        JMenuItem Blinker = new JMenuItem("Blinker  ", getIcon("/iconos/Patron_Blinker.png", 25, 25));
        JMenuItem Block = new JMenuItem("Block  ",  getIcon("/iconos/Patron_Block.png", 25, 25));
        JMenuItem Boat = new JMenuItem("Boat  ",  getIcon("/iconos/Patron_Boat.png", 25, 25));
        JMenuItem Glinder = new JMenuItem("Glinder  ", getIcon("/iconos/Patron_Glinder.png", 25, 25));
        JMenuItem lwss = new JMenuItem("LWSS  ",  getIcon("/iconos/Patron_LWSS.png", 25, 25));
        JMenuItem Toad = new JMenuItem("toad  ",  getIcon("/iconos/Patron_Toad.png", 25, 25));
        
        Blinker.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                oyentemenu.insertarPatron(PatronBlinker.ID);
            }
        });
        Block.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oyentemenu.insertarPatron(PatronBlock.ID);
            }
        });
        Boat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oyentemenu.insertarPatron(PatronBoat.ID);
            }
        });
        Glinder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oyentemenu.insertarPatron(PatronGlinder.ID);
            }
        });
        lwss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oyentemenu.insertarPatron(PatronLWSS.ID);
            }
        });
        Toad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oyentemenu.insertarPatron(PatronToad.ID);
            }
        });
        
        this.add(Blinker);
        this.addSeparator();
        this.add(Block);
        this.addSeparator();
        this.add(Boat);
        this.addSeparator();
        this.add(Glinder);
        this.addSeparator();
        this.add(lwss);
        this.addSeparator();
        this.add(Toad);
    }

    private Icon getIcon(String ruta, int width, int heigth){
        Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(width, heigth, 4));
        return miIcono;       
    }
    
}
