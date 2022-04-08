package behavioral.chain;

public class Lek200Dispenser implements DispenceChain {
    private DispenceChain chain;

    @Override
    public void setNextChainElement(DispenceChain nextChainElement) {
        this.chain = nextChainElement;
    }

    @Override
    public void dispence(int amount) {
        if (amount >= 200) {
            int number = amount / 200;
            int remainder = amount % 200;
            System.out.println("Dorezuar : " + number + " kartemonedha 200 Lek.");
            if (remainder != 0)
                this.chain.dispence(remainder);
        } else
            this.chain.dispence(amount);
    }
}
