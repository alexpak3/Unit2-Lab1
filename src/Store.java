import java.util.ArrayList;

public class Store {
    private ArrayList<CISItem> cisItems;

    public Store() {
         this.cisItems = new ArrayList<>();
    }

    public void addBook(Book book) {
        cisItems.add(book);

    }

    public void addPhone(Phone phone) {
        cisItems.add(phone);
    }

    public void addMagazine(Magazine magazine) {
        cisItems.add(magazine);
    }

    public void addArduino(Arduino arduino) {
        cisItems.add(arduino);
    }

    public void updatePhonesLocation(String location) {
        for ( int i = 0; i <cisItems.size(); i++){
           if (cisItems.get(i).getClass()==Phone.class){
               cisItems.get(i).setLocation(location);
           }
        }
    }

    public ArrayList<Phone> getAllPhones() {
        ArrayList <Phone> out = new ArrayList<Phone>();
        for( int i = 0; i<cisItems.size();i++){
            if(cisItems.get(i).getClass() == Phone.class){
                out.add((Phone) cisItems.get(i));
            }
        }
        return out;
    }
    public <CISItem> ArrayList <CISItem> getItemType(String itemType){
        for( int i = 0; i < cisItems.size();i++){
            if (cisItems.get(i).getClass().getSimpleName().equalsIgnoreCase(itemType)==false){
                cisItems.remove(i);

            }
        }
        return (ArrayList<CISItem>) cisItems;
    }
    public void updateItem ( String itemType ,String property,  String value){
        for( int i = 0; i < cisItems.size();i++) {
            if (itemType.getClass().getSimpleName().equalsIgnoreCase(itemType)) { // Check if item type matches
                switch (property.toLowerCase()) {
                    case"location":
                        if(cisItems.get(i) instanceof CISItem){
                            cisItems.get(i).setLocation(value);
                        }
                    break;
                    case"cost":
                    if(cisItems.get(i) instanceof CISItem){
                        cisItems.get(i).setCost(Integer.parseInt(value));
                    }
                    break;
                    case"description":
                        if(cisItems.get(i) instanceof CISItem){
                            cisItems.get(i).setDescription(value);
                        }
                        break;
                    case"name":
                        if(cisItems.get(i) instanceof CISItem){
                            cisItems.get(i).setName(value);
                        }
                        break;
                    case "storagecapacity":
                        if(cisItems.get(i) instanceof ElectronicItem){
                            ((ElectronicItem) cisItems.get(i)).setStorageCapacity(Integer.parseInt(value));
                        }
                        break;
                    case "model":
                        if(cisItems.get(i) instanceof ElectronicItem){
                            ((ElectronicItem) cisItems.get(i)).setModel(value);
                        }
                        break;
                    case "maker":
                        if(cisItems.get(i) instanceof ElectronicItem){
                            ((ElectronicItem) cisItems.get(i)).setMaker(value);
                        }
                        break;
                    case "operatingsystem":
                        if(cisItems.get(i) instanceof ElectronicItem){
                            ((ElectronicItem) cisItems.get(i)).setOperatingSystem(value);
                        }
                        break;
                    case "wordcount":
                        if(cisItems.get(i) instanceof ReadingItem){
                            ((ReadingItem) cisItems.get(i)).setWordCount(Integer.parseInt(value));
                        }
                        break;
                    case "datepublished":
                        if(cisItems.get(i) instanceof ReadingItem){
                            ((ReadingItem) cisItems.get(i)).setDatePublished(value);
                        }
                        break;
                    case "author":
                        if(cisItems.get(i) instanceof ReadingItem){
                            ((ReadingItem) cisItems.get(i)).setAuthor(value);
                        }
                        break;
                    case "isbn":
                        if (cisItems.get(i) instanceof Book) {
                            ((Book) cisItems.get(i)).setIsbn(value);

                        }
                        break;
                    case "title":
                        if (cisItems.get(i) instanceof Book) {
                            (((Book) cisItems.get(i))).setTitle(value);
                        }
                        break;
                    case "edition":
                        if (cisItems.get(i) instanceof Book) {
                            (((Book) cisItems.get(i))).setEdition(value);
                        }
                        break;
                    case "printdate" :
                        if(cisItems.get(i) instanceof Magazine){
                            (((Magazine) cisItems.get(i))).setPrintDate(value);
                        }
                        break;
                    case "coverstorytile":
                        if(cisItems.get(i) instanceof Magazine) {
                            (((Magazine) cisItems.get(i))).setCoverStoryTitle(value);
                        }
                        break;

                        case "networktype":
                        if(cisItems.get(i) instanceof Phone) {
                            (((Phone) cisItems.get(i))).setNetworkType(value);
                        }
                        break;
                        case "screensize":
                            if(cisItems.get(i) instanceof Phone){
                                (((Phone) cisItems.get(i))).setScreenSize(Integer.parseInt(value));
                            }
                            break;
                    case "arduino":
                        if(cisItems.get(i) instanceof Arduino){
                            (((Arduino) cisItems.get(i))).setVersion(value);
                    }
                        break;
                }
            }
        }
    }
    public void showAllInfo(){
        System.out.println(cisItems);
    }
    public void addItems(CISItem cisItem){
        cisItems.add(cisItem);
    }
}
