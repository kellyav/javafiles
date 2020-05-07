package examples;
    public class hello_world {
        public static void message(String myString, int myInt) {
            System.out.println("This is my String: " +myString);
            System.out.println("and this is my favorite int: " + myInt);
        }
        public static void main(String[] args) {
            message("Hello World!", 4);
        }
}
