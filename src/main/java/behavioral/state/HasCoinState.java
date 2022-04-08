package behavioral.state;

public class HasCoinState implements  GumBallMachineState{
    GumBallMachine gumBallMachine;
    public HasCoinState(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Ju nuk mund te shtoni nje monedhe te re pa mbaruar transaksioni i monedhes se pare.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Ju mund te merrni monedhen tuaj...");
        this.gumBallMachine.setState(this.gumBallMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Blerja e camcakezit u krye.");
        this.gumBallMachine.setState(this.gumBallMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Prisni kryerjen e transaksionit perpara se te merrni camcakezin tuaj.");
    }
}
