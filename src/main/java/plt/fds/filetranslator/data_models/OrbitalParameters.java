package plt.fds.filetranslator.data_models;

public class OrbitalParameters {

    Double semiMajorAxis;
    Double eccentricity;
    Double inclination;
    Double raan;
    Double argOfPerigee;
    Double trueAnomaly;

    public Double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(Double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public Double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(Double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public Double getInclination() {
        return inclination;
    }

    public void setInclination(Double inclination) {
        this.inclination = inclination;
    }

    public Double getRaan() {
        return raan;
    }

    public void setRaan(Double raan) {
        this.raan = raan;
    }

    public Double getArgOfPerigee() {
        return argOfPerigee;
    }

    public void setArgOfPerigee(Double argOfPerigee) {
        this.argOfPerigee = argOfPerigee;
    }

    public Double getTrueAnomaly() {
        return trueAnomaly;
    }

    public void setTrueAnomaly(Double trueAnomaly) {
        this.trueAnomaly = trueAnomaly;
    }
}
