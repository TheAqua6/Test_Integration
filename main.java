import java.util.ArrayList;
import java.util.List;

public class Vehicule {

  public static void Assurance(bool valide, date finCouverture) {
    System.out.printf($valide);
    System.out.printf($finCouverture);
  }
  public int vitesse;
  public string typeVehicule;
  
}

public class Conducteur {
  
  public bool permisProbatoire;
  public float tauxAlcool;
  
}

public class Route {
   
   public int limiteVitesse;
  
   public static void afficherListe(final String nom,
    final List<String> vehiculeAuthorise) {
    int i = 0; 
    for (String element : vehiculeAuthorise) {
      System.out.format("%s  %2d : %s\n", nom, i, element);
      i++;
    }
     public static void main(final String[] args) {
    List<String> liste = new ArrayList<String>();
    liste.add("Voiture");
    liste.add("Moto");
    liste.add("Camion");
    
    System.out.println("");
    afficherListe("liste", liste);
    System.out.println("");   
    
    
  }
  }
