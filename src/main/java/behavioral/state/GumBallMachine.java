package behavioral.state;

public class GumBallMachine {
    private GumBallMachineState soldOutState;
    private GumBallMachineState soldState;
    private GumBallMachineState hasCoinState;
    private GumBallMachineState noCoinState;
    private GumBallMachineState state = noCoinState;

    private int amount;

    public GumBallMachine(int numberOfGumballs){
        this.amount = numberOfGumballs;
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasCoinState = new HasCoinState(this);
        noCoinState = new NoCoinState(this);
        if(numberOfGumballs>0)
            state = noCoinState;

    }
    public GumBallMachineState getState() {
        return state;
    }

    public void setState(GumBallMachineState state) {
        this.state = state;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public GumBallMachineState getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(GumBallMachineState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public GumBallMachineState getSoldState() {
        return soldState;
    }

    public void setSoldState(GumBallMachineState soldState) {
        this.soldState = soldState;
    }

    public GumBallMachineState getHasCoinState() {
        return hasCoinState;
    }

    public void setHasCoinState(GumBallMachineState hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    public GumBallMachineState getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(GumBallMachineState noCoinState) {
        this.noCoinState = noCoinState;
    }

    public void insertCoin(){
        this.state.insertCoin();
    }
    public void ejectCoin(){
        this.state.ejectCoin();
    }
    public void turnCrank(){
        this.state.turnCrank();
        this.state.dispense();
    }
    void releaseBall(){
        if(amount != 0)
            amount = amount-1;
    }
}
