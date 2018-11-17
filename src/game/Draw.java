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
        g.setColor(new Color(24,4,114));
        g.fillRect(0,0,800,600);

        g.setColor(Color.WHITE);
        ((Graphics2D) g).setBackground(new Color(28, 4, 137));

        //vertical line
        g.drawLine(325, 50, 325, 500);
        g.drawLine(475, 50, 475, 500);

        //horizontal line
        g.drawLine(175, 200, 625, 200);
        g.drawLine(175, 350, 625, 350);

        //Player information*/
        //g.setColor(Color.BLUE);
        if(Gui.player == 0){
            g.drawString("Player: Moon", 25,50);
        } else if(Gui.player == 1){
            g.drawString("Player: Star", 25,50);
        }

        /*Winner information*/
        //g.setColor(Color.BLUE);
        if(Gui.winner == 1){
            g.drawString("Winner: Moon", 25,100);
        } else if(Gui.winner == 2){
            g.drawString("Winner: Star", 25,100);
        }

        // Row 1
        if (Gui.state[0] == 1) {
            g.drawImage(ImageLoader.moon, 175, 50, 150, 150, null);
        } else if (Gui.state[0] == 2) {
            g.drawImage(ImageLoader.star, 175, 50, 150, 150, null);
        }

        if (Gui.state[1] == 1) {
            g.drawImage(ImageLoader.moon, 325, 50, 150, 150, null);
        } else if (Gui.state[1] == 2) {
            g.drawImage(ImageLoader.star, 325, 50, 150, 150, null);
        }

        if (Gui.state[2] == 1) {
            g.drawImage(ImageLoader.moon, 475, 50, 150, 150, null);
        } else if (Gui.state[2] == 2) {
            g.drawImage(ImageLoader.star, 475, 50, 150, 150, null);
        }

        // Row 2
        if (Gui.state[3] == 1) {
            g.drawImage(ImageLoader.moon, 175, 200, 150, 150, null);
        } else if (Gui.state[3] == 2) {
            g.drawImage(ImageLoader.star, 175, 200, 150, 150, null);
        }

        if (Gui.state[4] == 1) {
            g.drawImage(ImageLoader.moon, 325, 200, 150, 150, null);
        } else if (Gui.state[4] == 2) {
            g.drawImage(ImageLoader.star, 325, 200, 150, 150, null);
        }

        if (Gui.state[5] == 1) {
            g.drawImage(ImageLoader.moon, 475, 200, 150, 150, null);
        } else if (Gui.state[5] == 2) {
            g.drawImage(ImageLoader.star, 475, 200, 150, 150, null);
        }

        // Row 3
        if (Gui.state[6] == 1) {
            g.drawImage(ImageLoader.moon, 175, 350, 150, 150, null);
        } else if (Gui.state[6] == 2) {
            g.drawImage(ImageLoader.star, 175, 350, 150, 150, null);
        }

        if (Gui.state[7] == 1) {
            g.drawImage(ImageLoader.moon, 325, 350, 150, 150, null);
        } else if (Gui.state[7] == 2) {
            g.drawImage(ImageLoader.star, 325, 350, 150, 150, null);
        }

        if (Gui.state[8] == 1) {
            g.drawImage(ImageLoader.moon, 475, 350, 150, 150, null);
        } else if (Gui.state[8] == 2) {
            g.drawImage(ImageLoader.star, 475, 350, 150, 150, null);
        }

        repaint();  //for actualisation









    }

}
