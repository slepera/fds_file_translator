package plt.fds.filetranslator.data_models;

public class TPFBody {

    public  TPFRecords[] tpfRecord;

    public TPFBody()
    {
        for (int i = 0; i < this.tpfRecord.length; i++) {
            this.tpfRecord[i] = new TPFRecords();
        }
    }

}
