package behavioral.state;

public class SoldOutState implements GumBallMachineState{
    GumBallMachine gumBallMachine;
    public SoldOutState(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Ju nuk mund te shtoni nje monedhe! Makina eshte bosh.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Ju nuk mund te merrni monedhe pasi nuk keni futur nje te tille");
    }

    @Override
    public void turnCrank() {
        System.out.println("Makinera eshte bosh.");
    }

    @Override
    public void dispense() {
        System.out.println("Makinera eshte bosh.");
    }
}
