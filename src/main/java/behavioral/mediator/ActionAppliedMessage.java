package behavioral.mediator;

public class ActionAppliedMessage implements Component {
    private Mediator mediator;

    @Override
    public void sendRequest() {
        mediator.sendInfo(this, "ActionAppliedMessage");
    }

    public void displayInfo() {
        System.out.println("Info: Veprimi u aplikua me sukses.");
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
