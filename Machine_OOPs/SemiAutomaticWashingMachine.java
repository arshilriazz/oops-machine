package Machine_OOPs;

import java.util.*;

public class SemiAutomaticWashingMachine extends WashingMachine {
    Scanner sc = new Scanner(System.in);

    private final List<Integer> variousRunTimes = Arrays.asList(10, 15, 20);

    @Override
    public boolean isAutomatic() {
        return false;
    }

    @Override
    public boolean isSemiAutomatic() {
        return true;
    }

    @Override
    public void runMachine() {
        System.out.println("How many minutes do you want to run the machine \n1. 10 \n2. 15 \n3. 20");
        System.out.print("enter the number: ");
        int numberMinutes = sc.nextInt();
        int time = variousRunTimes.get(numberMinutes - 1)+5;
        System.out.println("machine ran for " + variousRunTimes.get(numberMinutes - 1) + " minutes come after " +
                            time + " minutes to dry the clothes");
    }
}