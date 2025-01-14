package tag2;

public class Zug extends Fahrzeug{
    private int anzWagons = 0;

    public int getAnzWagons() {
        return anzWagons;
    }

    public void setAnzWagons(int anzWagons) {
        this.anzWagons = anzWagons;
    }

    public Zug(String name, int maxG, double preis, int anzWagons) {
        super(name, maxG, preis);
        this.anzWagons = anzWagons;
    }
    public Zug(String name) {
        super(name);
    }

    @Override
    public String Info() {
        return "Das Fahrzeug ist ein Zug. "+ super.Info()+ " Der Zug hat "+ anzWagons +" Wagen.";
    }

    @Override
    public void Hupen() {
        System.out.println("Zug hupt!");
    }
}
