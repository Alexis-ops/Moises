package moises.ets;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class triangulo extends JFrame{
    public JPanel panel;
    public JLabel etiquetaP;
    public JLabel etiquetaA;
    private JTextField cajaTexto1;
    private JTextField cajaTexto2;
    private JTextField cajaTexto3;
    
    public triangulo(){
        setSize(500,500); //tamaño de la ventana
        
        iniciarComponentes3();
        num(cajaTexto1);
        num2(cajaTexto2);
        num3(cajaTexto3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void num(JTextField a){
        a.addKeyListener(new KeyAdapter(){
         @Override
         public void keyTyped(KeyEvent e){
             char c = e.getKeyChar();
             if(!Character.isDigit(c) && c!= '.'){
                 e.consume();
             }
             if(c == '.' && cajaTexto1.getText().contains(".")){
                 e.consume();
             }
         }
        });
    }
    private void num2(JTextField a){
        a.addKeyListener(new KeyAdapter(){
         @Override
         public void keyTyped(KeyEvent e){
             char c = e.getKeyChar();
             if(!Character.isDigit(c) && c!= '.'){
                 e.consume();
             }
             if(c == '.' && cajaTexto2.getText().contains(".")){
                 e.consume();
             }
         }
        });
    }
    private void num3(JTextField a){
        a.addKeyListener(new KeyAdapter(){
         @Override
         public void keyTyped(KeyEvent e){
             char c = e.getKeyChar();
             if(!Character.isDigit(c) && c!= '.'){
                 e.consume();
             }
             if(c == '.' && cajaTexto3.getText().contains(".")){
                 e.consume();
             }
         }
        });
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
        etiquetaP = new JLabel();
        etiquetaA = new JLabel();
        
        
        
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
        
        //etiquetaP.setText("NOSE QUE HAGO");
        etiquetaP.setBounds(180,180,100,20);
        etiquetaP.setFont(new Font("arial",Font.PLAIN,12));
        panel.add(etiquetaP);
        
        etiquetaA.setBounds(180,200,100,20);
        etiquetaA.setFont(new Font("arial",Font.PLAIN,12));
        panel.add(etiquetaA);
    }
    private void colocarCajasTexto1(){
        cajaTexto1 = new JTextField();
        cajaTexto2 = new JTextField();
        cajaTexto3 = new JTextField();
        
        cajaTexto1.setBounds(130, 140, 150, 20);
        panel.add(cajaTexto1);
        
        cajaTexto2.setBounds(130, 115, 150, 20);
        panel.add(cajaTexto2);
        cajaTexto3.setBounds(130, 90, 150, 20);
        panel.add(cajaTexto3);
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
        //eventos
        ActionListener oyente1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double area, perimetro,lado1,lado2,lado3;
               
                lado1=Double.valueOf(cajaTexto1.getText());
                lado2=Double.valueOf(cajaTexto2.getText());
                lado3=Double.valueOf(cajaTexto3.getText());
                perimetro = lado1 + lado2 + lado3;
                area = Math.sqrt(perimetro*(perimetro-lado1)*(perimetro-lado2)*(perimetro-lado3));
                
                if(lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ){
                    JOptionPane.showMessageDialog(null, "Error, no se permiten numero <= 0");
                }else{
                   etiquetaP.setText(String.valueOf(perimetro));
                    etiquetaA.setText(String.valueOf(area));    
                }
                 
             }
             
        };
        boton1.addActionListener(oyente1);
        
        ActionListener oyente2;
        oyente2 = (ActionEvent e) -> {
            ventana2 abrir = new ventana2();
            abrir.setVisible(true);
            this.setVisible(false);
        };
        boton2.addActionListener(oyente2);
    }
    
}
