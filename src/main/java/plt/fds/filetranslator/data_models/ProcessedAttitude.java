package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class ProcessedAttitude {

    public FDSFileHeader fdsFileHeader;
    public ArrayList<AttitudeRecords> attitudeRecords;

    public ProcessedAttitude() {
        fdsFileHeader = new FDSFileHeader();
        attitudeRecords = new ArrayList<>();
    }

    public void addAttitudeRecords (AttitudeRecords attitudeRecords) {
        this.attitudeRecords.add(attitudeRecords);
    }
}
