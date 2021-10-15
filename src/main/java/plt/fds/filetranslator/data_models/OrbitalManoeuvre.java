package plt.fds.filetranslator.data_models;

public class OrbitalManoeuvre extends Manoeuvre{

    public double[] orbMansParams;

    public OrbitalManoeuvre() {

        this.orbMansParams = new double[4];
        for (int i = 0; i < orbMansParams.length; i++) {
            //this.orbMansParams = new Double();
        }

    }

}
