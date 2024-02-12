package es.uam.eps.poo.juegodelavida;
//package sonidos;

import java.applet.AudioClip;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Toolkit;


public class Ventanilla extends javax.swing.JFrame {
    
    public Ventanilla() {
        
    jdv = new JuegoDeLaVida(default_x, default_y);
    initComponents();
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/cell.png")));
    }

    public JButton getjButtonIniciarSimu() {
        return jButtonIniciarSimu;
    }

    public void setjButtonIniciarSimu(JButton jButtonIniciarSimu) {
        this.jButtonIniciarSimu = jButtonIniciarSimu;
    }

    public JButton getjButtonPararSimu() {
        return jButtonPararSimu;
    }

    public void setjButtonPararSimu(JButton jButtonPararSimu) {
        this.jButtonPararSimu = jButtonPararSimu;
    }

    public JButton getjButtonRedim() {
        return jButtonRedim;
    }

    public void setjButtonRedim(JButton jButtonRedim) {
        this.jButtonRedim = jButtonRedim;
    }
                         
    private void initComponents() {
        
        jButtonMusica = new javax.swing.JButton(getIcon("/iconos/musica.png", 25, 25));
        jPanelIzquierdo = new javax.swing.JPanel();
        jButtonBorrar = new javax.swing.JButton(getIcon("/iconos/delete.png", 25, 25));
        jButtonPapas = new javax.swing.JButton(getIcon("/iconos/gandul.png", 25, 25));
        jLabelPasoPaso = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelVelocidad = new javax.swing.JLabel();
        jComboBoxVelocidades = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        jButtonPararSimu = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jButtonIniciarSimu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonUnPaso = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jPanelMapa = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabelGeneracion = new javax.swing.JLabel();
        jPanelDerecho = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jButtonGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxColumnas = new javax.swing.JComboBox<>();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jButtonRedim = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxFilas = new javax.swing.JComboBox<>();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAjustes = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenu();
        
        //------ Mis declaraciones
        canvasMalla = new Mipanel(jdv.getMapa());
        jLabelNumGen = new javax.swing.JLabel();
        num_generacion = 0;
        Oyente miOyente = new Oyente();
        menuPatrones = new MenuContextual(miOyente);
        
        
        threadCanvas = new Hilo(canvasMalla);
        threadCanvas.start();

        //--------------------------------------------------------Frame----------------------------------------------------------------

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Juego de la Vida");
        setMinimumSize(new java.awt.Dimension(600, 400));
        this.addWindowListener(miOyente);
        
        //---------------------------------------------Panel Layouts------------------------------------------------------------
        
        getContentPane().setLayout(null);
        getContentPane().add(jPanelIzquierdo);
        this.jPanelIzquierdo.setVisible(true);
        jPanelIzquierdo.setBounds(30, 10, 270, 130);
        
        //---------------------------------------------Panel Izquierdo------------------------------------------------------------

        jPanelIzquierdo.setBackground(new java.awt.Color(204, 204, 255));
        jPanelIzquierdo.setLayout(null);
        
        jLabel4.setText("Simulación Completa");
        jPanelIzquierdo.add(jLabel4);
        jLabel4.setBounds(40, 0, 120, 40);
        
        jLabelVelocidad.setText("Velocidad:");
        jPanelIzquierdo.add(jLabelVelocidad);
        jLabelVelocidad.setBounds(30, 40, 60, 20);
        
        jComboBoxVelocidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x1", "x2", "x6", "x0.5" }));
        jPanelIzquierdo.add(jComboBoxVelocidades);
        jComboBoxVelocidades.setBounds(30, 70, 90, 20);

        jComboBoxVelocidades.addItemListener(miOyente);
        
        jButtonIniciarSimu.setText("Ejecutar Sumulación");
        jButtonIniciarSimu.setToolTipText("");
        jPanelIzquierdo.add(jButtonIniciarSimu);
        jButtonIniciarSimu.setBounds(30, 100, 150, 23);
        jButtonIniciarSimu.addActionListener(miOyente);
        jButtonIniciarSimu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        jButtonPararSimu.setText("Parar simulación ");
        jPanelIzquierdo.add(jButtonPararSimu);
        jButtonPararSimu.setBounds(30, 130, 150, 23);
        jButtonPararSimu.addActionListener(miOyente);
        jButtonPararSimu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
//*************************************************************************************************
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");
        jPanelIzquierdo.add(jSeparator1);
        jSeparator1.setBounds(190, 20, 30, 150);
        
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setToolTipText("");
        jPanelIzquierdo.add(jSeparator5);
        jSeparator5.setBounds(10, 20, 30, 150);

        jSeparator9.setToolTipText("");
        jPanelIzquierdo.add(jSeparator9);
        jSeparator9.setBounds(170, 210, 20, 20);

        jSeparator6.setToolTipText("");
        jPanelIzquierdo.add(jSeparator6);
        jSeparator6.setBounds(10, 210, 10, 20);
        
        jLabelPasoPaso.setText("Simulación Paso a Paso");
        jPanelIzquierdo.add(jLabelPasoPaso);
        jLabelPasoPaso.setBounds(30, 190, 140, 40);

        jButtonUnPaso.setText("Ejecutar Generación");
        jButtonUnPaso.addActionListener(miOyente);
        jPanelIzquierdo.add(jButtonUnPaso);
        jButtonUnPaso.setBounds(30, 230, 140, 23);
        jButtonUnPaso.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setToolTipText("");
        jPanelIzquierdo.add(jSeparator7);
        jSeparator7.setBounds(190, 210, 30, 60);

        jSeparator4.setToolTipText("");
        jPanelIzquierdo.add(jSeparator4);
        jSeparator4.setBounds(170, 20, 20, 20);

        jSeparator2.setToolTipText("");
        jPanelIzquierdo.add(jSeparator2);
        jSeparator2.setBounds(10, 170, 180, 20);

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setToolTipText("");
        jPanelIzquierdo.add(jSeparator10);
        jSeparator10.setBounds(10, 210, 30, 60);

        jSeparator8.setToolTipText("");
        jPanelIzquierdo.add(jSeparator8);
        jSeparator8.setBounds(10, 270, 180, 20);
        
        //---------------------------------------------Panel Central------------------------------------------------------------

        jPanelCentral.setBackground(new java.awt.Color(0, 255, 0));
        jPanelCentral.setLayout(new java.awt.GridLayout());

        jPanelMapa.setBackground(new java.awt.Color(204, 255, 204));

        jPanelSuperior.setBackground(new java.awt.Color(255, 255, 204));
        jPanelSuperior.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        jLabelGeneracion.setText("Generación:");
        jPanelSuperior.add(jLabelGeneracion);
        jLabelNumGen.setText(Integer.toString(num_generacion));
        jPanelSuperior.add(jLabelNumGen);
        
        canvasMalla.addMouseListener(miOyente);

        javax.swing.GroupLayout canvasMallaLayout = new javax.swing.GroupLayout(canvasMalla);
        canvasMalla.setLayout(canvasMallaLayout);
        canvasMallaLayout.setHorizontalGroup(
            canvasMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasMallaLayout.setVerticalGroup(
            canvasMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanelMapa);
        jPanelMapa.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvasMalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvasMalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        jPanelCentral.add(jPanelMapa);
        
//----------------------------------------------------------------Panel Derecho--------------------------------------------------------------


        jPanelDerecho.setBackground(new java.awt.Color(255, 204, 204));
        jPanelDerecho.setLayout(null);

        jSeparator3.setToolTipText("");
        jPanelDerecho.add(jSeparator3);
        jSeparator3.setBounds(10, 170, 180, 20);

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator13.setToolTipText("");
        jPanelDerecho.add(jSeparator13);
        jSeparator13.setBounds(190, 20, 30, 150);

        jSeparator12.setToolTipText("");
        jPanelDerecho.add(jSeparator12);
        jSeparator12.setBounds(10, 200, 10, 20);

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setToolTipText("");
        jPanelDerecho.add(jSeparator11);
        jSeparator11.setBounds(10, 20, 30, 150);

        jLabel6.setText("Partidilla");
        jPanelDerecho.add(jLabel6);
        jLabel6.setBounds(30, 0, 50, 40);

        jLabel7.setText("Guardar Partida");
        jPanelDerecho.add(jLabel7);
        jLabel7.setBounds(60, 40, 100, 20);
        
        jButtonGuardar.setText("Guardar Mapa");
        jButtonGuardar.setToolTipText("");
        jPanelDerecho.add(jButtonGuardar);
        jButtonGuardar.setBounds(30, 60, 150, 23);
        jButtonGuardar.addActionListener(miOyente);
        jButtonGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        jLabel5.setText("Cargar Partida:");
        jPanelDerecho.add(jLabel5);
        jLabel5.setBounds(60, 100, 100, 20);
        
        jButtonCargar.setText("Cargar Mapa");
        jButtonCargar.setToolTipText("");
        jPanelDerecho.add(jButtonCargar);
        jButtonCargar.setBounds(30, 120, 150, 23);
        jButtonCargar.addActionListener(miOyente);
        jButtonCargar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //-------------------------------------------Redimensionar---------------------------------------------------
        
        jLabel9.setText("Malla");
        jPanelDerecho.add(jLabel9);
        jLabel9.setBounds(30, 180, 30, 40);
        
        jLabel8.setText("Columnas:");
        jPanelDerecho.add(jLabel8);
        jLabel8.setBounds(30, 250, 100, 20);
        
        jComboBoxColumnas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40" }));
        jComboBoxColumnas.setSelectedIndex(1);
        jPanelDerecho.add(jComboBoxColumnas);
        jComboBoxColumnas.setBounds(110, 250, 50, 20);
        jComboBoxColumnas.addItemListener(miOyente);
        
        jLabel10.setText("Filas:");
        jPanelDerecho.add(jLabel10);
        jLabel10.setBounds(30, 220, 60, 20);
        
        jComboBoxFilas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40" }));
        jComboBoxFilas.setSelectedIndex(1);
        jPanelDerecho.add(jComboBoxFilas);
        jComboBoxFilas.setBounds(110, 220, 50, 20);
        jComboBoxFilas.addItemListener(miOyente);

        jSeparator14.setToolTipText("");
        jPanelDerecho.add(jSeparator14);
        jSeparator14.setBounds(10, 310, 180, 20);

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator15.setToolTipText("");
        jPanelDerecho.add(jSeparator15);
        jSeparator15.setBounds(190, 200, 30, 110);

        jSeparator16.setToolTipText("");
        jPanelDerecho.add(jSeparator16);
        jSeparator16.setBounds(70, 200, 120, 20);

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator17.setToolTipText("");
        jPanelDerecho.add(jSeparator17);
        jSeparator17.setBounds(10, 200, 30, 110);

        jSeparator18.setToolTipText("");
        jPanelDerecho.add(jSeparator18);
        jSeparator18.setBounds(80, 20, 110, 20);

        jSeparator19.setToolTipText("");
        jPanelDerecho.add(jSeparator19);
        jSeparator19.setBounds(10, 20, 10, 20);
        
        jButtonRedim.setText("Redimensionar");
        jButtonRedim.setToolTipText("");
        jPanelDerecho.add(jButtonRedim);
        jButtonRedim.setBounds(30, 280, 150, 23);
        jButtonRedim.addActionListener(miOyente);
        jButtonRedim.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        jPanelDerecho.add(jButtonBorrar);
        jButtonBorrar.setBounds(80, 330, 35, 35);
        jButtonBorrar.addActionListener(miOyente);
        jButtonBorrar.setBackground(jPanelDerecho.getBackground());
        jButtonBorrar.setBorderPainted(false);
        jButtonBorrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //----------------------------------------------------------------------------------------------------------//
        //-------------------------------------------------------Menu Superior---------------------------------------------------//

        jMenuAjustes.setText("Ajustes");
        jMenuBar.add(jMenuAjustes);
        
        jMenuHelp.setText("Help");
        jMenuBar.add(jMenuHelp);
        
        jButtonMusica.setText("modo musica: Off");
        jButtonMusica.addActionListener(miOyente);
        jMenuAjustes.add(jButtonMusica);

        jButtonPapas.setText("Los papis");
        jButtonPapas.addActionListener(miOyente);
        jMenuHelp.add(jButtonPapas);
        
        setJMenuBar(jMenuBar);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanelCentral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
          

        pack();
    }     
    
//---------------------------------------------------------------------------------------------------------------------------------------//


    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventanilla().setVisible(true);
                
            }
        });
    }
    
    //-----------------------------------------------------------------Clase Oyente----------------------------------------------------------------------//

    public class Oyente extends java.awt.event.WindowAdapter implements java.awt.event.ActionListener, java.awt.event.ItemListener, java.awt.event.MouseListener {

        
        @Override
        public void actionPerformed(ActionEvent evt) {
            
            if (evt.getSource() == jButtonUnPaso) {
                jdv.setMapa(Simulador.ejecutarNPasos(jdv.getMapa(),1));
                aumentar_contadorGen(1);
                sincronizarMapas();
                
            } else if (evt.getSource() == jButtonRedim) {
                
                jdv.getMapa().cambiarTamanioMalla(sel_filas, sel_columnas);
                sincronizarMapas();
                
            } else if (evt.getSource() == jButtonIniciarSimu) {
                cambiarBotonesHilo(false);
                threadCanvas.ArrancarHilo(jdv.getMapa());

            } else if (evt.getSource() == jButtonPararSimu) {
                aumentar_contadorGen(threadCanvas.getContador_gen());
                jdv.setMapa(threadCanvas.DetenerHilo());
                sincronizarMapas();
                cambiarBotonesHilo(true);
                aumentar_contadorGen(0);
                
            } else if (evt.getSource() == jButtonGuardar) {
                sincronizarMapas();
                
                String ruta = fileRouteReader();
                if(!IOFile.GuardarMapa(jdv.getMapa(), ruta)){
                    System.out.println("Error guardando el mapa");
                    //throw new Exception();  // Dejar esto así?
                }else{
                    System.out.println("Mapa guardado con exito!"); //FALSISIMO, ajustar throw 
                }
                
            } else if (evt.getSource() == jButtonCargar) {
                
                String ruta = fileRouteReader();
                Malla mapa_leido = IOFile.leerMapa(ruta);
                if(mapa_leido == null){
                    System.out.println("Error cargando el mapa");
                    //throw new Exception();  // Dejar esto así?
                }else{
                    jdv.setMapa(mapa_leido);
                    sincronizarMapas();
                    System.out.println("Mapa cargado con exito!");
                }
            } else if (evt.getSource() == jButtonBorrar) {
                jdv.getMapa().borrar();
                aumentar_contadorGen(-1);
                sincronizarMapas();
                
            }else if(evt.getSource() == jButtonPapas){
                dialogoPapas();
                
            } else if (evt.getSource() == jButtonMusica) {
                if(musica == false){
                    playMusica(1);
                }else{
                    stopMusica();
                }   
            }else{
                System.out.println("Esta accion no esta definida"); //sustituir con throw
            }
        }

        @Override
        public void itemStateChanged(ItemEvent evt) {
            
            if(evt.getSource() == jComboBoxVelocidades){
                String texto = (String)jComboBoxVelocidades.getSelectedItem();
                    switch (texto) {
                        case "x1":
                                try{
                                threadCanvas.SetVelocidad((int)(DEFAULT_SPEED));   
                                }catch(Exception e){};
                            break;
                        case "x2":
                                try{
                                threadCanvas.SetVelocidad((int)(DEFAULT_SPEED/2));   
                                }catch(Exception e){};
                            break;
                        case "x6":
                                try{
                                threadCanvas.SetVelocidad((int)(DEFAULT_SPEED/6));   
                                }catch(Exception e){};
                            break;
                        case "x0.5":
                                try{
                                threadCanvas.SetVelocidad((int)(DEFAULT_SPEED/0.5));   
                                }catch(Exception e){};
                            break;
                    } 
            }else if(evt.getSource() == jComboBoxColumnas){
                sel_columnas = Integer.parseInt((String)jComboBoxColumnas.getSelectedItem());
            
            }else if(evt.getSource() == jComboBoxFilas){
                sel_filas = Integer.parseInt((String)jComboBoxFilas.getSelectedItem());
            }
            
        }
        
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3 && canvasMalla.dentroLimites(evt.getX(), evt.getY()) == true) {
                setPopUpCoor(evt.getX(), evt.getY());
                menuPatrones.show(canvasMalla ,evt.getX(), evt.getY());
            }
            
            if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1 && ejecutando == false && canvasMalla.dentroLimites(evt.getX(), evt.getY()) == true) {
                
                int coor_x = canvasMalla.getPositionInMap_X(evt.getX());
                int coor_y = canvasMalla.getPositionInMap_Y(evt.getY());
                
                if(jdv.getMapa().getCels_fromMalla(coor_y, coor_x).estado == true)
                    jdv.getMapa().setCels_fromMalla(coor_y, coor_x, false);
                else
                    jdv.getMapa().setCels_fromMalla(coor_y, coor_x, true);
                
                sincronizarMapas();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {{}
        }

        @Override
        public void mouseReleased(MouseEvent e) {{}
        }

        @Override
        public void mouseEntered(MouseEvent e) {{}
        }

        @Override
        public void mouseExited(MouseEvent e) {{}
        }
        
        @Override
        public void windowClosing(WindowEvent e){
            String respuesta = dialogoPreguntar();
            switch(respuesta){
                case "si":
                    cerrarAplicacion();
                    break;
                case "no":
                    break;
                case "a":
                    playMusica(0);
                    break;
                    
            }
        }
        
        public void insertarPatron(int id){
            
            System.out.println("Posicion indice: "+ indice_x + " " + indice_y);
            jdv.getMapa().addPatron(indice_y, indice_x, id);
            sincronizarMapas();
        }

    }
    
    public void playMusica(int id){
        //AudioClip Sound = null;
        //Cuando termine la musica llamar a la funcion stopMusica()
        
        try{
            
            if(id == 0){
                Sound = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/a.wav"));
                Sound.play();
                this.musica = true;
                this.jButtonMusica.setText("Modo musica: on");
            }

            if(id == 1){
                Sound = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/HeroeCelular.wav"));
                Sound.play();
                this.musica = true;
                this.jButtonMusica.setText("Modo musica: on");
            }
            
        }catch(Exception exc){
            exc.printStackTrace();
        }
    
    }
    
    public void stopMusica(){
    
        Sound.stop();
        this.musica = false;
        this.jButtonMusica.setText("Modo musica: off");
    }
    
    public void dialogoPapas(){
        VentanillaDialogo ventanaDiag = new VentanillaDialogo(this, true, 1);
        ventanaDiag.setVisible(true);
    }
    
    public String dialogoPreguntar(){
        VentanillaDialogo ventanaDiag = new VentanillaDialogo(this, true, 0);
        ventanaDiag.setVisible(true);
        String respuesta = ventanaDiag.resultado();
        System.out.println("respuesta: "+ respuesta);
        return respuesta;
    }
    
    public void setPopUpCoor(int x, int y){
        this.indice_x = canvasMalla.getPositionInMap_X(x);
        this.indice_y = canvasMalla.getPositionInMap_Y(y);
    }
    
    public void cambiarBotonesHilo(boolean state){
        this.jButtonIniciarSimu.setEnabled(state);
        this.jButtonRedim.setEnabled(state);
        this.jButtonUnPaso.setEnabled(state);
        this.jButtonCargar.setEnabled(state);
        this.jButtonGuardar.setEnabled(state);
        this.jButtonBorrar.setEnabled(state);
        
        if(!state){
            ejecutando = true;
            jLabelGeneracion.setText("Simulando...");
            jLabelNumGen.setVisible(false);
            this.canvasMalla.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        }else{
            ejecutando = false;
            jLabelGeneracion.setText("Generación:");
            jLabelNumGen.setVisible(true);
            this.canvasMalla.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }
    
    public void sincronizarMapas(){
        canvasMalla.setMapa(jdv.getMapa());
        canvasMalla.repaint();
    }
    
    public void aumentar_contadorGen(int n){
        if (n == -1)
            num_generacion = 0;
        else
            num_generacion = num_generacion + n;
        jLabelNumGen.setText(Integer.toString(num_generacion));
    }
    
    public void cerrarAplicacion(){
        System.exit(0);
    }
    
    public String fileRouteReader(){
    
        JFileChooser fc = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "txt");
        fc.setFileFilter(filtro);
        String directoryName = System.getProperty("user.dir");
        fc.setCurrentDirectory(new File(directoryName));
        fc.showDialog(fc, "Seleccionar");
        if(fc.getSelectedFile() != null){
            System.out.println("PATH" + fc.getSelectedFile().getPath());
            return fc.getSelectedFile().getPath();
        }else{
            System.out.println("ERROR: Leyendo ruta");
            return null;    //Lanzar excepcion
        }
    }
    
    private Icon getIcon(String ruta, int width, int heigth){
        Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(width, heigth, 4));
        return miIcono;       
    }

    //Las declaraciones
    private final int DEFAULT_SPEED = 1000;
    private AudioClip Sound = null;
    private final int default_x = 20;
    private final int default_y = 20;
    private JuegoDeLaVida jdv;
    private int sel_columnas = default_x;
    private int sel_filas = default_y;
    private Mipanel canvasMalla;
    private MenuContextual menuPatrones;
    private int num_generacion;
    private Hilo threadCanvas;
    private int indice_x;
    private int indice_y;
    private boolean musica = false;
    private boolean ejecutando = false;
    private javax.swing.JButton jButtonUnPaso;
    private javax.swing.JButton jButtonIniciarSimu;
    private javax.swing.JButton jButtonPararSimu;
    private javax.swing.JButton jButtonRedim;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonMusica;
    private javax.swing.JButton jButtonPapas;
    private javax.swing.JPanel jPanelIzquierdo;
    private javax.swing.JPanel jPanelDerecho;
    private javax.swing.JPanel jPanelMapa;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JComboBox<String> jComboBoxVelocidades;
    private javax.swing.JComboBox<String> jComboBoxColumnas;
    private javax.swing.JComboBox<String> jComboBoxFilas;
    private javax.swing.JLabel jLabelGeneracion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelVelocidad;
    private javax.swing.JLabel jLabelPasoPaso;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenuAjustes;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JLabel jLabelNumGen;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
}
