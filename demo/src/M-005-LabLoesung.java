import java.util.Scanner;

public class MeineKlasse {
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
    }
}