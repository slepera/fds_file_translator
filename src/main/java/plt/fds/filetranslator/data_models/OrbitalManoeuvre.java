package plt.fds.filetranslator.data_models;

public class OrbitalManoeuvre extends Manoeuvre{

    public double[] orbMansParams;

    public OrbitalManoeuvre() {

        this.orbMansParams = new double[4];
        for (int i = 0; i < this.orbMansParams.length; i++) {
            double orbMansParams = this.orbMansParams[i];
            //this.orbMansParams[i] = new Double();
        }

    }

}
