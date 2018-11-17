package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class provides the graphical user interface and interaction methods.
 */

public class Gui {


    JFrame gameframe;
    //Objekt der Klasse Draw
    Draw draw;
    //ResetButton to start a new game
    JButton resetButton;

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
            //Text nicht umrandet
            button[i].setFocusPainted(false);
            //Inhalt der Button sind nicht sichtbar
            button[i].setContentAreaFilled(false);
            //Ränder der Button sind nicht sichtbar
            button[i].setBorder(null);
            gameframe.add(button[i]);
        }

        //Start new game Button
        resetButton = new JButton("Reset");
        resetButton.setBounds(675, 500, 100, 40);
        resetButton.setVisible(true);
        resetButton.setBackground(new Color(51, 102, 153));
        resetButton.setForeground(Color.WHITE);
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Restart.reset();
            }
        });



    }
}
