public class AdderTest{
    public static void main(String []args){
        Adder a = new Adder();
        a.add(2);
        a.add(3);
        System.out.println(a.getval());

        Adder b = new Adder();
        b.setval(12);
        b.add(1);
        System.out.println(b.getval());

        a.addFrom(b);
        System.out.println(a.getval());
    }
}