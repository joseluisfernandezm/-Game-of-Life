package es.uam.eps.poo.juegodelavida;

import java.awt.Color;

public class VentanillaDialogo extends javax.swing.JDialog {

    private String resultado = "no";

    public VentanillaDialogo(java.awt.Frame parent, boolean modal, int uso) {
        super(parent, modal);
        if(uso == 0)
            initComponents_cerrar();
        if(uso == 1)
            initComponents_papas();
    }
    

    String resultado() {
        return resultado;
    }

    private void initComponents_cerrar() {
        jPanel1 = new javax.swing.JPanel();
        jButtonSi = new javax.swing.JButton();
        jButtonNo = new javax.swing.JButton();
        jButtona = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Seleccionar una opción");
        
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        
        jButtonSi.setText("Sí");
        jPanel1.add(jButtonSi);
        jButtonSi.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonNo.setText("No");
        jPanel1.add(jButtonNo);
        jButtonNo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtona.setText("a");
        jPanel1.add(jButtona);
        jButtona.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Confirme!");
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);
        
        pack();
    }

    private void initComponents_papas() {
        jPanel1 = new javax.swing.JPanel();
        jButtonSi = new javax.swing.JButton();
        jButtonNo = new javax.swing.JButton();
        jButtona = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Los padres de este super juego");
        
        jLabel1.setBackground(new java.awt.Color(101, 193, 210));
        jPanel1.setBackground(new java.awt.Color(101, 193, 210));
        
        jPanel1.setBorder(new javax.swing.border.LineBorder(Color.MAGENTA));
        
        jButtonSi.setText("Son Guapisimos");
        jPanel1.add(jButtonSi);
        jButtonSi.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                dispose();
            }
        });

        jButtonNo.setText("Les voy a poner un 10");
        jPanel1.add(jButtonNo);
        jButtonNo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                dispose();
            }
        });
        
        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("José Luis Fernández & Rubén Ramos Gil");
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);
        
        pack();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource() == this.jButtonSi){
            this.resultado = "si";
            setVisible(false);
        }else if(evt.getSource() == this.jButtonNo){
            this.resultado = "no";
            setVisible(false);
        }else if(evt.getSource() == this.jButtona){
            System.out.println("a");
            this.resultado = "a";
            setVisible(false);
        }
        this.dispose();
    }
    
    private javax.swing.JButton jButtonNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jButtonSi;
    private javax.swing.JButton jButtona;
    private javax.swing.JPanel jPanel1;

}
