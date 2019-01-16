public class Multiplecounting{
    public static void main (String arg[]){
    Counter c = new Counter();
    for (int i = 0; i <5 ; i++){
        while(c.getval() < 10){
            c.inc();
            System.out.println(c.getval());
        }
        c.reset();
    }
}
}