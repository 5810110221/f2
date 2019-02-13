public class TMDemo
{
    public static void main(String[] args){
        TicketMachine tm = new TicketMachine(10);
        System.out.println("Ticket price: " + tm.getPrice());
        System.out.println("Current total: " + tm.getTotal());
        System.out.println("Insert 5 baht");
        tm.insertMoney(5);
        System.out.println("Insert 10 baht");
        tm.insertMoney(10);
        System.out.println("Current balance: " + tm.getBalance());
        tm.printTicket();
        System.out.println("Current balance: " + tm.getBalance());
        System.out.println("Current total: " + tm.getTotal());
        System.out.println("Request Change");
        System.out.println("Change is: " + tm.refundBalance());
        System.out.println("Current balance: " + tm.getBalance());
  }  

}