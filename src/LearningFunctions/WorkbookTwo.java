package LearningFunctions;

public class WorkbookTwo {
    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");

        tipTheWaiter(bill);
    }

    public static void tipTheWaiter(double bill){
        double tip = bill * 0.15;
        System.out.println("Your service was wonderful! Please, accept this tip " + tip);
    }
}
