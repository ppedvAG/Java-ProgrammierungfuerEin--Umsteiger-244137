
import tag2.Fahrzeug;
import tag2.Hund;
import tag2.Lebewesen;
import tag2.Schiff;

import java.util.Scanner;

public class Main {
//-- TAG 2 -------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
// lab 006
        String beispiel;

        //Deklaration einer Fahrzeug-Variablen und Initialisierung mittels einer Fahrzeug-Instanz
        Fahrzeug fz1 = new Fahrzeug("Mercedes", 190, 23000);
        //Ausführen der Info()-Methode des Fahrzeugs und Ausgabe in der Konsole
        System.out.println(fz1.Info() + "\n");

        //Diverse Methodenausführungen
        fz1.StarteMotor();
        fz1.Beschleunige(120);
        System.out.println(fz1.Info() + "\n");

        fz1.Beschleunige(300);
        System.out.println(fz1.Info() + "\n");

        fz1.StoppeMotor();
        System.out.println(fz1.Info() + "\n");

        fz1.Beschleunige(-500);
        fz1.StoppeMotor();
        System.out.println(fz1.Info() + "\n");

        //Array von Fahrzeugen mit der Länge 10 wird erstellt.
        Fahrzeug[] fahrzeuge= new Fahrzeug[10];
        for(int i =0; i<10; i++) {
            //Bei jedem Schleifendurchlauf wird ein neues Fahrzeug erstellt und in das Array gespeichert.
            fahrzeuge[i] = new Fahrzeug("fahrzeug"+i, 20*i, 5000*i);
        }
        // die Anzahl der erstellten Fahrzeuge wird mithilfe der statischen Methode Fahrzeug.getAnzahlFahrzeuge() ausgegeben
        System.out.println(Fahrzeug.getAnzahlFahrzeuge());

        Schiff schiff = new Schiff("Titanic", 70, 5000000, 9);
        System.out.println(schiff.Info());


        Lebewesen hund = new Hund();
        hund.setAlter(7);
        System.out.println("Der hund ist so alt: "+hund.getAlter());
    }

