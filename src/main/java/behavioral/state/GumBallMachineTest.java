package behavioral.state;

public class GumBallMachineTest {
    public static void main(String[] args){
        GumBallMachine gumBallMachine = new GumBallMachine(7);
        gumBallMachine.insertCoin();
        gumBallMachine.turnCrank();
        gumBallMachine.insertCoin();
    }
}
