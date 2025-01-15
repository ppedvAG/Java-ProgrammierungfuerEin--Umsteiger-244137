package packageJavaGrundkurs;

public class Hund extends Lebewesen{
    private int alter=0;
    @Override
    public int getAlter() {
        return alter;
    }

    @Override
    public void setAlter(int alter) {
        if(alter>0) {
            this.alter=alter;
        }
    }
}
