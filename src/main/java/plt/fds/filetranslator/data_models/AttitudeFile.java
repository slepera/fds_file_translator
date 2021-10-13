package plt.fds.filetranslator.data_models;

public class AttitudeFile {

    public AttitudeFileHeader attitudeFileHeader;
    public AttitudeLeg[] attitudeLegs;

    public  AttitudeFile ()
    {
        this.attitudeFileHeader = new AttitudeFileHeader();
        this.attitudeLegs = new AttitudeLeg[2];
        for (int i = 0; i < attitudeLegs.length; i++)
        {
            this.attitudeLegs[i] = new AttitudeLeg();

        }
    }

}
