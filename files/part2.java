import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        // Casting
       double price = 100.00;
       double finalPrice = price + 18;


        // int p = 100;
        // int fP = p + 18.0;
        // Implicit Casting = Small Type to Big Type storing Allowed By Java
        // Explicit Casting = Big Type To Small Type storing Java dont allow but we can say 'Please Java I own You You need to do it'
        int p = 100;
         int fP = p + (int)18.0;
         // Operators
        // Arithemetic
        int a = 1;
        int b = 2;
        int sum = a / b; // * / + - %
        System.out.println(sum);

        // unery ops
        int numb = 1;
        System.out.println(numb--);
        System.out.println(numb);

        // Maths Class
        System.out.println(Math.min(6,7));
        // Random
        System.out.println(Math.random()*100);

        // Input - Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Age : ");
        int age = sc.nextInt();
        System.out.println(age);

        // For String
        Scanner scr = new Scanner(System.in);
        System.out.println("Input Your Name :");
        String name = sc.next();
        System.out.println(name);
        // It Only Tke Single World Known as Token add nextLine()
        // Scanner scr = new Scanner(System.in);
        // System.out.println("Input Your Name :");
        // String name = sc.nextLine();
        // System.out.println(name);

        // Comparision Operators
        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b

        // If Else
        boolean isSunUp = true;
        if(isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");

        // logical operator
        // &&
        int no1 = 30;
        int no2 = 40;
        if(a < 50 && b < 50)
            System.out.println("both less than 50");
        else
            System.out.println("more than 50");

        // ||
        no1 = 40;
        no2 = 60;
        if(a < 50 && b < 50)
            System.out.println("atleast one less than 50");
        else
            System.out.println("both is more than 50");
        // One More Way
        boolean isAdult = false;
        if(isAdult)
            System.out.println("is adult");
        else
            System.out.println("not adult");

        // Code will be okay Java will say okay i will add isAdult == Ture coder is lazy
        // also you can use not operator !
        boolean isAdult2 = false;
        if(!isAdult2)
            System.out.println("is adult");
        else
            System.out.println("not adult");
        // Not ops means false


        // Conditional statement
        // after if else we learn - SWITCH
        int day = 1; // 1 - monday; 2- tuesday
        switch(day) {
            case 1 :
                System.out.println("monday");
            case 2 :
                System.out.println("tuesday");
            default:
                System.out.println("web - sun");
        }
        // its just like if else but in switch you can check more than 2 conditions and default for other
        // statement it depends on you add default or not
        // also switch have a cons if one statement match all statement will run
        // to fix it we use break keyword used like break;
        /*
        * int day = 1; // 1 - monday; 2- tuesday
        switch(day) {
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            default:
                System.out.println("web - sun");
        }
        * */
        // Loops
        // First For Loop
        for(int i =0; i<=100; i++){
            System.out.println(i);
        }

    }
}
