import java.util.Scanner;

public class Hailstone {

    public static int hailstone(int num){
        int n = 0;
        if (num > 1) {

            System.out.print(num + "\t");
            ++n;

            while (num != 1) {
                if (num % 2 == 0)
                    num = num / 2;
                else
                    num = num * 3 + 1;
                if (num == 1) {
                    num = 1;
                    return num;
                }
                System.out.print(num + "\t");
                n++;
                if (n % 10 == 0) {
                    System.out.print("\n");
                }
            }
        }
        
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Please give the number for the hailstone sequence to start with:"); // TEST CODE
        Scanner scnr = new Scanner(System.in);
        int num;
        num = scnr.nextInt();
        System.out.println("Here is your sequence:"); // TEST CODE
        System.out.println(hailstone(num));
    }
}
