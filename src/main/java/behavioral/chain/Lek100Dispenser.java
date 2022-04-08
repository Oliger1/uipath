package behavioral.chain;

public class Lek100Dispenser implements DispenceChain {
    private DispenceChain chain;

    @Override
    public void setNextChainElement(DispenceChain nextChainElement) {
        this.chain = nextChainElement;
    }

    @Override
    public void dispence(int amount) {
        if (amount >= 100) {
            int number = amount / 100;
            int remainder = amount % 100;
            System.out.println("Dorezuar : " + number + " kartemonedha 100 Lek.");
            if (remainder != 0)
                this.chain.dispence(remainder);
        } else
            this.chain.dispence(amount);
    }
}
