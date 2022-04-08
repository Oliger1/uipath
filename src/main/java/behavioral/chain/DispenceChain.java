package behavioral.chain;

public interface DispenceChain {
    void setNextChainElement(DispenceChain nextChainElement);

    void dispence(int amount);
}
