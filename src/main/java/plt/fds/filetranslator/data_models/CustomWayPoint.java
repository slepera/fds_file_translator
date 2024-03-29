package plt.fds.filetranslator.data_models;

public class CustomWayPoint {

    public Integer wayPointID;
    //public DateTimeType epoch;
    public String epoch;
    public QuaternionsType q_ECI2BRF;
    public Vector3DType w_BRF;
    public Vector3DType w_dot_BRF;

    public CustomWayPoint()
    {
        Integer wayPointID = this.wayPointID;
        this.epoch = new String();
        this.q_ECI2BRF = new QuaternionsType();
        this.w_BRF = new Vector3DType();
        this.w_dot_BRF = new Vector3DType();
    }

}
