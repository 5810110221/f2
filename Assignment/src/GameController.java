import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameController implements PlayerListener {
  private Board board;
  private Dice d1 = new Dice();
  private Dice d2 = new Dice();

  private Player p1;
  private Player p2;
  private String p1_name = "P1";
  private String p2_name = "P2";
  private Player currentPlayer;
  private Player winner = null;
  private List<Sprite> players = new ArrayList<>();

  private List<GameSpriteListener> spriteListeners = new ArrayList<>();
  private List<GameControlListener> controlListeners = new ArrayList<>();

  private static GameController instance;
  public static GameController getInstance(){
    if(instance == null){
      instance = new GameController();
    }
    return instance;
  }

  private GameController() {
    board = new Board(80);

    p1Name = (String)JOptionPane.showInputDialog(
        null,"\"Input Player1 name?\"","Name",
        JOptionPane.PLAIN_MESSAGE,null,null,"Player1");

    p2Name = (String)JOptionPane.showInputDialog(
        null,"\"Input Player2 name?\"","Name",
        JOptionPane.PLAIN_MESSAGE,null,null,"Player2");

    p1 = new Player(p1Name, 0, board, this);
    p2 = new Player(p2Name, 1, board, this);
    currentPlayer = p1;
    
    players.add(p1);
    players.add(p2);    
  }

  private void rollDice() {
    d1.roll();
    d2.roll();
  }

  public void takeTurn() {
    if(winner != null){
     JFrame endGamePopup = new JFrame();
     JOptionPane.showMessageDialog(endGamePopup, winner + " is WINNER!!!");
      return;
    }

    rollDice();
    int faceD1 = d1.getFace();
    int faceD2 = d2.getFace();

    if(faceD1 == 2 && faceD2 == 2){
      currentPlayer.walk(0);
      System.out.println(currentPlayer.getName() + " getFace to same!" + " ,You must stop walk!!");
    }
    else if(faceD1 == 4 && faceD2 == 4){
      currentPlayer.walk(0);
      System.out.println(currentPlayer.getName() + " getFace to same!" + " ,You must stop walk!!");
    }
    else if(faceD1 == 6 && faceD2 == 6){
      currentPlayer.walk(0);
      System.out.println(currentPlayer.getName() + " getFace to same!" + " ,You must stop walk!!");
    }
    
    else{
    currentPlayer.walk(d1.getFace() + d2.getFace());
    }
  }

  private void changeTurn() {
    if (currentPlayer == p1)
      currentPlayer = p2;
    else
      currentPlayer = p1;
  }

  @Override
  public void walking(Player owner){
    notifyGamePlayEnabled(false);
    for(GameSpriteListener listener : spriteListeners){
      listener.spriteUpdated();
    }
  }

  @Override
  public void walkCompleted(Player onwer) { 
    changeTurn();
    notifyGamePlayEnabled(true);
  }

  @Override
  public void hasWon(Player owner) {
    if (winner == null) { // first winner only
      winner = owner;
      System.out.println( winner + " is a winner"); //who is winner
    }
  }

  public Player getWinner() {
    return winner;
  }

  public Player getCurrentPlayer() {
    return currentPlayer;
  }

  public List<Sprite> getSprites(){
    return players;
  }

  public void addSpriteListener(GameSpriteListener listener){
    spriteListeners.add(listener);
  }

  public void addControlListener(GameControlListener listener){
    controlListeners.add(listener);
  }

  public void notifyGamePlayEnabled(boolean enabled){
    for(GameControlListener listener : controlListeners){
      listener.changeGamePlayEnabled(enabled);
    }
  }

}