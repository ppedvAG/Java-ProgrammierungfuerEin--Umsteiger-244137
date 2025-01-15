package packageJavaGrundkurs;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Zugverkauf {

    private String name;
    private LinkedList<Zug> zugkatalog = new LinkedList<>();

    public Zugverkauf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Zug> getZugkatalog() {
        return zugkatalog;
    }

    public void setZugkatalog(LinkedList<Zug> zugkatalog) {
        this.zugkatalog = zugkatalog;
    }

    public void addZug(Zug zug) {
        if(zugkatalog.isEmpty()) {
            zugkatalog.add(zug);
        } else {
            for (int i = 0; i<zugkatalog.size(); i++) {
                if (!(zug.getName().equalsIgnoreCase(zugkatalog.get(i).getName()) && zug.getPreis() == zugkatalog.get(i).getPreis())) {
                    zugkatalog.add(zug);
                }
            }
        }
    }

    public Zug removeZug(String name, double preis) {
        for (int i = 0; i < zugkatalog.size(); i++) {
            if (zugkatalog.get(i).getName().equalsIgnoreCase(name) && zugkatalog.get(i).getPreis() == preis) {
                zugkatalog.remove(i);
                return zugkatalog.get(i);
            }
        }
        return null;
    }

    public LinkedList<Zug> sortZuege() {
        zugkatalog.sort(Comparator.comparingDouble(Zug::getPreis));
        return zugkatalog;
    }

}

