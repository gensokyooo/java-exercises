package examExercises;

public abstract class Impiegato {
    private String nome;
    private String cognome;
    private int ore_annuali;

    public String getNome () {
        return nome;
    }

    public String getCognome () {
        return cognome;
    }

    public int getOre_annuali() {
        return ore_annuali;
    }

    public Impiegato (String nome, String cognome, int ore_annuali) {
        this.nome = nome;
        this.cognome = cognome;
        this.ore_annuali = ore_annuali;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Impiegato)) return false;

        Impiegato other = (Impiegato) obj;

        boolean stessoNome = this.getNome().equals(other.getNome());
        boolean stessoCognome = this.getCognome().equals(other.getCognome());
        boolean stesseOreAnnuali = this.getOre_annuali() == other.getOre_annuali();

    return stessoNome && stessoCognome && stesseOreAnnuali;
    }
        public abstract double getStipendioAnnuale ();

}


