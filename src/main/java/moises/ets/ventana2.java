
package moises.ets;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class ventana2 extends JFrame {
    public JPanel panel;
    
    public ventana2(){
        setSize(500,500); //tamaño de la ventana
        
        iniciarComponentes2();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes2(){
        
        colocarPaneles2();
        colocarEtiquetas2();
        colocarBotones2();
        
    }
    private void colocarPaneles2(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void colocarEtiquetas2(){
        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel();
        
        etiqueta.setText("Figuras Geometricas");
        etiqueta.setBounds(150,5,200,50);
        etiqueta.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta);
        
        etiqueta2.setText("Seleccione una opción");
        etiqueta2.setBounds(150,280,200,50);
        etiqueta2.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta2);
    }
    
    private void colocarBotones2(){
        JButton boton1 = new JButton("Triángulo");
        boton1.setBounds(200,80,100,40);
        boton1.setEnabled(true);
        panel.add(boton1);
        
        JButton boton2 = new JButton("Rectángulo");
        boton2.setBounds(200,130,100,40);
        boton2.setEnabled(true);
        panel.add(boton2);
        
        JButton boton3 = new JButton("Círculo");
        boton3.setBounds(200,180,100,40);
        boton3.setEnabled(true);
        panel.add(boton3);
        
        JButton boton4 = new JButton("Terminar");
        boton4.setBounds(200,230,100,40);
        boton4.setEnabled(true);
        panel.add(boton4);
        
          ActionListener oyente1;
        oyente1 = (ActionEvent e) -> {
            triangulo abrir = new triangulo();
            abrir.setVisible(true);
            this.setVisible(false);
        };
        boton1.addActionListener(oyente1);

        
         
        
    }
}
