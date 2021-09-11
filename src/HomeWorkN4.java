import java.util.Scanner;

public class HomeWorkN4 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("mutq tveq 1-in@");

        //String inputStr1 = inputScanner.next();
        int aa = inputScanner.nextInt();


        System.out.println("duq mutq eq tvel"+aa);
        String Inputoperator = inputScanner.next();


        System.out.println("mutq tveq 2-d@");
       // String inputStr2 = inputScanner.next();
        int bb = inputScanner.nextInt();
        System.out.println("duq mutq eq tvel"+bb);
        switch (Inputoperator){

            case "+":
                System.out.println((aa+bb));
                break;
            case "-":
                System.out.println((aa-bb));
                break;
            case "*":
                System.out.println((aa*bb));
                break;
            case "/":
                System.out.println((aa/bb));
                break;
            default:
                System.out.println("wrong operator");

        }












    }
}
