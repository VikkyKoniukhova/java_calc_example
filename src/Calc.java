public class Calc {

public static void main (String []args) {
    doCalc(6,2, "div");
   }

public static void doCalc (int a, int b, String operationType) {
    int result;
    switch (operationType) {
        case ("sum"):
            result = a + b;
            System.out.println(a + "+" + b + "=" + result);
            break;
        case ("sub"):
            result = a - b;
            System.out.println(a + "-" + b + "=" + result);
            break;
        case ("mult"):
            result = a * b;
            System.out.println(a + "*" + b + "=" + result);
            break;
        case ("div"):
            result = a / b;
            System.out.println(a + "/" + b + "=" + result);
            break;
    }
    }
}









