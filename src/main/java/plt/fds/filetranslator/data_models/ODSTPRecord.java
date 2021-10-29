package plt.fds.filetranslator.data_models;

public class ODSTPRecord extends ODNOMRecord{
    public double delta_T_Cod_Pod;

    public ODSTPRecord() {
        Double delta_T_Cod_Pod = this.delta_T_Cod_Pod;
    }

    public double getDelta_T_Cod_Pod() {
        return delta_T_Cod_Pod;
    }

    public void setDelta_T_Cod_Pod(double delta_T_Cod_Pod) {
        this.delta_T_Cod_Pod = delta_T_Cod_Pod;
    }
}
