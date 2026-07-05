package examExercises;

public class AppelloEsame {
    private String nome;
    private String anno_accademico;
    private int iscritti;
    private StudenteLavoratore[] lavoratori;
    private StudenteOrdinario[] ordinari;

    public AppelloEsame (String nome, String anno_accademico) {
        this.nome = nome;
        this.anno_accademico = anno_accademico;
        this.iscritti = 0;
        this.lavoratori = new StudenteLavoratore[50];
        this.ordinari = new StudenteOrdinario[50];
    }

    public void iscriviti (Immatricolabile x) throws AppelloEsameException {

        if (x instanceof StudenteOrdinario) {
            for (int i = 0; i < ordinari.length ; i++) {
                if (x.equals(ordinari[i])) {
                    throw new AppelloEsameException("Student already subbed");
                }
            }
        }

        if (x instanceof StudenteLavoratore) {
            for (int i = 0; i < lavoratori.length ; i++) {
                if (x.equals(lavoratori[i])) {
                    throw new AppelloEsameException("Student already subbed");
                }
            }
        }



    }
}
