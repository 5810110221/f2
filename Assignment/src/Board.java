import java.awt.Point;
import java.util.HashMap;

public class Board {  
  private int finishPos;
  private HashMap<Integer, Integer> tunnels = new HashMap<>();

  public Board(int finishPos) {
    this.finishPos = finishPos;
    prepareTunnels();
  }

  public int getFinishPos() {
    return finishPos;
  }

  public Integer getTunnelOutPos(int pos){
    return tunnels.get(pos);
  }

  public Point getRefLocationForPos(int pos){
    //800*500
    int row = ((pos - 1) / 10);
    int x;    
    if(row % 2 == 1){
      x = 82 * ((pos - 1) % 10);
    }else{
      x = 820 - ((pos - (row * 10)) * 82);
    }
    return new Point(x,  448 - (row * 64));
  }

  private void prepareTunnels(){
    tunnels.put(38, 3);
    tunnels.put(10, 30);
    tunnels.put(16, 36);
    tunnels.put(31, 13);
    tunnels.put(28, 49);
    tunnels.put(65, 26);
    tunnels.put(22, 42);
    tunnels.put(44, 63);
    tunnels.put(78, 60);
    tunnels.put(54, 74);
    tunnels.put(68, 50);
    
    
  }
}