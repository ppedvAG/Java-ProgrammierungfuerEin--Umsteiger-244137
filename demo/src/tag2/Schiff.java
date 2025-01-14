package tag2;

public class Schiff extends Fahrzeug{
    private double tiefgang;

    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public Schiff(String name, int maxG, double preis, double tiefgang) {
        super(name, maxG, preis);
        this.tiefgang = tiefgang;
    }

    @Override
    public String Info() {
        return "Das Fahrzeug ist ein Schiff. "+ super.Info()+ " Der Tiefgang ist "+tiefgang+"m.";
    }
}
