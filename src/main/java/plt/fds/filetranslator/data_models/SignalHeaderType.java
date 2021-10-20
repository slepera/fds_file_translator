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

}