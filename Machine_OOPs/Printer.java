package Machine_OOPs;

import java.util.Scanner;

public abstract class Printer implements IMachine {
    Scanner sc = new Scanner(System.in);

    private int noOfPapers = 1000;

    @Override
    public boolean isHomeAppliance() {
        return true;
    }
    @Override
    public boolean isOfficeAppliance() {
        return true;
    }
    @Override
    public boolean isHeavyAppliance() {
        return false;
    }
    public abstract String getInk();
    public void getNoOfPapers() {
        System.out.println(noOfPapers + " papers are left");
    }
    public void addPapers() {
        noOfPapers = 1000;
    }
    void printNoOfPapers(int number) {
        System.out.println("printed " + number + " papers");
        noOfPapers -= number;
    }
    public void printPapers(int number) {
        if(number > noOfPapers) {
            System.out.print("Cannot print not enough papers \nDo you want to fill the papers? yes/no : ");
            String ans = sc.next();
            if(ans.equals("no")) {
                System.out.println("Sorry out of papers");
                return;
            }
            else if(ans.equals("yes")) {
                addPapers();
            }
        }
        printNoOfPapers(number);
    }
}
