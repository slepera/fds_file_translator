package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class TPFBody {

    public ArrayList<TPFRecords> tpfRecord;

    public TPFBody()
    {
        this.tpfRecord = new ArrayList<TPFRecords>();
    }

    public void addTPFRecords (TPFRecords tpfRecord)
    {
        this.tpfRecord.add(tpfRecord);
    }



}
