package ncs.test2;

public class CharTest {
    public static void main(String[] args) {

        String input = args[0];
        char[] charArray = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            charArray[i] = Character.toUpperCase(input.charAt(input.length() - i - 1));
        }
        System.out.println(charArray);
    }
}