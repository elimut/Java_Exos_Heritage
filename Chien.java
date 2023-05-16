public class Chien extends Animal {
    private boolean aChauve;

    public Chien(String type, String cri, int patte, boolean queue, boolean chauve ){
        super(type, cri, patte, queue, "animal");
        this.aChauve = chauve;
    }
    public boolean getChauve() {
        return aChauve;
    }
 
    public void setChauve(boolean chauve) {
        this.aChauve = chauve;
    }
}
