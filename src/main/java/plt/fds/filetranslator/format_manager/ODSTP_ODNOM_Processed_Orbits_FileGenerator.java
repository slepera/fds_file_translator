package plt.fds.filetranslator.format_manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jdom2.Element;
import org.json.JSONObject;
import plt.fds.filetranslator.Utilities;
import plt.fds.filetranslator.data_models.*;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ODSTP_ODNOM_Processed_Orbits_FileGenerator {
    /*
    Justified to the left TO BE CONFIRMED
     */

    static String new_line = "\n";

    static final int MJD_EPOCH = 15;
    static final int X_POSITION = 12;
    static final int Y_POSITION = 12;
    static final int Z_POSITION = 12;
    static final int X_VELOCITY = 12;
    static final int Y_VELOCITY = 12;
    static final int Z_VELOCITY = 12;
    static final int SEMI_MAJOR_AXIS = 8;
    static final int ECCENTRICITY = 8;
    static final int INCLINATION = 7;
    static final int RAAN = 7;
    static final int ARG_OF_PERIGEE = 7;
    static final int TRUE_ANOMALY = 7;
    static final int COD_POD = 8; //ONLY ODSTP
    static final int FILLER_COLUMN = 8; //ONLY ODNOM 8 zeros
    static final double VAR_FILLER_COLUMN = 0;
    static final int X_SUN_DIRECTION = 12;
    static final int Y_SUN_DIRECTION = 12;
    static final int Z_SUN_DIRECTION = 12;
    static final int ECLIPSE_FLAG = 1;
    static final int ORBIT_NUMBER = 20;


    public static String BuildHeader(FDSFileHeader fdsFileHeader) {
        //JSONObject jsonObj = new JSONObject(fdsFileHeader);

        Gson gson = new Gson(); //default configuration
        /*
        pretty printing option
         */
        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonObj = gson.toJson(fdsFileHeader, fdsFileHeader.getClass());
        return jsonObj;
    }

    public static void CreateODSTPFile(ODSTP odstp) throws IOException {

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        BufferedWriter odstp_file = new BufferedWriter(new FileWriter("./data/output/ODSTP_file/odstp " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt"));

        String header = BuildHeader(odstp.fdsFileHeader) + new_line + new_line + new_line;
        odstp_file.write(header);

        for (int i = 0; i < odstp.odstpRecord.size(); i++) {
            String body = Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).mjdEpoch), MJD_EPOCH) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).position.getX()), X_POSITION) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).position.getY()), Y_POSITION) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).position.getZ()), Z_POSITION) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).velocity.getX()), X_VELOCITY) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).velocity.getY()), Y_VELOCITY) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).velocity.getZ()), Z_VELOCITY) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).keplerianElements.getSemiMajorAxis()), SEMI_MAJOR_AXIS) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).keplerianElements.getEccentricity()), ECCENTRICITY) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).keplerianElements.getInclination()), INCLINATION) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).keplerianElements.getRaan()), RAAN) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).keplerianElements.getArgOfPerigee()), ARG_OF_PERIGEE) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).keplerianElements.getTrueAnomaly()), TRUE_ANOMALY) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).delta_T_Cod_Pod), COD_POD) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).sunDirection.getX()), X_SUN_DIRECTION) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).sunDirection.getY()), Y_SUN_DIRECTION) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).sunDirection.getZ()), Z_SUN_DIRECTION) + " "
                    + Utilities.LeftJustify(String.valueOf(odstp.odstpRecord.get(i).eclipseFlag), ECLIPSE_FLAG) + " "
                    + Utilities.LeftJustify(odstp.odstpRecord.get(i).orbitNumber, ORBIT_NUMBER) + new_line;

            odstp_file.write(body);
        }

        odstp_file.close();

    }

    public static void CreateODNOMFile(ODNOM odnom) throws IOException {

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        BufferedWriter odnom_file = new BufferedWriter(new FileWriter("./data/output/ODNOM_file/odnom " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt"));

        String header = BuildHeader(odnom.fdsFileHeader) + new_line + new_line + new_line;
        odnom_file.write(header);

        for (int i = 0; i < odnom.odnomRecord.size(); i++) {
            String body = Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).mjdEpoch), MJD_EPOCH) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).position.getX()), X_POSITION) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).position.getY()), Y_POSITION) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).position.getZ()), Z_POSITION) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).velocity.getX()), X_VELOCITY) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).velocity.getY()), Y_VELOCITY) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).velocity.getZ()), Z_VELOCITY) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).keplerianElements.getSemiMajorAxis()), SEMI_MAJOR_AXIS) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).keplerianElements.getEccentricity()), ECCENTRICITY) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).keplerianElements.getInclination()), INCLINATION) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).keplerianElements.getRaan()), RAAN) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).keplerianElements.getArgOfPerigee()), ARG_OF_PERIGEE) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).keplerianElements.getTrueAnomaly()), TRUE_ANOMALY) + " "
                    + Utilities.LeftJustify(String.format("%08.0f", VAR_FILLER_COLUMN), FILLER_COLUMN) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).sunDirection.getX()), X_SUN_DIRECTION) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).sunDirection.getY()), Y_SUN_DIRECTION) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).sunDirection.getZ()), Z_SUN_DIRECTION) + " "
                    + Utilities.LeftJustify(String.valueOf(odnom.odnomRecord.get(i).eclipseFlag), ECLIPSE_FLAG) + " "
                    + Utilities.LeftJustify(odnom.odnomRecord.get(i).orbitNumber, ORBIT_NUMBER) + new_line;

            odnom_file.write(body);
        }

        odnom_file.close();
    }

    public static void CreateProcessedOrbitsFile(ProcessedOrbits processedOrbits) throws IOException {

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        BufferedWriter processedorbits_file = new BufferedWriter(new FileWriter("./data/output/processed_orbits_file/processedorbits " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt"));

        String header = BuildHeader(processedOrbits.fdsFileHeader) + new_line + new_line + new_line;
        processedorbits_file.write(header);

        for (int i = 0; i < processedOrbits.ephemerisRecords.size(); i++) {
            String body = Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).mjdEpoch), MJD_EPOCH) + " "
                    + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).position.getX()), X_POSITION) + " "
                    + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).position.getY()), Y_POSITION) + " "
                    + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).position.getZ()), Z_POSITION) + " "
                    + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).velocity.getX()), X_VELOCITY) + " "
                    + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).velocity.getY()), Y_VELOCITY) + " "
                    + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).velocity.getZ()), Z_VELOCITY) + new_line;

            processedorbits_file.write(body);
        }

        processedorbits_file.close();

    }

}
