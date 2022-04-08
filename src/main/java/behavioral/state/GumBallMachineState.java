package behavioral.state;

public interface GumBallMachineState {
    public void insertCoin();
    public void ejectCoin();
    public void turnCrank();
    public void dispense();
}
