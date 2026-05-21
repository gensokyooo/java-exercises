import java.util.Scanner;
import java.util.ArrayList;

public class animePowerTracker {

    public static class Character {
        public String name;
        public Integer powerLevel;
        public Double speed;
        public Boolean isMainCharacter;

        public void showCharacter () {
            System.out.println("====================");
            System.out.println("Name " + name);
            System.out.println("Power level: " + powerLevel);
            System.out.println("Speed: " + speed);
            System.out.println("Main character: " + isMainCharacter);
            System.out.println("====================\n");
        }
    }

    public static void main (String[] args) {


        ArrayList <Character> characterlist = new ArrayList<>();

        Scanner input2 = new Scanner(System.in);
        int choice = -1;

        while (choice != 6) {
            System.out.println("=== Anime Power Tracker === \n" +
                    "1. Add character\n" +
                    "2. Show all characters\n" +
                    "3. Search character by name\n" +
                    "4. Power up character\n" +
                    "5. Compare two characters' power levels\n" +
                    "6. Exit");
            choice = Integer.parseInt(input2.nextLine());
           switch (choice) {
               case 1:
                   System.out.println("Name: ");
                   String name1 = input2.nextLine();

                   Character c = new Character();
                   c.name = name1;
                   characterlist.add(c);

                   System.out.println("Power level: ");
                   Integer power = input2.nextInt();
                   c.powerLevel = power;
                   // Taking out the "Enter" buffer
                   input2.nextLine();

                   System.out.println("Speed: ");
                   Double speed = input2.nextDouble();
                   c.speed = speed;

                   System.out.println("Is this the main character? ");
                   Boolean maincharacter = input2.nextBoolean();
                   c.isMainCharacter = maincharacter;
                   break;
               case 2:
                   for (var entry: characterlist ) {
                       entry.showCharacter();
                   }
                   break;
               case 3:
                   System.out.println("Enter the character you're searching: ");
                   String charName = input2.nextLine();
                   for (var entry: characterlist) {
                       if (charName.equals(entry.name)) {
                           System.out.println("Found");
                       } else {
                           System.out.println("Not found");
                       }
                   }
                   break;
               case 4:
            }
        }
        System.out.println("Power level: ");
    }

}
