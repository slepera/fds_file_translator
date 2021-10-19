package plt.fds.filetranslator.data_models;

public class Manoeuvre {

    public String manID;
    //public DateTimeType execStartTime;
    public String execStartTime;
    //public DateTimeType execStopTime;
    public String execStopTime;
    //public QuaternionsType initialAttitude;
    public String initialAttitude;
    //public QuaternionsType finalAttitude;
    public String finalAttitude;
    //public EnumManType manType;
    public String manType;
    public TPF[] tpf;

    public Manoeuvre() {
        this.manID = new String();
        this.execStartTime = new String();
        this.execStopTime = new String();
        this.initialAttitude = new String();
        this.finalAttitude = new String();
        this.manType = new String();
        this.tpf = new TPF[1];
        for (int i = 0; i < this.tpf.length; i++) {
            this.tpf[i] = new TPF();
        }
    }


}
