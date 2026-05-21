import java.util.Scanner;
import java.util.ArrayList;

public class animePowerTracker {

    public static class Character {
        public String name;
        public Integer powerLevel;
        public Double speed;
        public Boolean isMainCharacter;
    }

    public static void main (String[] args) {

        System.out.println("=== Anime Power Tracker === \n" +
                "1. Add character\n" +
                "2. Show all characters\n" +
                "3. Search character by name\n" +
                "4. Power up character\n" +
                "5. Compare two characters' power levels\n" +
                "6. Exit");
        ArrayList <Character> characterlist = new ArrayList<>();

        Scanner input2 = new Scanner(System.in);
        int choice = Integer.parseInt(input2.nextLine());

        while (choice != 6) {
           switch (choice) {
               case 1:
                   System.out.println("Name: ");
                   Scanner input = new Scanner(System.in);
                   String name1 = input.nextLine();

                   Character c = new Character();
                   c.name = name1;
                   characterlist.add(c);

                   System.out.println("Power level: ");
                   Integer power = input.nextInt();
                   c.powerLevel = power;
                   // Taking out the "Enter" buffer
                   input.nextLine();

                   System.out.println("Speed: ");
                   Double speed = input.nextDouble();
                   c.speed = speed;

                   System.out.println("Is this the main character? ");
                   Boolean maincharacter = input.nextBoolean();
                   c.isMainCharacter = maincharacter;
            }
        }

        System.out.println("Power level: ");



    }

    // Add a character which adds characters into an array of characters





}
