package examExercises;

public abstract class AulaV2 {
    private String nome;
    private int capienzaMassima;

    public String getNome () {
        return nome;
    }
    public int getCapienzaMassima () {
        return capienzaMassima;
    }

    AulaV2 (String nome, int capienzaMassima) {
        this.nome = nome;
        this.capienzaMassima = capienzaMassima;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof AulaV2)) return false;


        AulaV2 other = (AulaV2) obj;
        boolean sameName = this.getNome().equals(other.getNome());
        boolean sameCapienza = this.getCapienzaMassima() == other.getCapienzaMassima();

        return sameName && sameCapienza;

    }
}
