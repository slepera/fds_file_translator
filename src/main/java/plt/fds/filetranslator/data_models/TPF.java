package plt.fds.filetranslator.data_models;

public class TPF {

    public TPFBody tpfBody;
    public TPFHeader tpfHeader;
    public SignalHeaderType signalHeaderType;

    public TPF() {
        tpfHeader = new TPFHeader();
        tpfBody = new TPFBody();
        signalHeaderType = new SignalHeaderType();
    }
}
