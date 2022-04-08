package behavioral.state;

public class SoldState implements GumBallMachineState {
    GumBallMachine gumBallMachine;
    public SoldState(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Ju nuk mund te fusni nje monedhe te re pa mbaruar transaksioni i pare.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Ju nuk mund te merrni monedhen tuaj pasi transaksioni po kryhet.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Ju nuk mund te rretulloni dy here leven per te marre camcakezin.");
    }

    @Override
    public void dispense() {
        System.out.println("Merrni camcakezin ");
        this.gumBallMachine.releaseBall();
        if(this.gumBallMachine.getAmount()>0) {
            this.gumBallMachine.setState(this.gumBallMachine.getNoCoinState());
        }
        else {
            this.gumBallMachine.setState(this.gumBallMachine.getSoldOutState());
        }

    }
}
