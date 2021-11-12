package plt.fds.filetranslator.data_models;

public class FDSFileHeader extends SignalHeaderType{


    public String referenceFrame;
    public String principalPlane;
    public String columnLabelsAndUnits;

    public FDSFileHeader()
    {
        this.referenceFrame = new String();
        this.principalPlane = new String();
        this.columnLabelsAndUnits = new String();
    }

}
