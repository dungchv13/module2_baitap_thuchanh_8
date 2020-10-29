package program;

import manage.Calculate;
import program.InputForProgram;
import quantities.Fractions;

public class Program {
    private static Fractions sp1 = new Fractions();
    private static Fractions sp2 = new Fractions();
    private static Fractions result = new Fractions();

    public static void main(String[] args) {
        sp1 = InputForProgram.inputFractions("first");
        sp2 = InputForProgram.inputFractions("second");

        Calculate calculate = new Calculate();

        do{
            System.out.println("--------CALCULATE--------");
            System.out.println("1.total");
            System.out.println("2.subtract.");
            System.out.println("3.multiply.");
            System.out.println("4.division.");
            System.out.println("0.Exit.");
            System.out.print("chose:");
            int choice = InputForProgram.inputNumber();
            switch (choice){
                case 1:
                    result = calculate.add(sp1,sp2);
                    System.out.println(result);
                    break;
                case 2:
                    result = calculate.subtract(sp1,sp2);
                    System.out.println(result);
                    break;
                case 3:
                    result = calculate.multiply(sp1,sp2);
                    System.out.println(result);
                    break;
                case 4:
                    result = calculate.divide(sp1,sp2);
                    System.out.println(result);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("not have this functions yet!");
            }

        }while(true);



    }
}
