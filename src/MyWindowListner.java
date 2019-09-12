
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sanket
 */
public class MyWindowListner extends WindowAdapter{

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
