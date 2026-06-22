public class IT26100171Lab9Q3 {
    public static int add(int a, int b) { return a + b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int square(int a) { return multiply(a, a); } // reuses multiply
    public static void main(String[] args) {
        // (3*4 + 5*7)^2
        int expression1 = square(add(multiply(3,4), multiply(5,7)));
        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + expression1);
        // (4+7)^2 + (8+3)^2
        int expression2 = add(square(add(4,7)), square(add(8,3)));
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + expression2);
    }
}