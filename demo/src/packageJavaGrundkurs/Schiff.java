package packageJavaGrundkurs;

public class Schiff extends Fahrzeug implements IBeladbar{
    private double tiefgang = 0;
    private Fahrzeug beladenesFahrzeug;

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

    public Schiff(String name) {
        super(name);
    }

    @Override
    public String Info() {
        String returnString ="Das Fahrzeug ist ein Schiff. "+ super.Info()+ " Der Tiefgang ist "+tiefgang+"m.";
        if(beladenesFahrzeug!= null)
            returnString+= "es hat das Fahrzeug "+beladenesFahrzeug.getName()+" geladen.";
        return returnString;
    }

    @Override
    public void Hupen() {
        System.out.println("Schiff hupt!");
    }

    @Override
    public void Belade(Fahrzeug fahrzeug) {
        if(beladenesFahrzeug==null) {
            beladenesFahrzeug = fahrzeug;
        }
    }

    @Override
    public Fahrzeug getBeleadenesFahrzeug() {
        return beladenesFahrzeug;
    }

    @Override
    public Fahrzeug Entlade() {
        if(beladenesFahrzeug!=null) {
            Fahrzeug entladenesFahrzeug = beladenesFahrzeug;
            beladenesFahrzeug = null;
            return entladenesFahrzeug;
        }
        return null;
    }
}
