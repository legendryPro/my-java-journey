public class part3 {
    public static void main(String[] args) {
        // Loops
        // First For Loop
        for(int i =0; i <= 10; i++){
            System.out.println(i);
        }
        // While Loop
        int ik = 10;
        while(ik >= 1) {
          System.out.println(ik);
            ik--;
        }
        // Do While
        int k = 100;
        do {
            System.out.println(k);
            k--;
        } while(k>= 1);

        // Break and Continue
        int i = 0;
        while(true) {
            if(i == 3){
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i++;
            if(i > 5){
                break;
            }


        }
    }
}
