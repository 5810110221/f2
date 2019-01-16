public class Counter{
    private int val;
    private void counter(){
        val = 0;
    }
    public void inc() {
        val++;
    }
    public void reset(){
        val = 0;
    }
    public int getval(){
        return val;
    }
}