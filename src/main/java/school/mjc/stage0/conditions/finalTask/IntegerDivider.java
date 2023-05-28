package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        switch (divider){
            case 0:
                System.out.println("division by zero");
                break;
            default:
                int division = dividend / divider;
                int product = division * divider;
                if (product == dividend){
                    System.out.println("can be divided completely");
                } else {
                    System.out.println("cannot be divided completely");
                }
                break;
        }


    }
    public static void main(String[] args) {
        IntegerDivider completelyDivided = new IntegerDivider();

        completelyDivided.printCompletelyDivided(25, 2);
    }

}
