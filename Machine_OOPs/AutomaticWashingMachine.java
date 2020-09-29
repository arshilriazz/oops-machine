package Machine_OOPs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AutomaticWashingMachine extends WashingMachine {
    Scanner sc = new Scanner(System.in);

    private boolean dryer = false;

    private final List<Integer> variousRunTimes = Arrays.asList(10, 15, 20);

    @Override
    public boolean isAutomatic() {
        return true;
    }

    @Override
    public boolean isSemiAutomatic() {
        return false;
    }

    public void dryerCondition(int number) {
        if(number == 1) dryer = true;
    }

    @Override
    public void runMachine() {
        System.out.println("Select the type of clothes that are in the " +
                           "machine \n1. cotton \n2. wool \n3. silk");
        System.out.print("enter the number: ");
        int numberClothes = sc.nextInt();
        System.out.print("\npress 1 to switch on the dryer or 0 to not: ");
        int numberDryer = sc.nextInt();
        dryerCondition(numberDryer - 1);
        int time = variousRunTimes.get(numberClothes - 1) + 5;
        if(dryer) {
            System.out.println("machine ran for " + variousRunTimes.get(numberClothes - 1) +
                    " minutes come after " + time + " minutes to collect the clothes");
        }
        else {
            System.out.println("machine ran for " + variousRunTimes.get(numberClothes - 1) +
                    " minutes come after " + time + " minutes to dry the clothes");
        }
    }
}