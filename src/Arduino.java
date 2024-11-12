public class Arduino extends ElectronicItem{
    private String version;

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Arduino{" +super.toString() +
                ", version='" + version + '\'' +
                '}';
    }
}


