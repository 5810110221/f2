public class TicketMachine{
    private int price;    
    private int balance; 
    private int total;    

    public TicketMachine(int ticketCost){
        price = ticketCost; 
        balance = 0;
        total = 0;
    }
    public int getPrice(){
        return price; 
    }
 
    public int getBalance(){   
        return balance; 
    }
 
   public int getTotal(){  
        return total;  
    }
    
    public void insertMoney(int amount){
        if (amount > 0)
            balance = balance + amount;
        else
            System.out.println("Use a positive amount: " + amount);
    }
    
    public void printTicket(){     
        if (balance >= price) {
            System.out.println("##################");
            System.out.println("# Ticket");
            System.out.println("# " + price + " baht.");
            System.out.println("##################");
            System.out.println();
            total = total + price;
            balance = balance - price;
        }
        else  
            System.out.println("You must insert at least: " + (price - balance) + " more baht.");
    } 
    
    public int refundBalance(){
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;   
        return amountToRefund;   
    }

}