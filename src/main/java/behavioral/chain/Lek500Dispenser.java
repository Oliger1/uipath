package behavioral.chain;

public class Lek500Dispenser implements DispenceChain {
    private DispenceChain chain;

    @Override
    public void setNextChainElement(DispenceChain nextChainElement) {
        this.chain = nextChainElement;
    }

    @Override
    public void dispence(int amount) {
        if (amount >= 500) {
            int number = amount / 500;
            int remainder = amount % 500;
            System.out.println("Dorezuar : " + number + " kartemonedha 500 Lek.");
            if (remainder != 0)
                this.chain.dispence(remainder);
        } else
            this.chain.dispence(amount);

    }
}
