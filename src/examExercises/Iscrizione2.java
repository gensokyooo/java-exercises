package examExercises;

public class Iscrizione2 {

    private Utente2 utente;
    private int meseinizio;
    private int annoinizio;
    private int mesefine;
    private int annofine;


    public Iscrizione2  (Utente2 utente, int meseinizio, int annoinizio, int mesefine, int annofine) {
        this.utente = utente;
        this.meseinizio = meseinizio;
        this.annoinizio = annoinizio;
        this.mesefine = mesefine;
        this.annofine = annofine;

    }\

    public void exceptionMethods () {

        int result = annofine - annoinizio;

        if (meseinizio > mesefine && annoinizio == annofine) {
            throw new IscrizioneNonValidaException("Month is invalid");
        } else if (annoinizio > annofine) {
            throw new IscrizioneNonValidaException("Starting year is invalid");

        } else if (result > 1) {
            throw new IscrizioneNonValidaException("12+ months have passed");
        }

    }


}



