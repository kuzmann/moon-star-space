package game;

import javax.swing.*;

/**
 * This class provides the graphical user interface and interaction methods.
 */

public class Gui {


    JFrame gameframe;
    //Objekt der Klasse Draw
    Draw draw;

    public Gui() {
        gameframe = new JFrame();
        gameframe.setTitle("Moon-Star-Space");
        gameframe.setSize(800,800);
        gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameframe.setLocationRelativeTo(null);
        gameframe.setResizable(false);

        draw = new Draw();
        draw.setBounds(0,0,800,800);
        draw.setVisible(true);
        gameframe.add(draw);

        //Sichtbar machen
        gameframe.setVisible(true);




    }
}
