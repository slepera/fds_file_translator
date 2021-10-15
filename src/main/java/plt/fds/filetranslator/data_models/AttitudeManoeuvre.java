package plt.fds.filetranslator.data_models;

public class AttitudeManoeuvre extends Manoeuvre {

    //public EnumTargetReferenceMode targetReferenceMode;
    public String targetReferenceMode;
    public double[] attManParams;
    public DownlinkParameters downlinkParameter;
    public LocalOrbitalParameters localOrbitalParameters;
    public CustomParameters customParameters;

    public AttitudeManoeuvre() {

        this.targetReferenceMode = new String();
        this.attManParams = new double[2];
        for (int i = 0; i < this.attManParams.length; i++) {
            double attManParams = this.attManParams[i];
        }

        this.downlinkParameter = new DownlinkParameters();
        this.localOrbitalParameters = new LocalOrbitalParameters();
        this.customParameters = new CustomParameters();
    }

}
