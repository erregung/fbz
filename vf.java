import java.util.Scanner;

public class LaskuLaskuri {
  public static void main(String[] args) {
    Scanner lukija = new Scanner(System.in);
    
    System.out.println("Maksajien määrä:");
    int maksajat = Integer.valueOf(lukija.nextLine());
    System.out.println("Loppusumma:");
    Double summa = Double.valueOf(lukija.nextLine());
    
    if (maksajat > 0 && summa > 0) {
      System.out.println("Kukin maksaa " + (summa / maksajat) + " €.");
    } else {
      System.out.println("Hämmennys.");
    }
  }
}

