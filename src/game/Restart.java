package game;

/**
 * This class check, if all buttons have been clicked
 */

public class Restart {

    public static void reset(){

        for(int i = 0; i < Gui.state.length; i++){
            Gui.state[i] = 0; //reset all fields/buttons
        }
        Gui.player = 0;
        Gui.winner = 0; //No winner at start
    }
}
