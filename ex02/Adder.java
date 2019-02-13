public class Adder{
    private double val;
    public Adder(){
        val = 0.0;
    }
    public void add(double x){
        val = val + x;
    }
    public void setval(double x){
        val = x;
    }
    public void reset(){
        val = 0;
    }
    public double getval(){
        return val;
    }
    public void addFrom(Adder another){
        val = val + another.getval();
    }
}