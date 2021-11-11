package plt.fds.filetranslator.data_models;

public class LogEntryType {

    //public DateTimeType logTimestamp;
    public String logTimestamp;
    //public EnumLogLevel severityLevel;
    public String severityLevel;
    public String processName;
    public String logMessage;
    public String eventID;

    public LogEntryType() {
        logTimestamp = new String();
        severityLevel = new String();
        processName = new String();
        logMessage = new String();
        eventID = new String();
    }
}
