public class Operators {
    public static void main(String[] args) {
        //// assignment operator: =
        String name = "Joao";

        //// arithmetic: +, -, *, /, %
        double sum = 10.5 + 10.6;
        int subtraction = 10 - 5;
        int multiplication = 50 * 5;
        int division = 30 / 3;
        int modulation = 10 % 2;

        //// concatenation of strings
        String concat = "Joao " + "Silva";

        concat = 1+1+1+"1"; // String 31

        concat = 1+"1"+1+1; // String 1111

        concat = 1+"1"+1+"1"; // String 1111

        concat = "1"+(1+1+1); // String 13

        //// unary operators
        // + positive
        int num = 5; // or +5

        // - negative
        num = -num; // -5
        num *= -1; // 5, positive again

        // increment
        num++; // 6, same as num += 1

        // decrement
        num--; // 5, same as num -= 1

        boolean variable = true;

        // ! negation, invert boolean
        variable = !variable; // false
        variable = !variable; // true

        //// ternary operators, boolean
        int a = 5,
            b = 10;

        boolean result = a < b ? true : false;

        //// comparison operators
        int num1 = 1;
        int num2 = 2;

        // ==, equals
        boolean yesOrNot = num1 == num2; // false

        // !=, different
        yesOrNot = num1 != num2; // true

        // >, greater than or, >= greater or equal to
        yesOrNot = num1 > num2; // false

        // <, less than or, <= less or equal to
        yesOrNot = num1 < num2; // true


        // object comparison
        String name1 = "Joao";
        String name2 = "Joao";

        name1.equals(name2); // true

        //// logical operators
        boolean condition1 = true;
        boolean condition2 = true;
        int num123 = 123;
        int num321 = 321;

        // &&, and
        if (condition1 && condition2 && (num321 > num123))
            System.out.println("all conditions are true");

        // ||, or
        if (condition1 || condition2)
            System.out.println("at least 1 are true");

        System.out.println("end");
    }
}
