package Computer.Monitor;

public class Monitor {
    private MonitorType type;
    private double diagonanl;
    private double weight;

    public Monitor(MonitorType type, double diagonanl, double weight) {
        this.type = type;
        this.diagonanl = diagonanl;
        this.weight = weight;
    }

    public MonitorType getType() {
        return type;
    }

    public void setType(MonitorType type) {
        this.type = type;
    }

    public double getDiagonanl() {
        return diagonanl;
    }

    public void setDiagonanl(double diagonanl) {
        this.diagonanl = diagonanl;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "type=" + type +
                ", diagonanl=" + diagonanl +
                ", weight=" + weight +
                '}';
    }
}
