package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class SystemReportType {

    //public StrReportFileName reportFileName;
    public String reportFileName;
    public GLBReportHeaderType glbReportHeaderType;
    public transient ArrayList<KeyParamBodyType> keyParamBodyType; //transient ignore the variable for the JSON

    public SystemReportType() {
        reportFileName = new String();
        glbReportHeaderType = new GLBReportHeaderType();
        keyParamBodyType = new ArrayList<>();
    }

    public void addkeyParamBodyType (KeyParamBodyType keyParamBodyType) {
        this.keyParamBodyType.add(keyParamBodyType);
    }

}
