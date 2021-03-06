   import java.awt.event.*;

/**
 * Game2048Listener class manages user inputs. It implements KeyListener class
 */
    public class Game2048Listener implements KeyListener
   {
      private Game2048GUI gui;
      private Game2048 game;
   
   /**
    * Constructs the Game2048Listener object by taking in the <i>game</i> and the <i>gui</i>.
    *
    * @param _game		The game object that contains the logic.
    * @param _gui		The GUI object of the game.
    */     
       public Game2048Listener (Game2048 _game, Game2048GUI _gui)
      {
         game =_game;
         gui = _gui;
         gui.addListener (this);
      }
   
   /**
    * Overriding the keyPressed method from KeyListener class. Invoked when a key has been pressed. See the class description for KeyEvent for a definition of a key pressed event.
    *
    * @param e			Contains the event from the user's keyboard input.
    */     
       public void keyPressed(KeyEvent e)
      {
      // If game is over, the game will not allow any input to provoke anything.
      //		if( !game.isGameOver() && !game.isWon() )
      //		{
         int direction = -1;
         int key = e.getKeyCode();
        
         if( key == KeyEvent.VK_LEFT)
         {
            direction = Game2048.LEFT_INPUT; 
         }
         else if( key == KeyEvent.VK_DOWN)
         {
            direction = Game2048.DOWN_INPUT; 
         }
         else if( key == KeyEvent.VK_RIGHT)
         {
            direction = Game2048.RIGHT_INPUT; 
         }
         else if( key == KeyEvent.VK_UP)
         {
            direction = Game2048.UP_INPUT; 
         }
        
         game.play(direction); 
      
      }
   
   /**
    * Overriding the keyReleased method from KeyListener class. Invoked when a key has been released. See the class description for KeyEvent for a definition of a key released event.
    *
    * @param e			Contains the event from the user's keyboard input.
    */     	
       public void keyReleased(KeyEvent e)
      {
         game.newSlot();
      
      }
   
   /**
    * Overriding the keyTyped method from KeyListener class. Invoked when a key has been typed. See the class description for KeyEvent for a definition of a key typed event.
    *
    * @param e			Contains the event from the user's keyboard input.
    */  	
       public void	keyTyped(KeyEvent e)
      {
      }
   }
