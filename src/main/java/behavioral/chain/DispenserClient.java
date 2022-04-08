package behavioral.chain;

public class DispenserClient {
    public static void main(String[] args) {
        DispenceChain chain500 = new Lek500Dispenser();
        DispenceChain chain200 = new Lek200Dispenser();
        DispenceChain chain100 = new Lek100Dispenser();
        DispenceChain chain50 = new Lek50Dispenser();
        DispenceChain chain20 = new Lek20Dispenser();
        DispenceChain chain10 = new Lek10Dispenser();
        DispenceChain chain5 = new Lek5Dispenser();
        DispenceChain chain1 = new Lek1Dispenser();

        chain500.setNextChainElement(chain200);
        chain200.setNextChainElement(chain100);
        chain100.setNextChainElement(chain50);
        chain50.setNextChainElement(chain20);
        chain20.setNextChainElement(chain10);
        chain10.setNextChainElement(chain5);
        chain5.setNextChainElement(chain1);

        int amount = 567;
        chain500.dispence(amount);

    }
}
