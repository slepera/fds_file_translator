package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class ProcessedOrbits {

    public FDSFileHeader fdsFileHeader;
    public ArrayList<EphemerisRecord> ephemerisRecords;

    public ProcessedOrbits() {
        this.fdsFileHeader = new FDSFileHeader();
        this.ephemerisRecords = new ArrayList<>();
    }

    public void addEphemeredisRecord (EphemerisRecord ephemerisRecords) {
        this.ephemerisRecords.add(ephemerisRecords);
    }

}
