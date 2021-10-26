package plt.fds.filetranslator;

import org.jdom2.Element;
import plt.fds.filetranslator.data_models.TPF;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TPFFileGenerator {

    public static Element CreateTPFText(TPF tpf) {
        Element TPF = new Element("TPF");
        String h1, h2, h3, h4, h5;

        h1 = tpf.tpfHeader.taskName + " " + tpf.tpfHeader.taskType + " "
                + tpf.tpfHeader.parameterSetName +" " + tpf.tpfHeader.parameterValueSetName;

        h2 = "           " + tpf.tpfHeader.destination + " " + tpf.tpfHeader.source + " "
                + tpf.tpfHeader.nbRecords;

        h3 = tpf.tpfHeader.releaseTime + " " + tpf.tpfHeader.earliestReleaseTime + " "
                + tpf.tpfHeader.latestReleaseTime;

        h4 = tpf.tpfHeader.executionTime + " " + tpf.tpfHeader.subScheduleID;

        h5 = tpf.tpfHeader.tpfRemarks;

        String tpf_Header = h1 + "\n" + h2 + "\n" + h3 + "\n" + h4 + "\n" + h5 + "\n";
        TPF.setText(tpf_Header);

        String tpf_Body;
        for (int g = 0; g <tpf.tpfBody.tpfRecord.size(); g++) {
            String paramName = tpf.tpfBody.tpfRecord.get(g).paramName + " ";
            String paramValueType = tpf.tpfBody.tpfRecord.get(g).paramValueType + " ";
            String paramValue = tpf.tpfBody.tpfRecord.get(g).paramValue + " ";
            String paramValueUnit = tpf.tpfBody.tpfRecord.get(g).paramValueUnit + " ";
            String paramValueRadix = tpf.tpfBody.tpfRecord.get(g).paramValueRadix + " ";
            String paramRemarks = tpf.tpfBody.tpfRecord.get(g).paramRemarks + "\n";

            tpf_Body = paramName + paramValueType + paramValue + paramValueUnit + paramValueRadix + paramRemarks;
            TPF.addContent(tpf_Body);
        }

        return TPF;
    }

    public static void CreateTPFTextFile(TPF tpf) throws IOException {
        Element element = TPFFileGenerator.CreateTPFText(tpf);
        FileOutputStream fileOutputStream = new FileOutputStream("./data/output/tpf_file/tpf.txt");
        fileOutputStream.write(element.getText().getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }



}
