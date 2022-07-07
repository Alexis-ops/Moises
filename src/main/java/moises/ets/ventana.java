/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moises.ets;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventana extends JFrame{
    public JPanel panel;
    public ventana(){
        setSize(500,500); //tamaño de la ventana
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        
    }
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel();
        
        
        etiqueta.setText("IPN - UPICSSA");
        etiqueta.setBounds(50,50,200,200);
        etiqueta.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta);
    }
    private void colocarBotones(){
        JButton boton1 = new JButton("Continuar");
        boton1.setBounds(200,200,100,40);
        boton1.setEnabled(true);
        panel.add(boton1);
        
        ActionListener oyente;
        oyente = (ActionEvent e) -> {
            ventana2 abrir = new ventana2();
            abrir.setVisible(true);
            this.setVisible(false);
        };
        boton1.addActionListener(oyente);
    }
    
}   
