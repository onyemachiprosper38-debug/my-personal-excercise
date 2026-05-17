public class Main {
    
    // Function that takes a string and returns its length
    public static int getStringLength(String input) {
        return input.length();
    }

    public static void main(String[] args) {
        String text = "Hello, world!";
        int length = getStringLength(text);
        System.out.println("Length: " + length);
    }
}
