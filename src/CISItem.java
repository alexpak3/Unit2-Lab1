public class CISItem {
    private String name;
    private String location;
    private int cost;
    private String description;

//    public CISItem(String name, String location, int cost, String description){
//        this.cost = cost;
//        this.description = description;
//        this.location = location;
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "CISItem{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }
}