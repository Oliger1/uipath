package behavioral.mediator;

import javax.print.attribute.standard.Media;

public class SelectOptions implements Component {
    private Mediator mediator;

    public void displayOptions() {
        System.out.println("Opsionet jane: Save, Load, Restart");
    }

    public void chooseSave() {
        System.out.println("Statusi u ruajt me sukses.");
    }

    public void chooseLoad() {
        System.out.println("Te dhenat u ngarkuan.");
    }

    public void chooseRestart() {
        System.out.println("Restart...");
    }

    public void hideOptions() {
        System.out.println("Fshehje e opsioneve");
    }

    @Override
    public void sendRequest() {
        mediator.sendInfo(this, "displayOptions");
    }

    @Override
    public void sendRequest(String context) {
        mediator.sendInfo(this, context);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
