package plt.fds.filetranslator.format_manager;

import com.google.gson.Gson;
import plt.fds.filetranslator.Utilities;
import plt.fds.filetranslator.data_models.FDSFileHeader;
import plt.fds.filetranslator.data_models.ProcessedAttitude;
import plt.fds.filetranslator.exceptions.OutOfRangeException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ProcessedAttitudeGenerator {

    static String new_line = "\n";

    static final int MJD_EPOCH = 15;
    static final int QUATERNIONS = 8;
    static final int X_ANGULARVELOCITY = 12;
    static final int Y_ANGULARVELOCITY = 12;
    static final int Z_ANGULARVELOCITY = 12;

    public static String BuildHeaderProcessedOrbits (FDSFileHeader fdsFileHeader) {

        Gson gson = new Gson();
        String jsonObj = gson.toJson(fdsFileHeader);

        return jsonObj;
    }

    public static void CreateProcessedOrbitsFile (ProcessedAttitude processedAttitude) throws OutOfRangeException {

        String header = BuildHeaderProcessedOrbits(processedAttitude.fdsFileHeader) + new_line + new_line + new_line;

        ArrayList<String> body_ProcessedAttitude = new ArrayList<>();

        try {

            for (int i = 0; i < processedAttitude.attitudeRecords.size(); i++) {
                String body = Utilities.LeftJustify(processedAttitude.attitudeRecords.get(i).mjdEpoch, MJD_EPOCH) + " "
                        + Utilities.LeftJustify(processedAttitude.attitudeRecords.get(i).quaternion.q1, QUATERNIONS) + " "
                        + Utilities.LeftJustify(processedAttitude.attitudeRecords.get(i).quaternion.q2, QUATERNIONS) + " "
                        + Utilities.LeftJustify(processedAttitude.attitudeRecords.get(i).quaternion.q3, QUATERNIONS) + " "
                        + Utilities.LeftJustify(processedAttitude.attitudeRecords.get(i).quaternion.q4, QUATERNIONS) + " "
                        + Utilities.LeftJustify(processedAttitude.attitudeRecords.get(i).angularVelocity.x, X_ANGULARVELOCITY) + " "
                        + Utilities.LeftJustify(processedAttitude.attitudeRecords.get(i).angularVelocity.y, Y_ANGULARVELOCITY) + " "
                        + Utilities.LeftJustify(processedAttitude.attitudeRecords.get(i).angularVelocity.z, Z_ANGULARVELOCITY) + new_line;

                body_ProcessedAttitude.add(body);
            }

            String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
            DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
            File processatt_file = new File ("./data/output/processed_attitude_file/process_attitude " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt");
            BufferedWriter processatt_bw = new BufferedWriter(new FileWriter(processatt_file));
            processatt_bw.write(header);

            for (int i = 0; i < body_ProcessedAttitude.size(); i++) {
                processatt_bw.write(body_ProcessedAttitude.get(i));
            }

            processatt_bw.close();

        } catch (OutOfRangeException | IOException outOfRangeException) {
            outOfRangeException.printStackTrace();
            System.out.println( "Processed Attitude File no created" );
        }
    }


}
