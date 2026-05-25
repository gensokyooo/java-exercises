package book;
public class instances_static_fields {
    static public class Book {
        String title;
        double price;

        static int count = 0;

        Book (String title, double price) {
            this.title = title;
            this.price = price;
            count++;
        }

        void printInfo()  {
            System.out.println("Title: " + title);
            System.out.println("Price: " + price);
        }
        // Here we used static for design clarity: so we can do Book.printCount which makes more sense
        // than doing b1.printCount as it might look like you're asking b1 to print its own count
        // even tho it's a static member of the class so, it's visible to every object
        static void printCount ()  {
            System.out.println(count);
        }
        }
        // STATIC LETS YOU CALL METHODS ON CLASSES THEMSELVES ** so you don't have to create an object to run main
    static void main (String[] args) {

                Book b1 = new Book("Dune", 12.99);
                Book b2 = new Book("1984", 9.99);

                b1.printInfo();
                b2.printInfo();
                // Design decision for clarity
                // ** like here
                Book.printCount();

        }
    }


