public class exercise_1 {

    static public class Book {
        static public int count = 0;
        public double price = 0;

        Book (double x) {
            price = x;
        }
        public void setCount (int x) {
            count = x;
        }

        public void showCount () {
            System.out.println(count);
        }
    }

    static public void main (String[] args) {

        Book book1 = new Book (10.99);
        book1.setCount(1);
        Book book2 = new Book (99);
        book2.setCount(2);

        book1.showCount();



    }

}
