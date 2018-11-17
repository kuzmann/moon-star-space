package game;


import java.util.Timer;
import java.util.TimerTask;

public class Evaluation {

    Timer checkCycle;

    public Evaluation(){

        checkCycle = new Timer();
        checkCycle.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Gui.winner == 0) {

                    // Row 1 for moon - horizontal
                    if (Gui.state[0] == 1 && Gui.state[1] == 1 && Gui.state[2] == 1) {
                        Gui.winner = 1;
                    }
                    // Row 2 for moon - horizontal
                    else if (Gui.state[3] == 1 && Gui.state[4] == 1 && Gui.state[5] == 1) {
                        Gui.winner = 1;
                    }

                    // Row 3 for moon - horizontal
                    else if (Gui.state[6] == 1 && Gui.state[7] == 1 && Gui.state[8] == 1) {
                        Gui.winner = 1;
                    }

                    // Row 1 for moon - vertical
                    else if (Gui.state[0] == 1 && Gui.state[3] == 1 && Gui.state[6] == 1) {
                        Gui.winner = 1;
                    }

                    // Row 2 for moon - vertical
                    else if (Gui.state[1] == 1 && Gui.state[4] == 1 && Gui.state[7] == 1) {
                        Gui.winner = 1;
                    }

                    // Row 3 for moon - vertical
                    else if (Gui.state[2] == 1 && Gui.state[5] == 1 && Gui.state[8] == 1) {
                        Gui.winner = 1;
                    }

                    // Cross left up - right under for moon
                    else if (Gui.state[0] == 1 && Gui.state[4] == 1 && Gui.state[8] == 1) {
                        Gui.winner = 1;
                    }

                    // Cross right up - left under for moon
                    else if (Gui.state[2] == 1 && Gui.state[4] == 1 && Gui.state[6] == 1) {
                        Gui.winner = 1;
                    }

                    ///////////////////////////////////////////////////////////////////////

                    // Row 1 or star - horizontal
                    if (Gui.state[0] == 2 && Gui.state[1] == 2 && Gui.state[2] == 2) {
                        Gui.winner = 2;
                    }
                    // Row 2 or star - horizontal
                    else if (Gui.state[3] == 2 && Gui.state[4] == 2 && Gui.state[5] == 2) {
                        Gui.winner = 2;
                    }

                    // Row 3 or star - horizontal
                    else if (Gui.state[6] == 2 && Gui.state[7] == 2 && Gui.state[8] == 2) {
                        Gui.winner = 2;
                    }

                    // Row 1 for star - Vertical
                    else if (Gui.state[0] == 2 && Gui.state[3] == 2 && Gui.state[6] == 2) {
                        Gui.winner = 2;
                    }

                    // Row 2 for star - Vertical
                    else if (Gui.state[1] == 2 && Gui.state[4] == 2 && Gui.state[7] == 2) {
                        Gui.winner = 2;
                    }

                    // Row 3 for star - Vertical
                    else if (Gui.state[2] == 2 && Gui.state[5] == 2 && Gui.state[8] == 2) {
                        Gui.winner = 2;
                    }

                    // Cross left up - right under for star
                    else if (Gui.state[0] == 1 && Gui.state[4] == 2 && Gui.state[8] == 2) {
                        Gui.winner = 2;
                    }

                    // Cross right up - left under for star
                    else if (Gui.state[2] == 1 && Gui.state[4] == 2 && Gui.state[6] == 2) {
                        Gui.winner = 2;
                    }
                }

            }
        }, 0, 150);

    }
}