//-- TAG 1 -------------------------------------------------------------------------------------------------------------
// lab 004
    //Enum-Definition für lab 004
    /*enum Rechenoperation {
        ADDITION(1, "Addition"),
        SUBTRAKTION(2, "Subtraktion"),
        MULTIPLIKATION(3, "Multiplikation"),
        DIVISION(4, "Division");

        private final int id;
        private final String description;

        Rechenoperation(int id, String description) {
            this.id = id;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }
    }
    // main Methode
    public static void main(String[] args) {
        // demo
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

// lab 002
        //Variablendeklarierung
        int entfernungInMetern, stunden, minuten, sekunden;
        double meterProSekunde, kilometerProStunde, meilenProStunde;

        //Neuer Scanner für Konsoleneingaben
        //Scanner scanner = new Scanner(System.in);

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
        
// lab 003
        //--Aufgabe 1------------------------------------------------------------------------------------------
        //Abfrage der Eingabe
        System.out.println("Gib das Jahr ein:");
        //Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();

        //Deklarierung/Initialisierung der bool-Variablen
        boolean istSchaltjahr = false;

        //Prüfung einer Teilbarkeit durch 4
        if (eingabe % 4 == 0)
        {
            //Setzten der Variablen auf true
            istSchaltjahr = true;

            //Prüfung einer Teilbarkeit durch 100
            if (eingabe % 100 == 0)
            {
                //Setzten der Variablen auf false
                istSchaltjahr = false;

                //Prüfung einer Teilbarkeit durch 400
                if (eingabe % 400 == 0)
                    //Setzten der Variablen auf true
                    istSchaltjahr = true;
            }
        }

        //Ausgabe
        System.out.println(eingabe+" ist Schaltjahr: "+istSchaltjahr);

        //Alternative (detailiertere) Ausgabe mittels Kurz-Bedingung
        if(istSchaltjahr)
        {
            System.out.println(eingabe+" ist ein Schaltjahr");
        } else {
            System.out.println(eingabe+" ist kein Schaltjahr");
        }

        //ein paar zeilen Abstand
        System.out.println("\n\n\n");

        //--Aufgabe 2------------------------------------------------------------------------------------------
        //Deklaration & Initialisierung des Arrays der Gewinnzahlen
        int[] gewinnzahlen = { 3, 16, 45, 79, 99 };

        //Abfrage des User-Tipps
        System.out.print("Bitte gib deinen Tipp ab (Ganzzahl zwischen 0 und 100): ");
        int tipp = scanner.nextInt();

        //Prüfung des Zahlenbereiches des Tipps
        if (tipp < 0 || tipp > 100)
            System.out.println("Dein Tipp ist außerhalb des Zahlenbereiches.");
        else {
            //Prüfung, ob Tipp eine Gewinnzahl ist und Ausgabe
            if (Arrays.asList(gewinnzahlen).contains(tipp))
                System.out.println("Glückwunsch!! Du hast eine der fünf Gewinnzahlen getippt.");
            else
                System.out.println("Leider daneben. Viel Glück beim nächsten Mal.");
        }
        
// lab 004
        //Scanner scanner = new Scanner(System.in);
        String wiederholen = "";
        //Schleife für Programm-Wiederholung
        do
        {
            //Eingabe und Parsing der ersten Zahl
            System.out.print("\nGib eine Zahl ein: ");
            double zahl1 = scanner.nextDouble();

            //Eingabe und Parsing der zweiten Zahl
            System.out.print("Gib eine weitere Zahl ein: ");
            double zahl2 = scanner.nextDouble();

            //Anzeige der möglichen Rechenoperationen
            System.out.println("\nWähle eine Rechenoperation:");


            for (Rechenoperation op :Rechenoperation.values())
            {
                System.out.println(op.getId()+": "+op.getDescription());
            }

            //Abfrage der Benutzereingabe
            System.out.print("Auswahl: ");
            int auswahl = scanner.nextInt();


            //Deklaration und Initialisierung der Ergebnisvariablen
            double ergebnis = 0.0;

            //Switch zur Auswahl der Rechenoperation
            switch (auswahl)
            {
                //Berechnung des Ergebnisses
                case 1:
                    ergebnis = zahl1 + zahl2;
                    break;
                case 2:
                    ergebnis = zahl1 - zahl2;
                    break;
                case 3:
                    ergebnis = zahl1 * zahl2;
                    break;
                case 4:
                    //Prüfung einer möglichen Teilung durch null
                    if (zahl2 == 0)
                    {
                        System.out.println("\nEine Division durch 0 ist nicht erlaubt.");
                        System.out.println("Wiederholen? (true/false) ");
                        //Sprung zur Schleifenprüfung
                        continue;
                    }
                    ergebnis = zahl1 / zahl2;
                    break;
                default:
                    //Fall, welcher eintrofft, wenn keine valide Rechenoperation ausgewählt wurde
                    System.out.println("\nFehlerhafte Eingabe bei Auswahl der Rechenoperation");
                    System.out.println("Wiederholen? (true/false) ");
                    continue;

            }

            //Ausgabe des Ergebnisses
            System.out.println("\nErgebnis: "+ergebnis);

            //Frage nach der Wiederholung des Programms
            System.out.println("Wiederholen? (j/n) ");
            wiederholen = "";
            while (wiederholen.isEmpty()) {
                wiederholen = scanner.nextLine();
            }
            
        //Schleifenbedingungsprüfung anhand der eingabe des Benutzers
        } while (wiederholen.equalsIgnoreCase("j"));
        
// lab 005
        //Scanner scanner = new Scanner(System.in);
        while (true)
        {
            double zahl1 = GetInput("Gib eine Zahl ein: ");
            double zahl2 = GetInput("Gib eine weitere Zahl ein: ");

            for (Rechenoperation op: Rechenoperation.values())
            {
                System.out.println(op.getId()+": "+op.getDescription());
            }

            Rechenoperation operation = GetRechenoperation();
            double ergebnis = Berechne(zahl1, zahl2, operation);
            String symbol = ConvertRechenoperation(operation);
            System.out.println(zahl1+" "+symbol+" "+zahl2+" = "+ergebnis);
            System.out.println("Wiederholen? (true/false)");
            if (!scanner.nextBoolean())
                break;
        }        
    }
// methoden von lab 005
    static double GetInput(String text)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print(text);
            if (scanner.hasNextDouble()) { // Prüfen, ob die Eingabe eine Zahl ist
                return scanner.nextDouble();
            }
        }
    }

    static Rechenoperation GetRechenoperation()
    {
        Scanner scanner = new Scanner(System.in);
        Rechenoperation operation = null;
        boolean funktioniert = false;

        while (!funktioniert) {
            String eingabe = scanner.nextLine();

            try {
                operation = Rechenoperation.valueOf(eingabe.toUpperCase()); // Enum aus String konvertieren
                funktioniert = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Keine gültige Rechenoperation ausgewählt.");
            }
        }

        return operation;
    }

    static double Berechne(double x, double y, Rechenoperation op)
    {
        switch (op)
        {
            case Rechenoperation.ADDITION:
                return x + y;
            case Rechenoperation.SUBTRAKTION:
                return x - y;
            case Rechenoperation.MULTIPLIKATION:
                return x * y;
            case Rechenoperation.DIVISION:
                return y != 0 ? x / y : Double.NaN;
            default:
                return Double.NaN;
        }
    }

    static String ConvertRechenoperation(Rechenoperation op)
    {
        switch (op)
        {
            case Rechenoperation.ADDITION:
                return "+";
            case Rechenoperation.SUBTRAKTION:
                return "-";
            case Rechenoperation.MULTIPLIKATION:
                return "*";
            case Rechenoperation.DIVISION:
                return "/";
            default:
                return "";
        }
    }*/
}
