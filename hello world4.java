public class HelloApp {

    public static void main(String[] args) {

        // Use default value "World" if no argument is provided
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }

}
