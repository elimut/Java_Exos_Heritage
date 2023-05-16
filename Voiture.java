public class Voiture {
    public String marque;
    public String couleur;
    // Variables de classe, propre à la classe
    // Encapsuler public -> private, pas d'accès à l'extérieur de la classe

    public Voiture(String marque, String couleur){
        this.marque = marque;
        this.couleur = couleur;
    }
    public void afficherCouleur(){
        System.out.println(this.couleur);
        // static quelque chose directement lié à une classe, chaque fois que l'on fait référence à cela on fait référence à la classe. Si pas de static => this
    }
}
/*
public class Voiture {
    public String marque;
    public String couleur;
    // Encapsuler public -> private, pas d'accès à l'extérieur de la classe

    public static Voiture(String marque, String couleur){
        Voiture.marque = marque;
        Voiture.couleur = couleur;
    }
    public static void afficherCouleur(){
        System.out.println(Voiture.couleur);
    }
}
A revoir car erreur!
*/
