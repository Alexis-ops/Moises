package moises.ets;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class triangulo extends JFrame{
     public JPanel panel;
    
    public triangulo(){
        setSize(500,500); //tamaño de la ventana
        
        iniciarComponentes3();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes3(){
        
        colocarPaneles3();
        colocarEtiquetas3();
        colocarBotones3();
        colocarCajasTexto1();
        
    }
    private void colocarPaneles3(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void colocarEtiquetas3(){
        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel();
        JLabel etiqueta3 = new JLabel();
        JLabel etiqueta4 = new JLabel();
        JLabel etiqueta5 = new JLabel("Perímetro:",SwingConstants.RIGHT);
        JLabel etiqueta6 = new JLabel("Área:",SwingConstants.RIGHT);
        JLabel etiqueta7 = new JLabel();
        JLabel etiqueta8 = new JLabel();
        
        etiqueta.setText("Triángulo");
        etiqueta.setBounds(200,20,200,50);
        etiqueta.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta);
        
        etiqueta2.setText("Lado A:");
        etiqueta2.setBounds(80,90,50,20);
        etiqueta2.setFont(new Font("arial",Font.PLAIN,12));
        panel.add(etiqueta2);
        
        etiqueta3.setText("Lado B:");
        etiqueta3.setBounds(80,115,50,20);
        etiqueta3.setFont(new Font("arial",Font.PLAIN,12));
        panel.add(etiqueta3);
        
        etiqueta4.setText("Lado C:");
        etiqueta4.setBounds(80,140,50,20);
        etiqueta4.setFont(new Font("arial",Font.PLAIN,12));
        panel.add(etiqueta4);
        
        //etiqueta5.setText();
        etiqueta5.setBounds(80,180,100,20);
        etiqueta5.setFont(new Font("arial",Font.PLAIN,12));
        panel.add(etiqueta5);
        
        //etiqueta6.setText("Área:");
        
        etiqueta6.setBounds(80,200,100,20);
        etiqueta6.setFont(new Font("arial",Font.PLAIN,12));
        panel.add(etiqueta6);
    }
    
    private void colocarBotones3(){
        JButton boton1 = new JButton("Calcular");
        boton1.setBounds(100,400,100,40);
        boton1.setEnabled(true);
        panel.add(boton1);
        
        JButton boton2 = new JButton("Regresar al menú");
        boton2.setBounds(250,400,200,40);
        boton2.setEnabled(true);
        panel.add(boton2);
    }
    private void colocarCajasTexto1(){
        JTextField cajaTexto1 = new JTextField();
        JTextField cajaTexto2 = new JTextField();
        JTextField cajaTexto3 = new JTextField();
        
        cajaTexto1.setBounds(130, 140, 150, 20);
        panel.add(cajaTexto1);
        cajaTexto2.setBounds(130, 115, 150, 20);
        panel.add(cajaTexto2);
        cajaTexto3.setBounds(130, 90, 150, 20);
        panel.add(cajaTexto3);
    }
}
