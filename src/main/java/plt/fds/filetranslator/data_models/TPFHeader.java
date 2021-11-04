package plt.fds.filetranslator.data_models;

public class TPFHeader {

    public String taskName;
    public EnumTpfTaskType taskType;
    public String parameterSetName;
    public String parameterValueSetName;
    public EnumTpfDestination destination;
    public String source;
    public Integer nbRecords;
    //public DateTimeType releaseTime;
    public String releaseTime;
    //public DateTimeType earliestReleaseTime;
    public String earliestReleaseTime;
    //public DateTimeType latestReleaseTime;
    public String latestReleaseTime;
    //public DateTimeType executionTime;
    public String executionTime;
    public Integer subScheduleID;
    public String tpfRemarks;

    public TPFHeader()
    {
        this.taskName = new String();
        this.parameterSetName = new String();
        this.parameterValueSetName = new String();
        this.source = new String();
        Integer nbRecords = this.nbRecords;
        this.releaseTime = new String();
        this.earliestReleaseTime = new String();
        this.latestReleaseTime = new String();
        this.executionTime = new String();
        Integer subScheduleID = this.subScheduleID;
        this.tpfRemarks = new String();


    }
}

