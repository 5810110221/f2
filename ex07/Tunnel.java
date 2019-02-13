public class Tunnel{
    private int slotin;
    private int slotout;
    public Tunnel(int s_in, int s_out){
        this.slotin = s_in;
        this.slotout = s_out;
    }
    public int walkin(int slot){
        if(slot == slotin)
            return slotout;
        return slot;
    }
}