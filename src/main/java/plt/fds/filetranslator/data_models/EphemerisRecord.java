package plt.fds.filetranslator.data_models;

public class EphemerisRecord {

    public Double mjdEpoch;
    public Vector3DType position;
    public Vector3DType velocity;

    public EphemerisRecord () {
        Double mjdEpoch = this.mjdEpoch;
        this.position = new Vector3DType();
        this.velocity = new Vector3DType();
    }

}
