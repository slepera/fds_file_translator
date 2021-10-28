package plt.fds.filetranslator.data_models;

public class AttitudeFileHeader extends FDSFileHeader{
    public Integer getNbAttitudelegs() {
        return nbAttitudelegs;
    }

    public void setNbAttitudelegs(Integer nbAttitudelegs) {
        this.nbAttitudelegs = nbAttitudelegs;
    }

    public Integer nbAttitudelegs;

    public AttitudeFileHeader()
    {
        Integer nbAttitudeLegs = this.nbAttitudelegs;
    }
}