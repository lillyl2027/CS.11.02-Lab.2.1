/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Lilly
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum = add(2,4 );
        System.out.println("Sum: " + sum);
        int sum2 = add(2, 4, 6,8);
        System.out.println("Sum: " + sum2);
        String morningGreetingResult = morningGreeting("Queen");
        System.out.println(morningGreetingResult);
        String afternoonGreetingResult = afternoonGreeting("Bob");
        System.out.println(afternoonGreetingResult);
        String tripleResult = triple("oohbaby");
        System.out.println(tripleResult);
        double halfResult = half(6);
        System.out.println("Half of 6: " + halfResult);
        int roundPositiveValueToNearestIntegerResult = roundPositiveValueToNearestInteger(8.5);
        System.out.println("8.5 rounded to the nearest integer result: " + roundPositiveValueToNearestIntegerResult);
        int roundNegativeValueToNearestIntegerResult = roundNegativeValueToNearestInteger(-8.5);
        System.out.println("-8.5 rounded to the nearest integer result: " + roundNegativeValueToNearestIntegerResult);



    }

    // 1. add
    public static int add (int a, int b){
        return a+b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        return add(add(a,b),add (c,d));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String input){
        return input + input + input;
    }
    // 6. half
    public static double half(double a){
        return a / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double value){
        return (int) Math.round(value);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double value){
        return (int) Math.floor(value);
    }

}
