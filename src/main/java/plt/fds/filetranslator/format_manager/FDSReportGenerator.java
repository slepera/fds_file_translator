package plt.fds.filetranslator.format_manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import plt.fds.filetranslator.Utilities;
import plt.fds.filetranslator.data_models.FDSReport;
import plt.fds.filetranslator.data_models.SystemReportType;
import plt.fds.filetranslator.exceptions.OutOfRangeException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FDSReportGenerator {
       /*
    the structure of FDSReport to be confirmed
     */

    static String new_line = "\n";

    public static String BuildFDSReportHeader (SystemReportType systemReportType) {

        //Gson gson = new Gson(); //exclude the transient fields
        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
        String jsonObj = gson.toJson(systemReportType);

        return jsonObj;
    }

    public static void CreateFDSReportFile (FDSReport fdsReport) throws IOException {

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        File fdsrecords_file = new File ("./data/output/FDS_Records_file/fdsRecord " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt");
        BufferedWriter fdsrecord_bw = new BufferedWriter(new FileWriter(fdsrecords_file));

        //class FDSReport == class SystemReportType
        String header = BuildFDSReportHeader(fdsReport) + new_line + new_line + new_line;
        fdsrecord_bw.write(header);

        //String body = "";
        for (int i = 0; i < fdsReport.keyParamBodyType.size(); i++) {
            String body = "";
            String paramTimestamp;
            for (int j = 0; j < fdsReport.keyParamBodyType.get(i).keyParamTimestamp.size(); j++) {
                if (j == (fdsReport.keyParamBodyType.get(i).keyParamTimestamp.size()) -1) {
                    paramTimestamp = fdsReport.keyParamBodyType.get(i).keyParamTimestamp.get(j) + " ";
                } else {
                    paramTimestamp = fdsReport.keyParamBodyType.get(i).keyParamTimestamp.get(j) + "|";
                }
                body += paramTimestamp;
            }

            String paramValue;
            for (int j = 0; j < fdsReport.keyParamBodyType.get(i).keyParamValue.size(); j++) {
                if (j == (fdsReport.keyParamBodyType.get(i).keyParamValue.size()) -1) {
                    paramValue = fdsReport.keyParamBodyType.get(i).keyParamValue.get(j) + " ";
                } else {
                    paramValue = fdsReport.keyParamBodyType.get(i).keyParamValue.get(j) + "|";
                }
                body += paramValue;
            }

            String paramEngineeringValue;
            for (int j = 0; j < fdsReport.keyParamBodyType.get(i).keyParamEngineeringValue.size(); j++) {
                if (j == (fdsReport.keyParamBodyType.get(i).keyParamEngineeringValue.size()) -1) {
                    paramEngineeringValue = fdsReport.keyParamBodyType.get(i).keyParamEngineeringValue.get(j) + " ";
                } else {
                    paramEngineeringValue = fdsReport.keyParamBodyType.get(i).keyParamEngineeringValue.get(j) + "|";
                }
                body += paramEngineeringValue;
            }
            body += fdsReport.keyParamBodyType.get(i).reportMessage + new_line;
            fdsrecord_bw.write(body);
        }

        //fdsrecord_bw.write(body);
        fdsrecord_bw.close();


    }

}
