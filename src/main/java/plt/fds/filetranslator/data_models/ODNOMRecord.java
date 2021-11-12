package plt.fds.filetranslator.data_models;

public class ODNOMRecord extends EphemerisRecord{

    public OrbitalParameters keplerianElements;
    public Vector3DType sunDirection;
    public Integer eclipseFlag;
    //public UnsignedLong orbitNumber
    public String orbitNumber;

    public ODNOMRecord() {
        this.keplerianElements = new OrbitalParameters();
        this.sunDirection = new Vector3DType();
        Integer eclipseFlag = this.eclipseFlag;
        this.orbitNumber = new String();
    }


    public OrbitalParameters getKeplerianElements() {
        return keplerianElements;
    }

    public void setKeplerianElements(OrbitalParameters keplerianElements) {
        this.keplerianElements = keplerianElements;
    }

}
