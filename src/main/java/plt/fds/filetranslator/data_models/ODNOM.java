package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class ODNOM {

    FDSFileHeader fdsFileHeader;
    ArrayList<ODNOMRecord> odnomRecord;

    public ODNOM() {
        this.fdsFileHeader = new FDSFileHeader();
        this.odnomRecord = new ArrayList<>();
    }

    public void addODNOMRecord (ODNOMRecord odnomRecords) {
        this.odnomRecord.add(odnomRecords);
    }

    public FDSFileHeader getFdsFileHeader() {
        return fdsFileHeader;
    }

    public void setFdsFileHeader(FDSFileHeader fdsFileHeader) {
        this.fdsFileHeader = fdsFileHeader;
    }

    public ArrayList<ODNOMRecord> getOdnomRecord() {
        return odnomRecord;
    }

    public void setOdnomRecord(ArrayList<ODNOMRecord> odnomRecord) {
        this.odnomRecord = odnomRecord;
    }
}
