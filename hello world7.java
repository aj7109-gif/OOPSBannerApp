public class HelloApp {

    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join all names with ", " delimiter
        String names = String.join(", ", args);

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}
