package behavioral.chain;

public class Lek1Dispenser implements DispenceChain {
    private DispenceChain chain;

    @Override
    public void setNextChainElement(DispenceChain nextChainElement) {
        this.chain = nextChainElement;
    }

    @Override
    public void dispence(int amount) {
        if (amount >= 1) {
            int number = amount;
            System.out.println("Dorezuar : " + number + " kartemonedha 1 Lek.");
        } else
            this.chain.dispence(amount);
    }
}
