package plt.fds.filetranslator.format_manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import plt.fds.filetranslator.data_models.FDSLog;
import plt.fds.filetranslator.data_models.LogType;
import plt.fds.filetranslator.data_models.SystemReportType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FDSLogGenerator {
    /*
    the structure of FDSLog to be confirmed
     */

    static String new_line = "\n";

    public static String BuildFDSLogHeader (LogType logType) {
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

        //class FDSLog == class LogType
        String header = BuildFDSLogHeader(fdsLog) + new_line + new_line + new_line;
        fdslog_bw.write(header);

        for (int i = 0; i < fdsLog.logEntryType.size(); i++) {
            String body = fdsLog.logEntryType.get(i).logTimestamp + " " + fdsLog.logEntryType.get(i).severityLevel + " "
                    + fdsLog.logEntryType.get(i).processName + " " + fdsLog.logEntryType.get(i).logMessage + " "
                    + fdsLog.logEntryType.get(i).eventID + new_line;

            fdslog_bw.write(body);
        }

        fdslog_bw.close();

    }

}
