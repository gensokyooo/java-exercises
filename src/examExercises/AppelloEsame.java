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
}
