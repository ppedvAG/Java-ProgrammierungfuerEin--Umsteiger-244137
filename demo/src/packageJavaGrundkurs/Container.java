package packageJavaGrundkurs;

public class Container implements IBeladbar{

    private Fahrzeug beladenesFahrzeug;

    @Override
    public Fahrzeug getBeleadenesFahrzeug() {
        return beladenesFahrzeug;
    }

    @Override
    public void Belade(Fahrzeug fahrzeug) {
        if(beladenesFahrzeug==null) {
            beladenesFahrzeug = fahrzeug;
        }
    }

    @Override
    public Fahrzeug Entlade() {
        if (beladenesFahrzeug != null) {
            Fahrzeug entladenesFahrzeug = beladenesFahrzeug;
            beladenesFahrzeug = null;
            return entladenesFahrzeug;
        }
        return null;
    }
}
