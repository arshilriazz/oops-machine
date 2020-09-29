package Machine_OOPs;

public class Main {
    public static void main(String[] args) {
//        BlackAndWhitePrinter printer = new BlackAndWhitePrinter();
//        printer.printPapers(500);
//        printer.printPapers(600);
//        printer.inverseInk();
//        printer.inverseInk();
//        ColorPrinter colorPrinter = new ColorPrinter();
//        colorPrinter.setIntensity();

        AutomaticWashingMachine washingMachine = new AutomaticWashingMachine();
        washingMachine.runMachine();
        SemiAutomaticWashingMachine washingMachine1 = new SemiAutomaticWashingMachine();
        washingMachine1.runMachine();
    }
}