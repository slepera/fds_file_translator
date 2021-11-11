package plt.fds.filetranslator.format_manager;

import com.google.gson.Gson;
import plt.fds.filetranslator.data_models.FDSLog;
import plt.fds.filetranslator.data_models.LogType;
import plt.fds.filetranslator.data_models.SystemReportType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FDSLogGenerator {

    static String new_line = "\n";

    public static String BuildFDSLogHeader (LogType logType) {
    //check if it works without setter and getter
        Gson gson = new Gson();
        String jsonObj = gson.toJson(logType);

        System.out.println ("JSON Obj: " + jsonObj);
        return jsonObj;
    }

    public static void CreateFDSLogFile (FDSLog fdsLog) throws IOException {

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        File fdslog_file = new File ("./data/output/FDS_Log_file/fdsLog " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt");
        BufferedWriter fdslog_bw = new BufferedWriter(new FileWriter(fdslog_file));

        String header = BuildFDSLogHeader(fdsLog.logType) + new_line + new_line + new_line;
        fdslog_bw.write(header);

        for (int i = 0; i < fdsLog.logType.logEntryType.size(); i++) {
            String body = fdsLog.logType.logEntryType.get(i).logTimestamp + " " + fdsLog.logType.logEntryType.get(i).severityLevel + " "
                    + fdsLog.logType.logEntryType.get(i).processName + " " + fdsLog.logType.logEntryType.get(i).logMessage + " "
                    + fdsLog.logType.logEntryType.get(i).eventID + new_line;

            fdslog_bw.write(body);
        }

        fdslog_bw.close();

    }

}
