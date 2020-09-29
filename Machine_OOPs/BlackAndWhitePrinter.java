package Machine_OOPs;

public class BlackAndWhitePrinter extends Printer{
    private String ink;
    private int flag;

    @Override
    public String getInk() {
        return ink;
    }

    BlackAndWhitePrinter() {
        this.ink = "black and white";
        this.flag = 0;
    }
    public void inverseInk() {
        if(flag == 0) {
            flag = 1;
            System.out.println("printing letters in black");
        } else {
            flag = 0;
            System.out.println("printing letters in white");
        }
    }
}
