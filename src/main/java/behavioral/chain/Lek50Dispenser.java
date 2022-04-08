package behavioral.chain;

public class Lek50Dispenser implements DispenceChain {
    private DispenceChain chain;

    @Override
    public void setNextChainElement(DispenceChain nextChainElement) {
        this.chain = nextChainElement;
    }

    @Override
    public void dispence(int amount) {
        if (amount >= 50) {
            int number = amount / 50;
            int remainder = amount % 50;
            System.out.println("Dorezuar : " + number + " kartemonedha 50 Lek.");
            if (remainder != 0)
                this.chain.dispence(remainder);
        } else
            this.chain.dispence(amount);
    }
}
