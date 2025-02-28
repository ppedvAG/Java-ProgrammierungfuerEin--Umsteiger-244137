package packageJavaGrundkurs;

import java.util.Random;

public abstract class Fahrzeug {
    //Properties
    private String Name;
    private int MaxGeschwindigkeit = 0;
    private int AktGeschwindigkeit = 0;
    private double Preis = 0;
    private boolean MotorLaeuft = false;
    // statische Int-Property für die Anzahl der erzeugten Fahrzeuge
    private static int anzahlFahrzeuge = 0;

    //Getter and Setter
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getMaxGeschwindigkeit() {
        return MaxGeschwindigkeit;
    }
    public void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
        MaxGeschwindigkeit = maxGeschwindigkeit;
    }
    public int getAktGeschwindigkeit() {
        return AktGeschwindigkeit;
    }
    public void setAktGeschwindigkeit(int aktGeschwindigkeit) {
        AktGeschwindigkeit = aktGeschwindigkeit;
    }
    public double getPreis() {
        return Preis;
    }
    public void setPreis(double preis) {
        Preis = preis;
    }
    public boolean isMotorLaeuft() {
        return MotorLaeuft;
    }
    public void setMotorLaeuft(boolean motorLaeuft) {
        MotorLaeuft = motorLaeuft;
    }

    //Konstruktor mit Übergabeparametern und Standartwerten
    public Fahrzeug(String name, int maxG, double preis)
    {
        this.Name = name;
        this.MaxGeschwindigkeit = maxG;
        this.Preis = preis;
        this.AktGeschwindigkeit = 0;
        this.MotorLaeuft = false;

        // Jedes mal, wenn der Konstruktor aufgerufen wird (ein neues Fahrzeug erzeugt wird),
        // wird die Anzahl der Fahrzeuge um 1 erhöht
        anzahlFahrzeuge++;
    }

    public Fahrzeug(String name) {
        Name = name;
        anzahlFahrzeuge++;
    }

    //Methode zur Ausgabe von Objektinformationen
    public String Info()
    {
        if (this.MotorLaeuft)
            return this.Name+" kostet "+this.Preis+"€ und fährt momentan mit "+this.AktGeschwindigkeit+" von maximal "+this.MaxGeschwindigkeit+"km/h.";
        else
            return this.Name+" kostet "+this.Preis+"€ und könnte maximal "+this.MaxGeschwindigkeit+"km/h fahren.";
    }

    //Methode zum Starten des Motors
    public void StarteMotor()
    {
        if (this.MotorLaeuft)
            System.out.println("Der Motor von "+this.Name+" läuft bereits.");
        else
        {
            this.MotorLaeuft = true;
            System.out.println("Der Motor von "+this.Name+" wurde gestartet.");
        }
    }

    //Methode zum Stoppen des Motors
    public void StoppeMotor()
    {
        if (!this.MotorLaeuft)
            System.out.println("Der Motor ist bereits gestoppt");
        else if (this.AktGeschwindigkeit > 0)
            System.out.println("Der Motor kann nicht gestoppt werden, da sich "+this.Name+" noch bewegt");
        else
        {
            this.MotorLaeuft = false;
            System.out.println("Der Motor wurde gestoppt.");
        }
    }

    //Methode zum Beschleunigen und Bremsen
    public void Beschleunige(int a)
    {
        if (this.MotorLaeuft)
        {
            if (this.AktGeschwindigkeit + a > this.MaxGeschwindigkeit)
                this.AktGeschwindigkeit = this.MaxGeschwindigkeit;
            else if (this.AktGeschwindigkeit + a < 0)
                this.AktGeschwindigkeit = 0;
            else
                this.AktGeschwindigkeit += a;

            System.out.println(this.Name+" bewegt sich jetzt mit "+this.AktGeschwindigkeit+"km/h");
        }
    }

    public static String getAnzahlFahrzeuge() {
        return "Es wurden bereits "+anzahlFahrzeuge+" Fahrzeuge erzeugt.";
    }

    public abstract void Hupen();

    public static Fahrzeug GeneriereFahrzeug(String name) {
        Random random = new Random();
        int zufallsZahl=random.nextInt((2-1)+1)+1;
        switch (zufallsZahl) {
            case 1: return new Schiff(name);
            case 2: return new Zug(name);
            default: return null;
        }
    }

}
