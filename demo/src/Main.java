import java.util.Scanner;

public class Main {

    // main Methode
    public static void main(String[] args) {
        // neue Variable für das Alter (int - Natürliche Zahl)
        int alter;

        // Ausgabe "Alter eingeben"
        System.out.println("Alter eingeben");
        // Scanner zum einlesen von der Konsole
        Scanner scanner = new Scanner(System.in);

        // Überprüfen, ob die eingabe ein int ist
        if(scanner.hasNextInt()){
            alter= scanner.nextInt();
            System.out.println("Du bist "+alter+" jahre alt");
        } else {
            System.out.println("Das war keine Zahl! ");
            alter = 0;
        }


        // Umwandeln von int to String
        String alterAlsString = Integer.toString(alter);
        // Umwandlung von String zu double
        double alterNeu = Double.parseDouble(alterAlsString);
    }
}