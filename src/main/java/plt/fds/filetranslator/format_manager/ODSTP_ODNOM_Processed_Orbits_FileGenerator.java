package plt.fds.filetranslator.format_manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jdom2.Element;
import org.json.JSONObject;
import plt.fds.filetranslator.Utilities;
import plt.fds.filetranslator.data_models.*;
import plt.fds.filetranslator.exceptions.OutOfRangeException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
        String jsonObj = gson.toJson(fdsFileHeader);
        return jsonObj;
    }

    public static void CreateODSTPFile(ODSTP odstp) throws IOException {

        //String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        //DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        //File odstp_file = new File ("./data/output/ODSTP_file/odstp " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt");
        //BufferedWriter odstp_bw = new BufferedWriter(new FileWriter(odstp_file));

        String header = BuildHeader(odstp.fdsFileHeader) + new_line + new_line + new_line;
        //odstp_bw.write(header);

        ArrayList<String> body_ODSTP = new ArrayList<>();

        try {

            for (int i = 0; i < odstp.odstpRecord.size(); i++) {
                String body = Utilities.LeftJustify(odstp.odstpRecord.get(i).mjdEpoch, MJD_EPOCH) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).position.x, X_POSITION) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).position.y, Y_POSITION) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).position.z, Z_POSITION) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).velocity.x, X_VELOCITY) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).velocity.y, Y_VELOCITY) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).velocity.z, Z_VELOCITY) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).keplerianElements.semiMajorAxis, SEMI_MAJOR_AXIS) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).keplerianElements.eccentricity, ECCENTRICITY) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).keplerianElements.inclination, INCLINATION) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).keplerianElements.raan, RAAN) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).keplerianElements.argOfPerigee, ARG_OF_PERIGEE) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).keplerianElements.trueAnomaly, TRUE_ANOMALY) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).delta_T_Cod_Pod, COD_POD) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).sunDirection.x, X_SUN_DIRECTION) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).sunDirection.y, Y_SUN_DIRECTION) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).sunDirection.z, Z_SUN_DIRECTION) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).eclipseFlag, ECLIPSE_FLAG) + "\t"
                        + Utilities.LeftJustify(odstp.odstpRecord.get(i).orbitNumber, ORBIT_NUMBER) + new_line;

                body_ODSTP.add(body);
                //odstp_bw.write(body);
            }

            String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
            DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
            File odstp_file = new File ("./data/output/ODSTP_file/odstp " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt");
            BufferedWriter odstp_bw = new BufferedWriter(new FileWriter(odstp_file));
            odstp_bw.write(header);

            for (int i = 0; i < body_ODSTP.size(); i++) {
                odstp_bw.write(body_ODSTP.get(i));
            }

            odstp_bw.close();

        } catch(OutOfRangeException outOfRangeException) {
            //odstp_bw.close();
            //odstp_file.delete();
            outOfRangeException.printStackTrace();
            System.out.println( "ODSTP File no created" );

        }

    }

    public static void CreateODNOMFile(ODNOM odnom) throws IOException {

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        File odnom_file = new File("./data/output/ODNOM_file/odnom " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt");
        BufferedWriter odnom_bw = new BufferedWriter(new FileWriter(odnom_file));

        String header = BuildHeader(odnom.fdsFileHeader) + new_line + new_line + new_line;
        odnom_bw.write(header);

        try {

            for (int i = 0; i < odnom.odnomRecord.size(); i++) {
                String body = Utilities.LeftJustify(odnom.odnomRecord.get(i).mjdEpoch, MJD_EPOCH) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).position.x, X_POSITION) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).position.y, Y_POSITION) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).position.z, Z_POSITION) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).velocity.x, X_VELOCITY) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).velocity.y, Y_VELOCITY) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).velocity.z, Z_VELOCITY) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).keplerianElements.semiMajorAxis, SEMI_MAJOR_AXIS) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).keplerianElements.eccentricity, ECCENTRICITY) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).keplerianElements.inclination, INCLINATION) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).keplerianElements.raan, RAAN) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).keplerianElements.argOfPerigee, ARG_OF_PERIGEE) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).keplerianElements.trueAnomaly, TRUE_ANOMALY) + " "
                        + Utilities.LeftJustify(String.format("%08.0f", VAR_FILLER_COLUMN), FILLER_COLUMN) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).sunDirection.x, X_SUN_DIRECTION) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).sunDirection.y, Y_SUN_DIRECTION) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).sunDirection.z, Z_SUN_DIRECTION) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).eclipseFlag, ECLIPSE_FLAG) + " "
                        + Utilities.LeftJustify(odnom.odnomRecord.get(i).orbitNumber, ORBIT_NUMBER) + new_line;

                odnom_bw.write(body);
            }
            odnom_bw.close();

        } catch(OutOfRangeException outOfRangeException) {
            odnom_bw.close();
            odnom_file.delete();
            outOfRangeException.printStackTrace();
            System.out.println( "ODNOM File no created" );
        }


    }

    public static void CreateProcessedOrbitsFile(ProcessedOrbits processedOrbits) throws IOException {

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        File processedorbits_file = new File("./data/output/processed_orbits_file/processedorbits " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt");
        BufferedWriter processedorbits_bw = new BufferedWriter(new FileWriter(processedorbits_file));

        String header = BuildHeader(processedOrbits.fdsFileHeader) + new_line + new_line + new_line;
        processedorbits_bw.write(header);

        try {

            for (int i = 0; i < processedOrbits.ephemerisRecords.size(); i++) {
                String body = Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).mjdEpoch), MJD_EPOCH) + " "
                        + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).position.x), X_POSITION) + " "
                        + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).position.y), Y_POSITION) + " "
                        + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).position.z), Z_POSITION) + " "
                        + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).velocity.x), X_VELOCITY) + " "
                        + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).velocity.y), Y_VELOCITY) + " "
                        + Utilities.LeftJustify(String.valueOf(processedOrbits.ephemerisRecords.get(i).velocity.z), Z_VELOCITY) + new_line;

                processedorbits_bw.write(body);
            }
            processedorbits_bw.close();

        } catch(OutOfRangeException outOfRangeException) {
            processedorbits_bw.close();
            processedorbits_file.delete();
            outOfRangeException.printStackTrace();
            System.out.println( "ProcessedOrbits File no created" );
        }

    }


}
