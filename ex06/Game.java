import java.util.*;
public class Game{
    private int play1;
    private int play2;
    private int maxslot;
    private int turn;
    private Dice dice1;
    private Dice dice2;
    public Game (int Max_slot){
        play1 = 0;
        play2 = 0;
        maxslot = Max_slot;
        turn = 1;
        dice1 = new Dice(maxslot);
        dice2 = new Dice(maxslot);
    }
    private void walk(int slot){
        if(turn == 1){
            play1 = play1 + slot;
        }
        else if(turn == 2){
            play2 = play2 + slot;
        }
        if(play1 >= maxslot){
            System.out.println("Play1 WIN!");
        }
        else if(play2 >= maxslot){
            System.out.println("Play2 WIN!");
        }
    }
    public boolean isEnded(){
        return (play1 >= maxslot || play2 >= maxslot);
    }
    
    public void play(){
        dice1.roll();
        dice2.roll();
        walk(dice1.getval() + dice2.getval());
        if(dice1.getval() != dice2.getval());
        changeturn();
    }
    private void changeturn(){
        turn = turn == 1 ? 2 : 1;
    }
}