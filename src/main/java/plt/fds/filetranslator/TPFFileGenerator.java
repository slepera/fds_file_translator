package plt.fds.filetranslator;

import org.jdom2.Element;
import plt.fds.filetranslator.data_models.TPF;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TPFFileGenerator {

    //static final String FILE_FORMAT = "!TP1";
    //static final int FILE_TYPE = 4;
    /*
    SEQUENCE_COUNTER is an optional parameter
     */
    //static final int SEQUENCE_COUNTER = 0; //¿?
    //static final int COUNTER = 3;

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


    public static String LeftJustify(String s, int n)
    {
        return String.format("%-"+ n + "." + n + "s", s);
    }

    /*
    To know which type of TPF is when the file is printed
     */
    public static String TypeOfFile (TPFFileType tpfFileType) {
        return tpfFileType.name();
    }

    public static Element CreateTPFText(TPF tpf, TPFFileType tpfFileType) {

        Element TPF = new Element("TPF");


        String opth1 = "";
        switch (tpfFileType) {
            case STANDARD: break;
            case TPF: opth1 = "!TPF" + new_line; break;
            case TP1: opth1 = "!TP1" + new_line; break;
            case TP2: opth1 = "!TP2" + new_line; break;
        }
        /*
        remove everything (setText) that could be before and adds opth1
         */
        TPF.addContent(opth1);


        //String fileStructure = LeftJustify(FILE_FORMAT, FILE_TYPE) + " " + LeftJustify(SEQUENCE_COUNTER, COUNTER) + "\n";
        //TPF.setText(fileStructure);

        String h1, h2, h3, h4, h5;

        h1 = LeftJustify(tpf.tpfHeader.taskName, TASK_NAME) + " " + LeftJustify(tpf.tpfHeader.taskType,TASK_TYPE)
                + " " + LeftJustify(tpf.tpfHeader.parameterSetName, PARAMETER_SET_NAME) + " "
                + LeftJustify(tpf.tpfHeader.parameterValueSetName, PARAMETER_VALUE_SET_NAME) + new_line;

        /*
        h2[0]Field not used by SCOS2000 by is inserted anyway as 11 empty spaces
         */
        h2 = "           " + LeftJustify(tpf.tpfHeader.destination, DESTINATION) + " " + LeftJustify(tpf.tpfHeader.source,SOURCE)
                + " " + LeftJustify(String.valueOf(tpf.tpfHeader.nbRecords), NBRECORDS) + new_line;

        h3 = LeftJustify(tpf.tpfHeader.releaseTime, (tpfFileType == TPFFileType.STANDARD || tpfFileType == TPFFileType.TP1) ? RELEASE_TIME : RELEASE_TIME_EXTENDED) + " "
                + LeftJustify(tpf.tpfHeader.earliestReleaseTime, (tpfFileType == TPFFileType.STANDARD || tpfFileType == TPFFileType.TP1) ? EARLIEST_RELEASE_TIME : EARLIEST_RELEASE_TIME_EXTENDED)
                + " " + LeftJustify(tpf.tpfHeader.latestReleaseTime, (tpfFileType == TPFFileType.STANDARD || tpfFileType == TPFFileType.TP1) ? LATEST_RELEASE_TIME : LATEST_RELEASE_TIME_EXTENDED) + new_line;

        h4 = LeftJustify(tpf.tpfHeader.executionTime, (tpfFileType == TPFFileType.STANDARD || tpfFileType == TPFFileType.TP1) ? EXECUTION_TIME : EXECUTION_TIME_EXTENDED) + " "
                + LeftJustify(String.valueOf(tpf.tpfHeader.subScheduleID), SUBSCHEDULE_ID ) + new_line;

        h5 = LeftJustify(tpf.tpfHeader.tpfRemarks, TPF_REMARKS) + new_line;

        String tpf_Header = h1 + h2 + h3 + h4 + h5;

        TPF.addContent(tpf_Header);
        //System.out.println("Header: " + tpf_Header);


        for (int g = 0; g <tpf.tpfBody.tpfRecord.size(); g++)
        {
            String tpf_Body = "";
            String parameterName = LeftJustify(tpf.tpfBody.tpfRecord.get(g).paramName, PARAMETER_NAME);
            String parameterValueType = LeftJustify(tpf.tpfBody.tpfRecord.get(g).paramValueType, PARAMETER_VALUE_TYPE);

            String parameterValue = LeftJustify(tpf.tpfBody.tpfRecord.get(g).paramValue,(tpfFileType == TPFFileType.TPF || tpfFileType == TPFFileType.STANDARD)  ? PARAMETER_VALUE: PARAMETER_VALUE_EXTENDED);
            String parameterValueUnit = LeftJustify(tpf.tpfBody.tpfRecord.get(g).paramValueUnit, PARAMETER_VALUE_UNIT);
            String parameterValueRadix = LeftJustify(tpf.tpfBody.tpfRecord.get(g).paramValueRadix, PARAMETER_VALUE_RADIX);
            String parameterRemarks = LeftJustify(tpf.tpfBody.tpfRecord.get(g).paramRemarks, PARAMETER_REMARKS);

            tpf_Body = parameterName + " " + parameterValueType + " " + parameterValue + " " + parameterValueUnit + " "
                    + parameterValueRadix + " " + parameterRemarks + new_line;

            TPF.addContent(tpf_Body);
            //System.out.println("Body: " + tpf_Body);
        }

        System.out.println(TPF.getText());
        return TPF;
    }

    public static void CreateTPFTextFile(TPF tpf) throws IOException {
        Element element = TPFFileGenerator.CreateTPFText(tpf, TPFFileType.TPF);

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        FileOutputStream fileOutputStream = new FileOutputStream("./data/output/tpf_file/tpf_" + TypeOfFile(TPFFileType.TPF) + " "+ europeanDateFormatter.format(LocalDateTime.now()) + ".txt");

        fileOutputStream.write(element.getText().getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }



}
