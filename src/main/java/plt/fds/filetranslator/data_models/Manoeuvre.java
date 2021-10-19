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
    public TPF[] tpf_attitude;
    public TPF[] tpf_orbital;

    public Manoeuvre() {
        this.manID = new String();
        this.execStartTime = new String();
        this.execStopTime = new String();
        this.initialAttitude = new String();
        this.finalAttitude = new String();
        this.manType = new String();
        this.tpf_attitude = new TPF[1];
        for (int i = 0; i < this.tpf_attitude.length; i++) {
            this.tpf_attitude[i] = new TPF();
        }
        this.tpf_orbital = new TPF[2];
        for (int i = 0; i < this.tpf_orbital.length; i++) {
            this.tpf_orbital[i] = new TPF();
        }
    }


}
