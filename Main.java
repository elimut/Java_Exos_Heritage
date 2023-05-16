import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        *Abonnement netflix = new Abonnement("Netflix");
        *Abonnement amazonPrime = new Abonnement("Amazon Prime");
        */
        
        Voiture maVoiture = new Voiture("citroen", "noire");  
    
        // maVoiture.afficherCouleur();
        System.out.println(maVoiture.couleur);
        // => noire

        maVoiture.afficherCouleur();
        // si pas de this dans classe Voiture ko :public void afficherCouleur(){ System.out.println(this.couleur);
    
        Chien test1 = new Chien("chien", "waouf", 4, true, false);
        System.out.println(test1.getRegne());
        System.out.println(test1.getChauve());
    }
}
// in entrée / out sortie
// les calsses sont des objets, déplacement dans les objets avec des points
// les modules en Java sont des packages voir dossier Java_package