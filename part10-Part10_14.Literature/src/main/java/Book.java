public class Book implements Comparable<Book> {

    private String title;
    private int ageRecommendation;

    public Book(String title, int ageRecommendation) {
        this.title = title;
        this.ageRecommendation = ageRecommendation;
    }

    @Override
    public String toString() {
        return title + " (recommended for " + ageRecommendation + " year-olds or older)";
    }

    @Override
    public int compareTo(Book book){
        int comparingResult = Integer.compare(this.ageRecommendation, book.ageRecommendation);
        if(comparingResult == 0){
            return this.title.compareTo(book.title);
        }
        return comparingResult;
    }
}
