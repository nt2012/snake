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
    public void init(GameContainer gc, StateBasedGame sbg)
            throws SlickException {
        // TODO Set default variable values, and load assets here.
        
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
            throws SlickException {
        // TODO Draw sprites to the screen here!
        
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int arg)
            throws SlickException {
        // TODO Update all game objects, and get user input here.
        
    }

    @Override
    public int getID() {
        return stateID;
    }

}
