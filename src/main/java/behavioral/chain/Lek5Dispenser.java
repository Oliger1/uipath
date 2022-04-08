package behavioral.chain;

public class Lek5Dispenser implements DispenceChain {
    private DispenceChain chain;

    @Override
    public void setNextChainElement(DispenceChain nextChainElement) {
        this.chain = nextChainElement;
    }

    @Override
    public void dispence(int amount) {
        if (amount >= 5) {
            int number = amount / 5;
            int remainder = amount % 5;
            System.out.println("Dorezuar : " + number + " kartemonedha 5 Lek.");
            if (remainder != 0)
                this.chain.dispence(remainder);
        } else
            this.chain.dispence(amount);
    }
}
