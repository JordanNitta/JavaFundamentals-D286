package BooleansAndConditionals;

public class AssignmentOne {
    public static void main(String[] args) {
        int gryffindor = 400;
        int ravenclaw = 200;


        int margin = gryffindor -= ravenclaw;

        if(margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin >= 0) {
            System.out.println("Gryffindor is in second place");
        } else if (margin >= -100) {
            System.out.println("Gryffindor is in third place");
        } else {
            System.out.println("Gryffindor is in fourth place");
        }
    }
}
