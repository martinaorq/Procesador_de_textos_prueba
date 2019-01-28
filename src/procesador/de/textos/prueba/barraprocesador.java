/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesador.de.textos.prueba;
import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
/**
 *
 * @author marti
 */
public class barraprocesador extends JPanel{
    JComboBox fuentes;
    JSpinner tamanos;
    Choice minusmayus;
    
    Box cajaarriba,cajaabajo,cajaprincipal;
    
    public barraprocesador(){
        cajaprincipal=Box.createVerticalBox();
        cajaarriba=Box.createHorizontalBox();
         cajaabajo=Box.createHorizontalBox();
        
        cajaarriba.add(new JLabel("Fuente:"));
        String[]nombresdefuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        fuentes=new JComboBox(nombresdefuentes);
        fuentes.setUI(new BasicComboBoxUI());
        fuentes.setBorder(new LineBorder(Color.GRAY,1));
        
        cajaarriba.add(fuentes);
        
        cajaarriba.add(Box.createHorizontalStrut(12));
        
        tamanos=new JSpinner(new SpinnerNumberModel(18, 1, 72, 1));
        cajaarriba.add(new JLabel("Tamaño:"));
        cajaarriba.add(tamanos);
        
        minusmayus=new Choice();
        minusmayus.add("minus y MAYUS");
        minusmayus.add("MAYÚSCULA");
        minusmayus.add("minúscula");
        
        cajaarriba.add(Box.createHorizontalStrut(12));
        
        cajaarriba.add(minusmayus);
        
        cajaarriba.add(Box.createHorizontalStrut(12));
        cajaarriba.add(new JSeparator(SwingConstants.VERTICAL));
        cajaarriba.add(Box.createHorizontalStrut(12));
        
        hacerboton("Izquierda",new ImageIcon("Imagenes/izq.png"));
        hacerboton("Justificado",new ImageIcon("Imagenes/justificado.png"));
        hacerboton("Derecha",new ImageIcon("Imagenes/der.png"));
        hacerboton("Centrado",new ImageIcon("Imagenes/centro.png"));
        
        cajaarriba.add(Box.createHorizontalStrut(12));
        cajaarriba.add(new JSeparator(SwingConstants.VERTICAL));
        cajaarriba.add(Box.createHorizontalStrut(12));
        
        cajaarriba.add(minusmayus);
        
       
        
        hacerboton2("Negrita",new ImageIcon("Imagenes/bold.png"));
        hacerboton2("Cursiva",new ImageIcon("Imagenes/italic.png"));
        hacerboton2("Subrayado",new ImageIcon("Imagenes/underline.png"));
        
        
        
        cajaprincipal.add(cajaarriba);
        cajaprincipal.add(cajaabajo);
        
        add(cajaprincipal);
        
       
        
        
        
        
        
    }
    public void hacerboton(String nombre,Icon imagen){
        JButton n=new JButton(imagen);
        
        n.setUI(new BasicButtonUI());
        cajaarriba.add(n);
    }
    public void hacerboton2(String nombre,Icon imagen){
        JButton n=new JButton(imagen);
        
        n.setUI(new BasicButtonUI());
        cajaabajo.add(n);
    }
}
