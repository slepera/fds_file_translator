package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class ManoeuvrePlan {

    public ManPlanHeader manPlanHeader;
    public ArrayList<ManLeg> manLeg;

    public ManoeuvrePlan()
    {
        this.manPlanHeader = new ManPlanHeader();
        this.manLeg = new ArrayList<>();

    }

    public void addManLeg (ManLeg manLeg)
    {
        this.manLeg.add(manLeg);
    }

}
