package Machine_OOPs;

public class ColorPrinter extends Printer {


    private String ink;

    @Override
    public String getInk() {
        return ink;
    }

    ColorPrinter() {
        ink = "color ink";
    }

    public void setIntensity() {
        System.out.println("Please enter how intense you want your colors on a scale of 1-10: ");
        int num = sc.nextInt();
        System.out.println("intensity is " + num);
    }
}
