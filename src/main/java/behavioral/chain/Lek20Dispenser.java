package behavioral.chain;

public class Lek20Dispenser implements DispenceChain {
    private DispenceChain chain;

    @Override
    public void setNextChainElement(DispenceChain nextChainElement) {
        this.chain = nextChainElement;
    }

    @Override
    public void dispence(int amount) {
        if (amount >= 20) {
            int number = amount / 20;
            int remainder = amount % 20;
            System.out.println("Dorezuar : " + number + " kartemonedha 20 Lek.");
            if (remainder != 0)
                this.chain.dispence(remainder);
        } else
            this.chain.dispence(amount);
    }
}
