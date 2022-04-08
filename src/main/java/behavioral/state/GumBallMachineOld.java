package behavioral.state;

public class GumBallMachineOld {
    final static int SOLD_OUT = 0;
    final static int NO_COIN = 1;
    final static int HAS_COIN = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;
    public GumBallMachineOld(int count){
        this.count = count;
        if (this.count>0)
            this.state = NO_COIN;
    }

    public void insertCoin(){
        if(state == HAS_COIN)
            System.out.println("Ju tashme keni futur nje monedhe dhe nuk mund te fusni nje tjeter!");
        if(state == NO_COIN) {
            this.state = HAS_COIN;
            System.out.println("You sapo shtuat nje monedhe.");
        }
        if(state == SOLD_OUT)
        {
            System.out.println("Ju nuk mund te shtoni nje monedhe! Makina eshte bosh.");
        }
        if(state == SOLD){
            System.out.println("Prisni te merrni camcakezin tuaj para se te fusni nje monedhe tjeter");
        }
    }

    public void ejectCoin(){
        if(state == HAS_COIN) {
            System.out.println("Merrni monedhen tuaj!");
            this.state = NO_COIN;
        }
        if(state == NO_COIN) {
            System.out.println("Ju nuk keni asnje monedhe per te marre.");
        }
        if(state == SOLD_OUT)
        {
            System.out.println("Ju nuk mund te merrni monedhe pasi nuk keni futur nje te tille");
        }
        if(state == SOLD){
            System.out.println("Ju nuk mund te merrni monedhe pasi keni kryer blerjen tuaj.");
        }
    }

    public void turnCrank(){
        if(state == HAS_COIN) {
            System.out.println("Transaksioni po kryhet.");
            this.state = SOLD;
        }
        if(state == NO_COIN) {
            System.out.println("Ju nuk mund te merrni camcakez pa futur monedhe.");
        }
        if(state == SOLD_OUT)
        {
            System.out.println("Makinera eshte bosh.");
        }
        if(state == SOLD){
            System.out.println("Ju nuk mund te merrni camcakez pa mbaruar transaksioni i pare.");
        }
    }

    public void dispense(){
        if(state == HAS_COIN) {
            System.out.println("Nuk u nxorr asnje camcakez.");
            this.state = SOLD;
        }
        if(state == NO_COIN) {
            System.out.println("Ju duhet te paguani me pare.");
        }
        if(state == SOLD_OUT)
        {
            System.out.println("Makinera eshte bosh.");
        }
        if(state == SOLD){
            System.out.println("Camcakezi po del ...");
            count = count -1;
            if(count == 0)
            {
                System.out.println("Makineria tashme eshte bosh!");
                state = SOLD_OUT;
            }
            else
                state= NO_COIN;
        }
    }
}
