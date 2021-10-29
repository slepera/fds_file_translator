package plt.fds.filetranslator.data_models;

public class ODNOMRecord extends EphemerisRecord{

    public OrbitalParameters keplerianElements;
    public Vector3DType sunDirection;
    public Integer eclipseFlag;
    //UnsignedLong orbitNumber
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

    public Vector3DType getSunDirection() {
        return sunDirection;
    }

    public void setSunDirection(Vector3DType sunDirection) {
        this.sunDirection = sunDirection;
    }

    public Integer getEclipseFlag() {
        return eclipseFlag;
    }

    public void setEclipseFlag(Integer eclipseFlag) {
        this.eclipseFlag = eclipseFlag;
    }

    public String getOrbitNumber() {
        return orbitNumber;
    }

    public void setOrbitNumber(String orbitNumber) {
        this.orbitNumber = orbitNumber;
    }
}
