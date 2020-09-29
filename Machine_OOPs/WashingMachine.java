package Machine_OOPs;

abstract public class WashingMachine implements IMachine {
    public boolean isHomeAppliance() {
        return true;
    }
    public boolean isOfficeAppliance() {
        return false;
    }
    public boolean isHeavyAppliance() {
        return false;
    }
    abstract public boolean isAutomatic();
    abstract public boolean isSemiAutomatic();
    abstract public void runMachine();
}
