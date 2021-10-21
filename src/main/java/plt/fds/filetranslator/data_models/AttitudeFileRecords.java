package plt.fds.filetranslator.data_models;

public class AttitudeFileRecords {

    //public DateTimeType epoch;
    public String epoch;
    //public QuaternionsType quaternion;
    public String quaternion;
    //public Vector3DType angularVelocity;
    public String angularVelocity;

    public AttitudeFileRecords()
    {
        this.epoch = new String();
        this.quaternion = new String();
        this.angularVelocity = new String();
    }
}
