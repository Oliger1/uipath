package behavioral.mediator;

public class WarningMessage implements Component {
    Mediator mediator;

    public void showWarningMessage() {
        System.out.println("A jeni te sigurte?");
    }

    public void hideWarning() {
        System.out.println(" ");
    }

    @Override
    public void sendRequest() {
        mediator.sendInfo(this, "WarningMessage");
    }

    @Override
    public void sendRequest(String context) {
        Component.super.sendRequest(context);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
