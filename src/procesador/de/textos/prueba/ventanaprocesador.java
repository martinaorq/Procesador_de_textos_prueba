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
public class ventanaprocesador extends JPanel {
    JTextArea text;
    JPanel panelarriba;
    JMenuBar barraarriba;
    JMenu archivo;
    barraprocesador menuuu;
    JPanel paneltexto;
    public ventanaprocesador(){
        
        setLayout(new BorderLayout());
        
        //Instanciando variables.........
            panelarriba=new JPanel();
            text=new JTextArea();
            menuuu=new barraprocesador();
        //FIN instanciando variables
        
        //JPanel panelarriba:
            panelarriba.setLayout(new BorderLayout());
            
            paneltexto=new JPanel();
            paneltexto.setLayout(new BorderLayout());
            paneltexto.add(text, BorderLayout.CENTER);
            paneltexto.add(menuuu,BorderLayout.NORTH);
            
            add(panelarriba,BorderLayout.NORTH);
            
            add(paneltexto, BorderLayout.CENTER);
        
        
        
        //--------------Barra arriba----------------
        barraarriba=new JMenuBar();
        archivo=new JMenu("Archivo");
        
        barraarriba.add(archivo);
        
        
        crearelementosbarra(archivo,"Guardar",new ImageIcon("Imagenes/guardar.png"));
        crearelementosbarra(archivo,"Nuevo",new ImageIcon("Imagenes/nuevo.png"));
        crearelementosbarra(archivo,"Abrir",new ImageIcon("Imagenes/abrir.png"));
        crearelementosbarra(archivo,"Guardar como...",new ImageIcon("Imagenes/guardarcomo.png"));
        
        panelarriba.setBackground(Color.LIGHT_GRAY);
        panelarriba.add(barraarriba,BorderLayout.WEST);
        //------------------------------------------
        //FIN JPanel panelarriba
        
        
        
    }
    
    
    public void crearelementosbarra(JMenu menu,String tituloelemento, Icon imageIcon){
        JMenuItem menuitem=new JMenuItem(tituloelemento, imageIcon);
        menu.add(menuitem);
    }
    
    
    
}
