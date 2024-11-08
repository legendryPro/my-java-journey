import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //  First Line
        System.out.println("Hello World");
        // Variables

        // Primitive Types
         byte age = 30;
         int phone = 123456789;
         float pi = 3.14F;
         long phone2 = 12345678910L;
         char name = 'a';
         boolean isAdult = true;
         // Non-Primitive Types
         // String name2 = "aman";
         // System.out.println(name2.length());
        // PhD on strings xd
         String a = "hello";
         String b = "World";
         String c = a + b;
        System.out.println(c);
        // charAt
        System.out.println(a.charAt(0));
        // length
        System.out.println(a.length());
        // replace
        System.out.println( b.replace('r','a'));
        //sub-string
        String idk = "Aman and Akku";
        System.out.println(idk.substring(0,3));

        // Array my fav
           int[] marks = new int[3];
             marks[0] = 97;
             marks[1] = 98;
             marks[2] = 95;
         // Length of array
        // System.out.println(marks.length);

        // Sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        // How to make array new method
        int[] marks2 = {97,98,95};
        int[][] twoDarray = {{97,98,95}, {95,95,98}};
        // how to access it
        System.out.println(twoDarray[1][0]);



    }
}
