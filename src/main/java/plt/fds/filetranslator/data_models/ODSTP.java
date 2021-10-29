package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class ODSTP {

    public FDSFileHeader fdsFileHeader;
    public ArrayList<ODSTPRecord> odstpRecord;

    public ODSTP() {
        this.fdsFileHeader = new FDSFileHeader();
        this.odstpRecord = new ArrayList<>();
    }

    public void addODSTPRecord(ODSTPRecord odstpRecord) {
        this.odstpRecord.add(odstpRecord);
    }

    public FDSFileHeader getFdsFileHeader() {
        return fdsFileHeader;
    }

    public void setFdsFileHeader(FDSFileHeader fdsFileHeader) {
        this.fdsFileHeader = fdsFileHeader;
    }

    public ArrayList<ODSTPRecord> getOdstpRecord() {
        return odstpRecord;
    }

    public void setOdstpRecord(ArrayList<ODSTPRecord> odstpRecord) {
        this.odstpRecord = odstpRecord;
    }
}
