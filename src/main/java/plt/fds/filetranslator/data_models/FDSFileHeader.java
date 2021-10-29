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

    public String getReferenceFrame() {
        return referenceFrame;
    }

    public void setReferenceFrame(String referenceFrame) {
        this.referenceFrame = referenceFrame;
    }

    public String getPrincipalPlane() {
        return principalPlane;
    }

    public void setPrincipalPlane(String principalPlane) {
        this.principalPlane = principalPlane;
    }

    public String getColumnLabelsAndUnits() {
        return columnLabelsAndUnits;
    }

    public void setColumnLabelsAndUnits(String columnLabelsAndUnits) {
        this.columnLabelsAndUnits = columnLabelsAndUnits;
    }

}
