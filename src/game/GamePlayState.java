package game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class GamePlayState extends BasicGameState {
    
    int stateID = -1;
    
    GamePlayState( int stateID ) {
       this.stateID = stateID;
    }

    @Override
    public void init(GameContainer arg0, StateBasedGame arg1)
            throws SlickException {
        // TODO Set default variable values, and load assets here.
        
    }

    @Override
    public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2)
            throws SlickException {
        // TODO Draw sprites to the screen here!
        
    }

    @Override
    public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
            throws SlickException {
        // TODO Update all game objects, and get user input here.
        
    }

    @Override
    public int getID() {
        return stateID;
    }

}
