package plt.fds.filetranslator.data_models;

public class DownlinkParameters {

    public Vector3DType antennaVers;
    public Vector3DType stationPos;

    public DownlinkParameters()
    {
        this.antennaVers = new Vector3DType();
        this.stationPos = new Vector3DType();
    }

}
