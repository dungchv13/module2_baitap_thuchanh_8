package program;

import quantities.Fractions;

import java.util.Scanner;

public class InputForProgram {
    private static Scanner input = new Scanner(System.in);

    public static Fractions inputFractions(String str){
        System.out.print("Enter numerator for "+str+" fractions:");
        int numerator = inputNumber();
        System.out.print("Enter denominator for "+str+" fractions:");
        int denominator = inputDenominator();

        return new Fractions(numerator,denominator);
    }

    public static int inputNumber(){
        try{
            return Integer.parseInt(input.nextLine());
        }catch (Exception e){
            System.out.println("must input int number!");
            System.out.print("Re-Enter:");
            return inputNumber();
        }
    }


    public static int inputDenominator(){
        int result = 1;
        try{
            result = Integer.parseInt(input.nextLine());
            if(result == 0){
                throw new ArithmeticException();
            }
        }catch (ArithmeticException a){
            System.out.println("Denominator cant equals to zero!");
            System.out.print("Re-Enter:");
            result = inputDenominator();
        }catch (Exception e){
            System.out.println("must input int number!");
            System.out.print("Re-Enter:");
            result = inputDenominator();
        }
        return result;
    }
}
