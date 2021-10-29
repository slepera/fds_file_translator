package plt.fds.filetranslator.format_manager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.jdom2.Element;
import org.json.JSONObject;
import plt.fds.filetranslator.Utilities;
import plt.fds.filetranslator.data_models.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ODSTP_ODNOM_Processed_Orbits_FileGenerator {

    static String new_line = "\n";
    static final int TASK_NAME = 8;
    static final int TASK_TYPE = 1;
    static final int PARAMETER_SET_NAME = 8;
    static final int PARAMETER_VALUE_SET_NAME = 8;
    static final int DESTINATION = 1;
    static final int SOURCE = 1;
    static final int NBRECORDS = 3;
    static final int RELEASE_TIME = 20;
    static final int RELEASE_TIME_EXTENDED = 26;
    static final int EARLIEST_RELEASE_TIME = 20;
    static final int EARLIEST_RELEASE_TIME_EXTENDED = 26;
    static final int LATEST_RELEASE_TIME = 20;
    static final int LATEST_RELEASE_TIME_EXTENDED = 26;
    static final int EXECUTION_TIME = 20;
    static final int EXECUTION_TIME_EXTENDED = 26;
    static final int SUBSCHEDULE_ID = 5;
    static final int TPF_REMARKS = 255 - new_line.length();  //¿?
    static final int PARAMETER_NAME = 8;
    static final int PARAMETER_VALUE_TYPE = 1;
    static final int PARAMETER_VALUE = 20;
    static final int PARAMETER_VALUE_EXTENDED = 193;
    static final int PARAMETER_VALUE_UNIT = 4;
    static final int PARAMETER_VALUE_RADIX = 1;
    static final int PARAMETER_REMARKS = 42;


    public static String BuildHeader(FDSFileHeader fdsFileHeader) {
        JSONObject jsonObj = new JSONObject(fdsFileHeader);
        return jsonObj.toString();
    }

    public static void CreateODSTPFile(ODSTP odstp) {
        //String header = BuildHeader(odstp.fdsFileHeader);

    }

    public static void CreateODNOMFile(ODNOM odnom) {

    }

    public static void CreateProcessedOrbitsFile(ProcessedOrbits processedOrbits) {

    }

}
