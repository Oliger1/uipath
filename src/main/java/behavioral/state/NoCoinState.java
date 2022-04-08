package behavioral.state;

public class NoCoinState implements  GumBallMachineState{
    GumBallMachine gumBallMachine;
    public NoCoinState(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Ju sapo futet nje monedhe. Prisni perfundimin e transaksionit.");
        this.gumBallMachine.setState(this.gumBallMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("Ju nuk mund te merrni nje monedhe nese nuk keni futur nje te tille.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Ju nuk mund te rretulloni leven nese nuk keni kryer nje blerje.");
    }

    @Override
    public void dispense() {
        System.out.println("Ju nuk mund te merrni nje camcakez nese nuk keni futur monedhe.");
    }
}
