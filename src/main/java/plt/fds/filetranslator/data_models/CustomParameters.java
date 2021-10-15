package plt.fds.filetranslator.data_models;

public class CustomParameters {

    public int nbWayPoints;
    public CustomWayPoint[] customWayPoint;

    public CustomParameters() {

        int nbWayPoints = this.nbWayPoints;
        //this.nbWayPoints = new Integer();
        this.customWayPoint = new CustomWayPoint[3];
        for (int i = 0; i < this.customWayPoint.length; i++) {
            this.customWayPoint[i] = new CustomWayPoint();
        }

    }

}
