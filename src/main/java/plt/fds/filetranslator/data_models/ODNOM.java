package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class ODNOM {

    public FDSFileHeader fdsFileHeader;
    public ArrayList<ODNOMRecord> odnomRecord;

    public ODNOM() {
        this.fdsFileHeader = new FDSFileHeader();
        this.odnomRecord = new ArrayList<>();
    }

    public void addODNOMRecord (ODNOMRecord odnomRecord) {
        this.odnomRecord.add(odnomRecord);
    }

}
