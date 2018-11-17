import javax.swing.*;

/**
 * This class provides the graphical user interface and interaction methods.
 */

public class Gui {


    JFrame gameframe;

    public Gui(){
        gameframe = new JFrame();
        gameframe.setTitle("Moon-Star-Space");
        gameframe.setSize(800,800);
        gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameframe.setLocationRelativeTo(null);
        gameframe.setResizable(false);

        //Sichtbar machen
        gameframe.setVisible(true);


    }
}
