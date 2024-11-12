public class Magazine extends ReadingItem{
    private String coverStoryTitle;
    private String printDate;

//    public Magazine(String name, String location, int cost, String description, int wordCount, String datePublished, String author) {
//        super(name, location, cost, description, wordCount, datePublished, author);
//    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }

    public void setCoverStoryTitle(String coverStoryTitle) {
        this.coverStoryTitle = coverStoryTitle;
    }

    public String getPrintDate() {
        return printDate;
    }

    public String getCoverStoryTitle() {
        return coverStoryTitle;
    }

    @Override
    public String toString() {
        return "Magazine{" + super.toString() +
                ", coverStoryTitle='" + coverStoryTitle + '\'' +
                ", printDate='" + printDate + '\'' +
                '}';
    }
}
