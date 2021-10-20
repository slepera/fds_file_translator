package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class AttitudeManoeuvre extends Manoeuvre {

    //public EnumTargetReferenceMode targetReferenceMode;
    public String targetReferenceMode;
    public ArrayList<Double> attManParams;
    public DownlinkParameters downlinkParameter;
    public LocalOrbitalParameters localOrbitalParameters;
    public CustomParameters customParameters;

    public AttitudeManoeuvre() {

        this.manType = "ATTITUDE";
        this.targetReferenceMode = new String();
        this.attManParams = new ArrayList<Double>();
        this.downlinkParameter = new DownlinkParameters();
        this.localOrbitalParameters = new LocalOrbitalParameters();
        this.customParameters = new CustomParameters();

    }

    public void addAttManParams (Double attManParams)
    {

        this.attManParams.add( attManParams);
    }

}
