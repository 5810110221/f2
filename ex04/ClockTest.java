public class ClockTest{
    public static void main(String args[]){
        Clock c = new Clock(12,35);
        c.pressCenter(true);
        c.pressUp();
        c.pressCenter(false);
        c.pressUp(); c.pressUp();
        c.pressUp(); c.pressUp();
        c.pressUp(); c.pressCenter(true);
    }
}