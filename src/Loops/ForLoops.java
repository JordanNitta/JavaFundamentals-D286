package Loops;

public class ForLoops {
    public static void main(String[] args) {
        //Example 1: print numbers from 1 to 10
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Hello World!");
        }

        for(int i = 1; i <= 11; i++){
            System.out.println(i * 5);
        }

        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        for(int i = 0; i < 19; i+=2){
            System.out.println(i);
        }

        int i;
        for (i = 0; i > -3; --i) {
            System.out.print(i);
        }
    }
}
