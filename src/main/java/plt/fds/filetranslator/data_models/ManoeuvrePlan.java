package plt.fds.filetranslator.data_models;

public class ManoeuvrePlan {

    public ManPlanHeader manPlanHeader;
    public ManLeg[] manLeg;

    public ManoeuvrePlan()
    {
        this.manPlanHeader = new ManPlanHeader();
        this.manLeg = new ManLeg[1];
        for (int i = 0; i < this.manLeg.length; i++) {
            this.manLeg[i] = new ManLeg();
        }

    }

}
