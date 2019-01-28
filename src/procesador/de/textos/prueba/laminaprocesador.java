/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesador.de.textos.prueba;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author marti
 */
public class laminaprocesador extends JFrame{
    public laminaprocesador(){
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,800,500);
        setTitle("Procesador de textos");
        
        ventanaprocesador v=new ventanaprocesador();
        add(v);
    }
}
