public class Phone extends ElectronicItem{
    private String networkType;
    private int screenSize;

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getNetworkType() {
        return networkType;
    }

    public int getScreenSize() {
        return screenSize;
    }
}
