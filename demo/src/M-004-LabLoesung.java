import java.util.Arrays;
import java.util.Scanner;


public class Main {
    //Enum-Definition
    enum Rechenoperation {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean antwortBool;
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
            String antwortString = scanner.nextLine();
            if(antwortString.equals("J") || antwortString.equals("j")) {
                antwortBool = true;
            } else {
                antwortBool = false;
            }
            //Schleifenbedingungsprüfung anhand Tastendruck des Benutzers
        } while (antwortBool);
    }
}