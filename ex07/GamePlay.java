import java.util.*;
public class GamePlay{
    public static void main(String []args){
        Game g = new Game(30);
            g.addTunnel(5,8);
            g.addTunnel(12,15);
            g.addTunnel(7,1);
            g.addTunnel(28,16);
        while (!g.isEnded()){
            g.play();
        }
    }
}