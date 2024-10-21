package Computer.Processor;

public class Processor {
    private Frequency frequency;
    private CoreCount coreCount;
    private Manufacturer manufacturer;
    private double weight;

    public Processor(Frequency frequency, CoreCount coreCount, Manufacturer manufacturer, double weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", coreCount=" + coreCount +
                ", manufacturer=" + manufacturer +
                ", weight=" + weight +
                '}';
    }
}
