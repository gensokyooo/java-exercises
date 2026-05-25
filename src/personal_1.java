import java.util.ArrayList;
import java.util.Scanner;
import book.instances_static_fields.Book;

public class personal_1 {

    public static boolean animeFound (String y, ArrayList<String>animelist){
        for (String x: animelist) {
            if (x.equals(y)) {
                System.out.println("Found");
                return true;
            }
        }
        System.out.println("Not found");

        return false;
    }

    public static void removeAnime (String anime, boolean found, ArrayList<String>animelist ) {
        if (found) {
            System.out.println("Would you like to remove this anime?");
            Scanner input = new Scanner (System.in);
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Anime: " + anime + " has been removed");
                System.out.println("Found at index " + animelist.indexOf(anime));
                animelist.remove(anime);
            } else {
                System.out.println("Okay we won't remove anything");
            }
        }

    }

    public static void convertToCapital (String anime) {

        String x = anime.substring(0,1).toUpperCase() + anime.substring(1);
        System.out.println(x);
    }

    public static void main(String[] args) {

        ArrayList<String> animelist = new ArrayList<>();

        animelist.add("86");
        animelist.add("Cowboy Bepop");
        animelist.add("Evangelion");

        for (int i = 0; i < animelist.size(); i++) {
            System.out.println(animelist.get(i));
        }

        // Asking for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an anime: ");
        String name = input.nextLine();

        // Converting first letter to capital
        convertToCapital(name);

        // Searching inside the Arraylist
        boolean x = animeFound (name, animelist);
        removeAnime(name,x,animelist);

        // Search by first letter
        System.out.println ("Search by first letter: ");
        Scanner input2 = new Scanner (System.in);
        String letter = input2.nextLine();

        for (int i = 0; i < animelist.size();i++) {
            String anime = animelist.get(i);
            if (!letter.isEmpty() && anime.charAt(0) == letter.charAt(0)) {
                System.out.println(anime);
                break;
            }
        }

        Book book1 = new Book("Dune" , 1999);
        book1.printInfo();

    }
}




