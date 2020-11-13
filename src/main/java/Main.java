import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count = 1;
        int total = 0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter binary number");
        String BinaryNumber = myObj.nextLine();
        for (int i = BinaryNumber.length() -1; i > -1 ; i--) {
            if (BinaryNumber.charAt(i) == '1'){
                total += count;
            }
            count = count * 2;
        }
        System.out.println(total);
    }
}