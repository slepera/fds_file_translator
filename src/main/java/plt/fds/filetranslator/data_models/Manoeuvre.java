package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class Manoeuvre {

    public String manID;
    //public DateTimeType execStartTime;
    public String execStartTime;
    //public DateTimeType execStopTime;
    public String execStopTime;
    public QuaternionsType initialAttitude;
    public QuaternionsType finalAttitude;
    public EnumManType manType;
    public ArrayList<TPF> tpf;


    public Manoeuvre() {
        this.manID = new String();
        this.execStartTime = new String();
        this.execStopTime = new String();
        this.initialAttitude = new QuaternionsType();
        this.finalAttitude = new QuaternionsType();
        this.tpf = new ArrayList<TPF>();
    }

    public void addTPF(TPF tpf)
    {
        this.tpf.add(tpf);
    }

}
