package plt.fds.filetranslator.format_manager;

import com.google.gson.Gson;
import plt.fds.filetranslator.Utilities;
import plt.fds.filetranslator.data_models.FDSReport;
import plt.fds.filetranslator.data_models.SystemReportType;
import plt.fds.filetranslator.exceptions.OutOfRangeException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FDSReportGenerator {

    static String new_line = "\n";

    public static String BuildFDSReportHeader (SystemReportType systemReportType) {

        Gson gson = new Gson();
        String jsonObj = gson.toJson(systemReportType);

        return jsonObj;
    }

    public static void CreateFDSReportFile (FDSReport fdsReport) throws IOException {

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        File fdsrecords_file = new File ("./data/output/FDS_Records_file/fdsRecord " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt");
        BufferedWriter fdsrecord_bw = new BufferedWriter(new FileWriter(fdsrecords_file));

        String header = BuildFDSReportHeader(fdsReport.systemReportType) + new_line + new_line + new_line;
        fdsrecord_bw.write(header);

        //String body = "";
        for (int i = 0; i < fdsReport.systemReportType.keyParamBodyType.size(); i++) {
            String body = "";
            String paramTimestamp;
            for (int j = 0; j < fdsReport.systemReportType.keyParamBodyType.get(i).keyParamTimestamp.size(); j++) {
                if (j == (fdsReport.systemReportType.keyParamBodyType.get(i).keyParamTimestamp.size()) -1) {
                    paramTimestamp = fdsReport.systemReportType.keyParamBodyType.get(i).keyParamTimestamp.get(j) + " ";
                } else {
                    paramTimestamp = fdsReport.systemReportType.keyParamBodyType.get(i).keyParamTimestamp.get(j) + "|";
                }
                body += paramTimestamp;
            }

            String paramValue;
            for (int j = 0; j < fdsReport.systemReportType.keyParamBodyType.get(i).keyParamValue.size(); j++) {
                if (j == (fdsReport.systemReportType.keyParamBodyType.get(i).keyParamValue.size()) -1) {
                    paramValue = fdsReport.systemReportType.keyParamBodyType.get(i).keyParamValue.get(j) + " ";
                } else {
                    paramValue = fdsReport.systemReportType.keyParamBodyType.get(i).keyParamValue.get(j) + "|";
                }
                body += paramValue;
            }

            String paramEngineeringValue;
            for (int j = 0; j < fdsReport.systemReportType.keyParamBodyType.get(i).keyParamEngineeringValue.size(); j++) {
                if (j == (fdsReport.systemReportType.keyParamBodyType.get(i).keyParamEngineeringValue.size()) -1) {
                    paramEngineeringValue = fdsReport.systemReportType.keyParamBodyType.get(i).keyParamEngineeringValue.get(j) + " ";
                } else {
                    paramEngineeringValue = fdsReport.systemReportType.keyParamBodyType.get(i).keyParamEngineeringValue.get(j) + "|";
                }
                body += paramEngineeringValue;
            }
            body += fdsReport.systemReportType.keyParamBodyType.get(i).reportMessage + new_line;
            fdsrecord_bw.write(body);
        }

        //fdsrecord_bw.write(body);
        fdsrecord_bw.close();


    }

}
