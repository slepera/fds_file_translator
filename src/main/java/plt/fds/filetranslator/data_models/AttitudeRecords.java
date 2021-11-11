package plt.fds.filetranslator.data_models;

public class AttitudeRecords {

    public Double mjdEpoch;
    public QuaternionsType quaternion;
    public Vector3DType angularVelocity;

    public AttitudeRecords() {
        Double mjdEpoch = this.mjdEpoch;
        quaternion = new QuaternionsType();
        angularVelocity = new Vector3DType();
    }
}
