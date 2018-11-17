package game;


import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Draw extends JLabel {

    private static final long serialVersionUID = 1L;


    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        //DRAW//

        g.setColor(Color.yellow);


        //vertical line
        g.drawLine(325, 50, 325, 500);
        g.drawLine(475, 50, 475, 500);

        //horizontal line
        g.drawLine(175, 200, 625, 200);
        g.drawLine(175, 350, 625, 350);

        /* Draw Player
        g.setColor(Color.yellow);
        if(Gui.player == 0){
            g.drawString("Spieler: X", 25, 50);
        }else if(Gui.player == 1){
            g.drawString("Spieler: O", 25, 50);
        }*/
    }

}
