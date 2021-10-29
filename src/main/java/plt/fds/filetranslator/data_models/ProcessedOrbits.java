package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class ProcessedOrbits {

    FDSFileHeader fdsFileHeader;
    ArrayList<EphemerisRecord> ephemerisRecords;

    public ProcessedOrbits() {
        this.fdsFileHeader = new FDSFileHeader();
        this.ephemerisRecords = new ArrayList<>();
    }

    public void addEphemeredisRecord (EphemerisRecord ephemerisRecords) {
        this.ephemerisRecords.add(ephemerisRecords);
    }

    public FDSFileHeader getFdsFileHeader() {
        return fdsFileHeader;
    }

    public void setFdsFileHeader(FDSFileHeader fdsFileHeader) {
        this.fdsFileHeader = fdsFileHeader;
    }

    public ArrayList<EphemerisRecord> getEphemerisRecords() {
        return ephemerisRecords;
    }

    public void setEphemerisRecords(ArrayList<EphemerisRecord> ephemerisRecords) {
        this.ephemerisRecords = ephemerisRecords;
    }
}
