package plt.fds.filetranslator.data_models;

public class SignalHeaderType extends HeaderType{

    public String signalID;
    public String recipientID;
    //public TimeWindowType validityTimeWindow;
    public String validityTimeWindow;

    public SignalHeaderType()
    {
        this.signalID = new String();
        this.recipientID = new String();
        this.validityTimeWindow = new String();
    }

    public String getSignalID() {
        return signalID;
    }

    public void setSignalID(String signalID) {
        this.signalID = signalID;
    }

    public String getRecipientID() {
        return recipientID;
    }

    public void setRecipientID(String recipientID) {
        this.recipientID = recipientID;
    }

    public String getValidityTimeWindow() {
        return validityTimeWindow;
    }

    public void setValidityTimeWindow(String validityTimeWindow) {
        this.validityTimeWindow = validityTimeWindow;
    }

}