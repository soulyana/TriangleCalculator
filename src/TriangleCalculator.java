import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of side a: ");
        a = scan.nextInt();

        System.out.println("Enter length of side b: ");
        b = scan.nextInt();

        System.out.println("Enter length of side c: ");
        c = scan.nextInt();

        if(equilateral(a,b,c) == true) {
            System.out.println("This is an equilateral triangle.");
        } else if(rightTriangle(a,b,c) == true) {
            System.out.println("This is a right triangle.");
        } else {
            System.out.println("This is neither an equilateral nor right triangle.");
        }
    }

        public static boolean equilateral(int a, int b, int c) {
            if(a == b && b == c){
                return true;
            }
            return false;
        }


        public static boolean rightTriangle(int a, int b, int c) {
         if(Math.pow((double)c,(double)2) == Math.pow((double)a,(double)2) + Math.pow((double)b,(double)2)) {
             return true;
         } else if(Math.pow((double)b,(double)2) == Math.pow((double)a,(double)2) + Math.pow((double)c,(double)2)) {
             return true;
         } else if(Math.pow((double)a,(double)2) == Math.pow((double)c,(double)2) + Math.pow((double)b,(double)2)) {
             return true;
         }
         return false;
        }







    }

