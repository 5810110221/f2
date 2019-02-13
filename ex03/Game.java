public class Game{
    private int player1,player2,count;
    public Game(int a){
        count = a;
        player1 = 0;
        player2 = 0;
    }
    public void walk(int b,int num){
        if(num == 1)
            player1 += b;
        else if(num == 2)
            player2 += b;
        if(player1 >= count)
            System.out.println("player1 win!");
        if(player2 >= count)
            System.out.println("player2 win!");
    }
    public int getPlayer(){
        return player1;
    }
    public void setPlayer1(int player1){
        this.player1 = player1;
    }
}