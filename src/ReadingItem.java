public class ReadingItem extends CISItem{
    int wordCount;
    String datePublished;
    String author;

//    public ReadingItem(String name, String location, int cost, String description, int wordCount, String datePublished, String author) {
//        super(name, location, cost, description);
//        this.author = author;
//        this.wordCount = wordCount;
//        this.datePublished = datePublished;
//    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public String getAuthor() {
        return author;
    }

    public int getWordCount() {
        return wordCount;
    }
}
