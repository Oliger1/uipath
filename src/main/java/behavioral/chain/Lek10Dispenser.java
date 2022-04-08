package behavioral.chain;

public class Lek10Dispenser implements DispenceChain {
    private DispenceChain chain;

    @Override
    public void setNextChainElement(DispenceChain nextChainElement) {
        this.chain = nextChainElement;
    }

    @Override
    public void dispence(int amount) {
        if (amount >= 10) {
            int number = amount / 10;
            int remainder = amount % 10;
            System.out.println("Dorezuar : " + number + " kartemonedha 10 Lek.");
            if (remainder != 0)
                this.chain.dispence(remainder);
        } else
            this.chain.dispence(amount);
    }
}
