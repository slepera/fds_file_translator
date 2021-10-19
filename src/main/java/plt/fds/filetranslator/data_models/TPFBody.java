package plt.fds.filetranslator.data_models;

public class TPFBody {

    public  TPFRecords[] tpfRecord;

    public TPFBody()
    {
        this.tpfRecord = new TPFRecords[2];
        for (int i = 0; i < this.tpfRecord.length; i++) {
            this.tpfRecord[i] = new TPFRecords();
        }
    }

}
