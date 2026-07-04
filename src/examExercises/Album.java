package examExercises;

import java.util.ArrayList;

public class Album {
    private String nome;
    private ArrayList <Figurina> figurine;

    public Album (String nome) {
        this.nome = nome;
        this.figurine = new ArrayList<>();
    }

    public String getNome () {
        return this.nome;
    }

    public void add (Figurina x) {

        boolean sameid = false;
        for (int i = 0; i < figurine.size(); i ++ ) {
            if ((figurine.get(i).equals(x))) {
                sameid = true;
            }
        }

        int count_sportive = 0;
        int count_storica = 0;
        for (int i = 0; i < figurine.size(); i++) {
            if (figurine.get(i) instanceof FigurinaSportiva) {
                count_sportive++;
            } else if (figurine.get(i) instanceof FigurinaStorica) {
                count_storica++;
            }
        }

        if (x instanceof FigurinaSportiva) {
            count_sportive++;
        }
        if (x instanceof FigurinaStorica) {
            count_sportive++;
        }

        if (count_sportive >= 100 || count_storica >= 50 || sameid ) {
            throw new IllegalStateException("Album non valido");
        }

        figurine.add(x);
    }

    @Override
    public boolean equals (Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Album)) return false;

        Album other = (Album) obj;

        boolean sameName = this.nome.equals(other.getNome());

        boolean sameFigurine = true;
        if (this.figurine.size() != other.figurine.size()) {
            return false;
        }
        for (int i = 0; i < this.figurine.size(); i++) {
            if (!(this.figurine.get(i).equals(other.figurine.get(i)))) {
                // if even one figurine is different then it returns false
                return false;
            }
        }

        return sameName && sameFigurine;

    }


}
