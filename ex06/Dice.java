public class Dice{
    private int score;
    public Dice(int slot){
        score = 1;
    }
    public void play(){
        score = (int)(Math.random() * 6 )+ 1;
    }
    public void roll(){
        score = score + score;
    }
    public int getval(){
        return score;
    }
}