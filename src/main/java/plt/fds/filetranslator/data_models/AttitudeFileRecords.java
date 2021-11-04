package plt.fds.filetranslator.data_models;

public class AttitudeFileRecords {

    //public DateTimeType epoch;
    public String epoch;
    public QuaternionsType quaternion;
    public Vector3DType angularVelocity;

    public AttitudeFileRecords()
    {
        this.epoch = new String();
        this.quaternion = new QuaternionsType();
        this.angularVelocity = new Vector3DType();
    }
}
