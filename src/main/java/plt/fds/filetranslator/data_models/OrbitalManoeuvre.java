package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class OrbitalManoeuvre extends Manoeuvre {

    public ArrayList<Double> orbMansParams;

    public OrbitalManoeuvre() {

        this.manType = "ORBITAL";
        this.orbMansParams = new ArrayList<Double>();

    }

    public void addOrbMansParams (int i, Double orbMansParams)
    {
        this.orbMansParams.add(i, orbMansParams);
    }

}
