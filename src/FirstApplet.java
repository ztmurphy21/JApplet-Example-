

import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JLabel;

/**
 *
 * @author Zachary Murphy
 */
public class FirstApplet extends JApplet {

  
    public void init() {
        //create label
        JLabel label = new JLabel ("This is my first applet.");
        //set the layout manager
        setLayout(new FlowLayout());
        //add the label to content pane
        add(label);
        
    }

}
