public class part4 {
    public static void printJava() {
        System.out.println("Hello Java");
    }
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // Exception - TRY and CATCH
        int[] stu = {87,23,234};
        int[][] stu2 = {{232,242,4311,412},{2323,2332,2342}};
        try{
            System.out.println(stu[4]);
        } catch(Exception expection) {
            System.out.println("There is a expection");
        }

        System.out.println("This student name is Aman");

        // Functions/Method
        // Methods
        printJava();
        printJava();
        printName("Aman");
        printSum(1,6);
    }
}
