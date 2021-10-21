package plt.fds.filetranslator.data_models;

public class TPFRecords {

    public String paramName;
    //public EnumTpfParamValueType paramValueType;
    public String paramValueType;
    public String paramValue;
    public String paramValueUnit;
    public String paramValueRadix;
    public String paramRemarks;

    public TPFRecords()
    {
        this.paramName = new String();
        this.paramValueType = new String();
        this.paramValue = new String();
        this.paramValueUnit = new String();
        this.paramValueRadix = new String();
        this.paramRemarks = new String();
    }

}
