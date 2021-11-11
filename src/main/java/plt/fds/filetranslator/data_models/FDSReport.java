package plt.fds.filetranslator.data_models;

public class FDSReport {

    public SystemReportType systemReportType;

    public FDSReport(){
        systemReportType = new SystemReportType();
    }

    public SystemReportType getSystemReportType() {
        return systemReportType;
    }

    public void setSystemReportType(SystemReportType systemReportType) {
        this.systemReportType = systemReportType;
    }
}
