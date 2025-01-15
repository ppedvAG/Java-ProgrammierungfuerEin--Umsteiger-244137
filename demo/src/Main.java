import packageJavaGrundkurs.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    //-- TAG 2 -------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
// lab 006

       /* //Deklaration einer Fahrzeug-Variablen und Initialisierung mittels einer Fahrzeug-Instanz
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
        System.out.println(Fahrzeug.getAnzahlFahrzeuge());*/
// demo 008
        /*Schiff schiff = new Schiff("Titanic", 70, 5000000, 9);
        System.out.println(schiff.Info());

//demo 009
        Lebewesen hund = new Hund();
        hund.setAlter(7);
        System.out.println("Der hund ist so alt: "+hund.getAlter());
// lab 009
        Fahrzeug[] zufallsFahrzeuge= new Fahrzeug[10];
        for(int i =0; i<10; i++) {
            zufallsFahrzeuge[i] = Fahrzeug.GeneriereFahrzeug("zufallsFahrzeug");
        }
        int countZug, countSchiff;
        countZug=0; countSchiff =0;
        for(int i =0; i<10; i++) {
            switch (zufallsFahrzeuge[i].getClass().getName()) {
                case "packageJavaGrundkurs.Zug": countZug++; break;
                case "packageJavaGrundkurs.Schiff": countSchiff++; break;
            }
            System.out.println("Position: "+(i+1)+"\t\t"+zufallsFahrzeuge[i].Info());
        }
        System.out.println("Schiffe: "+countSchiff);
        System.out.println("Züge: "+countZug);
        zufallsFahrzeuge[2].Hupen();*/

//        Container container = new Container();
//        Schiff schiff = new Schiff("Titanic");
//        Zug zug = new Zug("Westbahn");
//        Object beladenesObjekt = beladeWennBeladbar(zug, schiff);
//        if(beladenesObjekt instanceof Schiff) {
//            System.out.println(((Schiff) beladenesObjekt).Info());
//        } else if(beladenesObjekt instanceof Container) {
//            System.out.println("Container ist beladen mit "+((Container) beladenesObjekt).getBeleadenesFahrzeug().getName());
//        }

//        String stringMit0 = "liji 0 lkjlkj";
//        if(stringMit0.contains("0")) {
//            try {
//                Random random = new Random();
//                if(random.nextBoolean()) {
//                    throw new stringContains0Exception(stringMit0);
//                }
//            } catch (stringContains0Exception e) {
//                System.out.println(e.getMessage());;
//            } finally {
//                System.out.println("programm beendet");
//            }
//        }


// lab 14 collecitons
        Zugverkauf zugverkauf = new Zugverkauf("Fridas Zugverkauf");
        zugverkauf.addZug(new Zug("meinZug", 100, 15, 1));
        for (int i = 1; i < 11; i++) {
            Random random = new Random();
            Zug neuerZug = new Zug("zug" + i, 30 * i, random.nextInt(10000000), i);
            zugverkauf.addZug(neuerZug);
        }
        for (int i = 0; i < zugverkauf.getZugkatalog().size(); i++) {
            System.out.println(zugverkauf.getZugkatalog().get(i).Info());
        }
//        zugverkauf.removeZug("meinZug", 15);
//        for (int i = 0; i < zugverkauf.getZugkatalog().size(); i++) {
//            System.out.println(zugverkauf.getZugkatalog().get(i).Info());
//        }
//        zugverkauf.sortZuege();
//        for (int i = 0; i < zugverkauf.getZugkatalog().size(); i++) {
//            System.out.println(zugverkauf.getZugkatalog().get(i).Info());
//        }

    }

    public static Object beladeWennBeladbar(Object o1, Object o2) {
        if (o1 instanceof IBeladbar && o2 instanceof Fahrzeug) {
            ((IBeladbar) o1).Belade((Fahrzeug) o2);
            if (o1 instanceof Container) {
                System.out.println("Container ist beladen mit " + ((Container) o1).getBeleadenesFahrzeug().getName());
            } else {
                System.out.println(((Fahrzeug) o1).Info());
            }
            return o1;
        } else if (o2 instanceof IBeladbar && o1 instanceof Fahrzeug) {
            ((IBeladbar) o2).Belade((Fahrzeug) o1);
            if (o2 instanceof Container) {
                System.out.println("Container ist beladen mit " + ((Container) o2).getBeleadenesFahrzeug().getName());
            } else {
                System.out.println(((Fahrzeug) o2).Info());
            }
            return o2;
        }
        return null;
    }

    //-- TAG 1 -------------------------------------------------------------------------------------------------------------
// lab 004
    //Enum-Definition für lab 004
    enum Rechenoperation {
        ADDITION(1, "Addition"), SUBTRAKTION(2, "Subtraktion"), MULTIPLIKATION(3, "Multiplikation"), DIVISION(4, "Division");

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
    }/*
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
*/

    public static double Calculate(double x, double y, Rechenoperation op) {
        switch (op) {
            case Rechenoperation.ADDITION:
                return x + y;
            case Rechenoperation.SUBTRAKTION:
                return x - y;
            case Rechenoperation.MULTIPLIKATION:
                return x * y;
            case Rechenoperation.DIVISION: {
                if (y == 0) {
                    throw new ArithmeticException("Durch Null Dividiert");
                } else return x / y;
            }
            default:
                return Double.NaN;
        }

    }
/*
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
