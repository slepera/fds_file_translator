package plt.fds.filetranslator.data_models;

public class TPF {

    public TPFBody tpfBody;
    public TPFHeader tpfHeader;
    public SignalHeaderType signalHeaderType;

    public TPF() {
        this.tpfHeader = new TPFHeader();
        this.tpfBody = new TPFBody();
        this.signalHeaderType = new SignalHeaderType();
    }
}
