import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int x = Integer.parseInt(binary, 2);
        return x;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        String dec = Integer.toBinaryString(decimal);
        return dec;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter binary: ");
        String ans = scan.nextLine();
        System.out.println("Converted to decimal, that is: " + binaryToDecimal(ans));
        System.out.println("enter a decimal: ");
        int dec_ans = scan.nextInt();
        System.out.println("Converted to binary, that is: " + decimalToBinary(dec_ans));
    }
}
