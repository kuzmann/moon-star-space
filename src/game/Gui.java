package game;

import javax.swing.*;

/**
 * This class provides the graphical user interface and interaction methods.
 */

public class Gui {


    JFrame gameframe;
    //Objekt der Klasse Draw
    Draw draw;

    //Button für die Bedienung (9 Stück)
    static JButton button[] = new JButton[9];

    public Gui() {
        gameframe = new JFrame();
        gameframe.setTitle("Moon-Star-Space");
        gameframe.setSize(800,600);
        gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameframe.setLocationRelativeTo(null);
        gameframe.setResizable(false);

        draw = new Draw();
        draw.setBounds(0,0,800,800);
        draw.setVisible(true);
        gameframe.add(draw);

        //Sichtbar machen
        gameframe.setVisible(true);


        //Creation of the buttons
        for(int i = 0; i<button.length; i++){
            button[i] = new JButton();
            button[i].setVisible(true);
            button[i].addActionListener(new Controller());
            button[i].setFocusPainted(false);
            button[i].setContentAreaFilled(false);
            button[i].setBorder(null);
            gameframe.add(button[i]);
        }




    }
}
