public class inheritance_exercises {

    public class Persona {
        public int age;
        public String name;

        Persona () {

        }

        public void showInfo () {
            System.out.println(name);
            System.out.println(age);
        }
    }

    public class Studente extends Persona {
        public String matricola;

        Studente (String name, int age, String matricola) {
            this.matricola = matricola;
        }
    }


    public static void main (String[] args) {


    }

}
