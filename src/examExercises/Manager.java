package examExercises;

public class Manager extends Impiegato {
    public Manager (String nome, String cognome, int ore_annuali) {
        super (nome,cognome,ore_annuali);
    }

    @Override
    public double getStipendioAnnuale() {
        return this.getOre_annuali() * 25.90;
        }
}
