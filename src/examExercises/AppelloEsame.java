package examExercises;

public class AppelloEsame {
    private String nome;
    private String anno_accademico;
    private int iscritti;
    private StudenteLavoratore[] lavoratori;
    private StudenteOrdinario[] ordinari;
    private int count_ordinari;
    private int count_lavoratori;

    public AppelloEsame (String nome, String anno_accademico) {
        this.nome = nome;
        this.anno_accademico = anno_accademico;
        this.iscritti = 0;
        this.lavoratori = new StudenteLavoratore[50];
        this.ordinari = new StudenteOrdinario[50];
        count_lavoratori = 0;
        count_ordinari = 0;
    }


    public void iscriviti (Immatricolabile x) throws AppelloEsameException {

        if (x instanceof StudenteOrdinario) {
            for (int i = 0; i < count_ordinari ; i++) {
                if (x.equals(ordinari[i])) {
                    throw new AppelloEsameException("Student already subbed");
                }
                if (count_ordinari == 50) {
                    throw new AppelloEsameException("Seats full for ordinary students");
                }
            }

                StudenteOrdinario other = (StudenteOrdinario) x;
                ordinari[count_ordinari] = other;
                count_ordinari++;
            }

        else if (x instanceof StudenteLavoratore) {
            for (int i = 0; i < count_lavoratori ; i++) {
                if (x.equals(lavoratori[i])) {
                    throw new AppelloEsameException("Student already subbed");
                }
                if (count_lavoratori == 50) {
                    throw new AppelloEsameException("Seats full for worker students");
                }
            }

                StudenteLavoratore other = (StudenteLavoratore) x;
                lavoratori[count_lavoratori] = other;
                count_lavoratori++;
            }
        }

        @Override
        public boolean equals (Object obj) {
           if (this == obj) return true;
           if (obj == null) return false;
           if (!(obj instanceof AppelloEsame)) return false;

           AppelloEsame other =(AppelloEsame) obj;

           boolean sameName = this.nome.equals(other.nome);
           boolean sameAnno = this.anno_accademico.equals(other.anno_accademico);


            if (count_ordinari != other.count_ordinari) return false;
            if (count_lavoratori!= other.count_lavoratori) return false;

            for (int i = 0; i < count_ordinari; i++) {
                boolean sameOrdinari = false;
                for (int j = 0; j < count_ordinari; j++) {
                    if (ordinari[i].equals(other.ordinari[j])) {
                            sameOrdinari = true;
                            break;
                    }
                }
                if (!sameOrdinari) {
                    return false;
                }
            }

            for (int i = 0; i < count_lavoratori; i++) {
                boolean sameLavoratori = false;
                for (int j = 0; j < count_lavoratori; j++) {
                    if (lavoratori[i].equals(other.lavoratori[j])) {
                        sameLavoratori = true;
                        break;
                    }
                }
                if (!sameLavoratori) {
                    return false;
                }
            }

           return sameAnno && sameName ;
        }

    }
