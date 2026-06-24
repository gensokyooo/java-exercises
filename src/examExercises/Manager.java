package examExercises;

import java.util.ArrayList;

public class Manager extends Impiegato {
    // Making team a literal field inside Manager
    public ArrayList<ImpiegatoBase>team;
    public Manager (String nome, String cognome, int ore_annuali) {
        super (nome,cognome,ore_annuali);
        this.team = new ArrayList<>();
    }

    @Override
    public double getStipendioAnnuale() {
        return this.getOre_annuali() * 25.90;
        }

        @Override
        public boolean equals (Object obj) {
        return super.equals(obj);
        }
}
