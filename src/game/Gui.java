package game;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class provides the graphical user interface and interaction methods.
 */

public class Gui {


    /*Amount of Buttons*/ //TODO: die magische Zahl ) soll als Konstante definiert werden
    private static int btnAmount = 9;
    JFrame gameframe;
    //Objekt der Klasse Draw
    Draw draw;
    //ResetButton to start a new game
    JButton resetButton;

    //Buttons for each field
    static JButton button[] = new JButton[btnAmount];
    //for each Button a state
    static int state[] = new int[btnAmount];
    static int player = 0;
    static int winner = 0;
    //0 = kein Gewinneer

    public Gui() {
        gameframe = new JFrame();
        gameframe.setTitle("Moon-Star-Space");
        gameframe.setSize(800, 600);
        gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameframe.setLocationRelativeTo(null);
        gameframe.setResizable(false);
        //gameframe.setBackground(new Color(24,4,114));


        //Creation of the buttons
        for (int i = 0; i < button.length; i++) {
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

        ButtonPosition.position();

        //Start new game Button
        resetButton = new JButton("restart game");
        resetButton.setBounds(575, 500, 200, 40);
        resetButton.setVisible(true);
        //resetButton.setBackground(new Color(51, 102, 153));
        resetButton.setBackground(Color.WHITE);
        resetButton.setForeground(Color.BLUE);
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Restart.reset();
            }
        });

        gameframe.add(resetButton);

        draw = new Draw();
        draw.setBounds(0, 0, 800, 800);
        draw.setVisible(true);
        gameframe.add(draw);

        //Sichtbar machen
        gameframe.setVisible(true);

    }
}
