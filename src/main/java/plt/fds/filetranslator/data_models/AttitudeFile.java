package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class AttitudeFile {

    public AttitudeFileHeader attitudeFileHeader;
    public ArrayList<AttitudeLeg> attitudeLegs;

    public  AttitudeFile ()
    {
        this.attitudeFileHeader = new AttitudeFileHeader();
        this.attitudeLegs = new ArrayList<AttitudeLeg>();

    }

    public void addAttitudeLeg (AttitudeLeg attitudeLegs)
    {
     this.attitudeLegs.add(attitudeLegs);
    }

}
