import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Variablendeklarierung
        int entfernungInMetern, stunden, minuten, sekunden;
        double meterProSekunde, kilometerProStunde, meilenProStunde;

        //Neuer Scanner für Konsoleneingaben
        Scanner scanner = new Scanner(System.in);

        //Abfrage der Eingaben
        System.out.println("Bitte gib folgende Angaben ein:");
        System.out.print("Entfernung (in Metern): ");
        //Parsen der Eingabe in Int32
        entfernungInMetern = scanner.nextInt();
        System.out.print("Stunden: ");
        stunden = scanner.nextInt();
        System.out.print("Minuten: ");
        minuten = scanner.nextInt();
        System.out.print("Sekunden: ");
        sekunden = scanner.nextInt();

        //Ausgabe einer leeren Zeile
        System.out.println();

        //Berechnung der Ausgaben
        sekunden = sekunden + (minuten * 60) + (stunden * 3600);
        meterProSekunde = entfernungInMetern / (double)sekunden;
        kilometerProStunde = meterProSekunde * 3.6;
        meilenProStunde = kilometerProStunde * 0.62137119;

        //Ausgaben inkl. Rundungen auf zwei Nachkommastellen
        System.out.println("Meter/Sekunde:\t\t"+ Math.round(meterProSekunde*100)/100.0);
        System.out.println("Kilometer/Stunde:\t"+ Math.round(kilometerProStunde*100)/100.0);
        System.out.println("Meilen/Stunde:\t\t "+ Math.round(meilenProStunde*100)/100.0);

    }
}