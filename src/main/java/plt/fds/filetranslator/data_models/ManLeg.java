package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class ManLeg {

    public String legID;
    public String legManType;
    //public DateTimeType legStartTime;
    public String legStartTime;
    //public DateTimeType legStopTime;
    public String legStopTime;
    //public EnumBlockingFlag blockingFlag;
    public String blockingFlag;
    public Integer legNBMan;
    public String remarks;
    public ArrayList<AttitudeManoeuvre> attitudeManoeuvre;
    public ArrayList<OrbitalManoeuvre> orbitalManoeuvre;

    public ManLeg()
    {
        this.legID = new String();
        this.legManType = new String();
        this.legStartTime = new String();
        this.legStopTime = new String();
        this.blockingFlag = new String();
        Integer legNBMan = this.legNBMan;
        //this.legNBMan = new Integer();
        this.remarks = new String();
        this.attitudeManoeuvre = new ArrayList<AttitudeManoeuvre>();
        this.orbitalManoeuvre = new ArrayList<OrbitalManoeuvre>();

    }

    public void addAttitudeManoeuvre (AttitudeManoeuvre attitudeManoeuvre)
    {
        this.attitudeManoeuvre.add(attitudeManoeuvre);
    }

    public void addOrbitalManoeuvre (OrbitalManoeuvre orbitalManoeuvre)
    {
        this.orbitalManoeuvre.add(orbitalManoeuvre);
    }

}
