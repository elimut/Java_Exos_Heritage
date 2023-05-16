public class Animal {
    private String aType;
    private String aCri;
    private int aPatte;
    private boolean aQueue;
    private String aRegne = "animal";

    public Animal(String type, String cri, int patte, boolean queue, String regne){
        this.aType = type;
        this.aCri = cri;
        this.aPatte = patte;
        this.aQueue = queue;
        this.aRegne = regne;
    }
    /*
    public Animal(String type){
        this.aType = type;
        this.aCri = "Miaou";
        this.aPatte = 4;
        this.aQueue = true;
    }
    voir plusieurs constructeurs possibles? pas idéal. voir null.
    */

    public String getType() {
        return aType;
    }

    public void setType(String type) {
        this.aType = type;
    }

    public String getCri() {
        return aCri;
    }
 
    public void setCri(String cri) {
        this.aCri = cri; 
    }

    public int getPatte() {
        return aPatte;
    }

    public void setPatte(int patte) {
        this.aPatte = patte;
    }

    public boolean getQueue() {
        return aQueue;
    }

    public void setQueue(boolean queue) {
        this.aQueue = queue;
    }

    public String getRegne(){
        return aRegne;
    }
    // pas de set pour regne car val par défaut
}
