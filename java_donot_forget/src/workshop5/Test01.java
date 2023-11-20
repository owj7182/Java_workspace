package workshop5;

public class Test01 {
    public static void main(String[] args) {
        
    	if (args.length != 1) {
            System.out.println("인자로 정확히 하나의 문자열을 입력하세요.");
            return;
        }
        
        String input = args[0];
        char[] charArray = input.toCharArray();

        System.out.print("입력 예1: " + input + "\n");
        
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}