public class Chien extends Animal {
    private boolean aChauve;
    
    public Chien(String type, String cri, int patte, boolean queue, boolean chauve ){
        super(type, cri, patte, queue);
        this.aChauve = chauve;
    }
}
