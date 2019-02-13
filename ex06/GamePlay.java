import java.util.*;
public class GamePlay{
    public static void main(String []args){
        Game g = new Game(30);
        while (!g.isEnded()){
            g.play();
        }
    }
}