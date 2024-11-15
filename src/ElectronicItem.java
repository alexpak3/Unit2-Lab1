public class ElectronicItem extends CISItem{
    private int storageCapacity;
    private String model;
    private String maker;
    private String operatingSystem;

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public String getMaker() {
        return maker;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public String toString() {
        return "ElectronicItem{" +super.toString() +
                ", storageCapacity=" + storageCapacity +
                ", model='" + model + '\'' +
                ", maker='" + maker + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
