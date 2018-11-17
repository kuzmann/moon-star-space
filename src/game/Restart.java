package game;

public class Restart {

    public static void reset(){

        for(int i = 0; i<Gui.state.length; i++){
            Gui.state[i] = 0;
        }

    }

}
