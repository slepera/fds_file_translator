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

    public Double getMjdEpoch() {
        return mjdEpoch;
    }

    public void setMjdEpoch(Double mjdEpoch) {
        this.mjdEpoch = mjdEpoch;
    }

    public Vector3DType getPosition() {
        return position;
    }

    public void setPosition(Vector3DType position) {
        this.position = position;
    }

    public Vector3DType getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector3DType velocity) {
        this.velocity = velocity;
    }

}
