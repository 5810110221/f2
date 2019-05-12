import java.*;
public class Auction{
      private ArrayList<Lot> lots; 

    public Auction(){ 
        lots = new ArrayList<Lot>();  
    }

    public void enterLot(int lotNum, String description){ 
        lots.add( new Lot(lotNum, description) );  
    }      

    public void showLots(){ 
        for (Lot lot : lots)
            System.out.println(lot.toString());
    }
    public Lot getLot(int lotNum){
        for (Lot lot : lots){
            if (lot.getIdNum() == lotNum)
                return lot;
        }
    System.out.println("Lot number: " + lotNum + " does not exist.");
    return null;
    } 
}  