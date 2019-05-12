import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Player extends Sprite {
  private static Color[] COLORS = {Color.BLUE, Color.RED };
  private String name;
  private int index;
  private Board board;
  private PlayerListener listener;
  private int currentPos = 0;

  public Player(String name, int index, Board board, PlayerListener listener) {
    this.name = name;
    this.index = index;
    this.board = board;
    this.listener = listener;
  }

  public void walk(int steps) {
    int next_position = Math.min(currentPos + steps, board.getFinishPos());
    System.out.println(this + " walks from " + currentPos + " to " + next_position); 
    new WalkerThread(next_position).start();
  } 
  

  public void doWalking(){
    listener.walking(this);
  }

  public void doWalkCompleted(){
    Integer tunnelOutPos = board.getTunnelOutPos(currentPos);
    if(currentPos == 4){
      currentPos = 70;
      System.out.println("Black Hole!!!!! ");
    }    
    if(currentPos == 8){
      currentPos = currentPos+4;
      System.out.println("You have Energy Drink! ");
    }    
    if(currentPos == 34){
      currentPos = currentPos+4;
      System.out.println("You have Energy Drink! ");
    }    
    if(currentPos == 37){
      currentPos = currentPos+4;
      System.out.println("You have Energy Drink! ");
    }
    if(currentPos == 53){
      currentPos = currentPos+4;
      System.out.println("You have Energy Drink! ");
    }  
    if(currentPos == 59){
      currentPos = currentPos+4;
      System.out.println("You have Energy Drink! ");
    }
    if(currentPos == 75){
      currentPos = currentPos+4;
      System.out.println("You have Energy Drink! ");
    }
    if(currentPos == 9){
      currentPos = 1;
      System.out.println("You hit Trap!!!");
    }
    if(currentPos == 15){
      currentPos = 1;
      System.out.println("You hit Trap!!!");
    }
    if(currentPos == 43){
      currentPos = 1;
      System.out.println("You hit Trap!!!");
    }
    if(currentPos == 47){
      currentPos = 1;
      System.out.println("You hit Trap!!!");
    }
    if(currentPos == 72){
      currentPos = 1;
      System.out.println("You hit Trap!!!");
    }
    if(currentPos == 77){
      currentPos = 1;
      System.out.println("You hit Trap!!!");
    }
    if(tunnelOutPos != null){
      System.out.println(this + " enter tunnel from " + currentPos + " to " + tunnelOutPos.intValue());
      currentPos = tunnelOutPos.intValue();
      listener.walking(this);
    }
    listener.walkCompleted(this);
    if(currentPos >= board.getFinishPos()) {      
      this.listener.hasWon(this);
      JFrame winnerPopup = new JFrame();
      JOptionPane.showMessageDialog(winnerPopup, this + " is WINNER!!!");
    }
  }
  @Override
  public void draw(Graphics2D g2d){
    if(currentPos > 0){
      g2d.setColor(COLORS[index]);
      Point ref = board.getRefLocationForPos(currentPos);
      g2d.fillOval(ref.x + 10 + (index * 40), ref.y + 30, 20, 20);
    }
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return getName();
  }  

  private class WalkerThread extends Thread {
    private int toPos;
    public WalkerThread(int toPos){
      this.toPos = toPos;
    } 
    public void run(){
      while(currentPos < toPos){
        currentPos ++;
        doWalking();
        try{ Thread.sleep(300); } catch(Exception e){}        
      }
      doWalkCompleted();
    }
  }
}