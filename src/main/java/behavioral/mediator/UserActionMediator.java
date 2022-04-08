package behavioral.mediator;

public class UserActionMediator implements Mediator {
    private final ActionAppliedMessage acctionAppliedMessage;
    private final SelectOptions selectOptions;
    private final WarningMessage warningMessage;

    public UserActionMediator(final ActionAppliedMessage acctionAppliedMessage,
                              final SelectOptions selectOptions, final WarningMessage warningMessage) {
        this.acctionAppliedMessage = acctionAppliedMessage;
        this.selectOptions = selectOptions;
        this.warningMessage = warningMessage;
        acctionAppliedMessage.setMediator(this);
        selectOptions.setMediator(this);
        warningMessage.setMediator(this);
    }

    @Override
    public void sendInfo(Object requester, String context) {
        if (requester == acctionAppliedMessage) {
            acctionAppliedMessage.displayInfo();
            warningMessage.hideWarning();
            selectOptions.hideOptions();
        } else if (requester == selectOptions) {
            switch (context) {
                case "load":
                    selectOptions.chooseLoad();
                    acctionAppliedMessage.displayInfo();
                    break;
                case "restart":
                    selectOptions.chooseRestart();
                    warningMessage.showWarningMessage();
                    break;
                case "save":
                    selectOptions.chooseSave();
                    acctionAppliedMessage.displayInfo();
                    break;
            }
        } else if (requester == warningMessage) {
            if (context.equals("hide"))
                warningMessage.hideWarning();
            else
                warningMessage.showWarningMessage();
        }
    }
}
