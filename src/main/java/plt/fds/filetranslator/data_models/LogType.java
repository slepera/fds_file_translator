package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class LogType {

    //public StrLogFileName logName;
    public String logName;
    public transient ArrayList <LogEntryType> logEntryType;

    public LogType(){
        logName = new String();
        logEntryType = new ArrayList<>();
    }

    public void addLogEntryType (LogEntryType logEntryType) {
        this.logEntryType.add(logEntryType);
    }
}
