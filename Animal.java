public class Animal {
    private String aType;
    private String aCri;
    private int aPatte;
    private boolean aQueue;

    public Animal(String type, String cri, int patte, boolean queue){
        this.aType = type;
        this.aCri = cri;
        this.aPatte = patte;
        this.aQueue = queue;
    }
    public Animal(String type){
        this.aType = type;
        this.aCri = "Miaou";
        this.aPatte = 4;
        this.aQueue = true;
    }
}
