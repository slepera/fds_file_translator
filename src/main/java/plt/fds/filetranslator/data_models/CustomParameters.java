package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class CustomParameters {

    public Integer nbWayPoints;
    public ArrayList<CustomWayPoint> customWayPoint;

    public CustomParameters() {

        Integer nbWayPoints = this.nbWayPoints;
        //this.nbWayPoints = new Integer();
        this.customWayPoint = new ArrayList<CustomWayPoint>();

    }

    public void addCustomWayPoint(CustomWayPoint customWayPoint)
    {
        this.customWayPoint.add(customWayPoint);
    }

}
