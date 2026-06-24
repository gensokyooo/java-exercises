package examExercises;

public class ImpiegatoBase extends Impiegato {

    public ImpiegatoBase (String nome, String cognome, int ore_annuali) {
        super (nome,cognome,ore_annuali);
    }

    @Override
    public double getStipendioAnnuale() {
        return getOre_annuali()*15.50;
    }

    @Override
    public boolean equals (Object obj) {
       return super.equals(obj);
    }

}
