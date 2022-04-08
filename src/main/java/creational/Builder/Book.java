package creational.Builder;

public class Book {
    private String title;
    private String intro;
    private String author;
    private double price;
    private int numberOfPages;
    private float rate;

    private Book(String title, String intro, String author, Double price, int numberOfPages, float rate) {
        this.title = title;
        this.intro = intro;
        this.author = author;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.rate = rate;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getIntro() {

        return intro;
    }

    public void setIntro(String intro) {

        this.intro = intro;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getNumberOfPages() {

        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {

        this.numberOfPages = numberOfPages;
    }

    public float getRate() {

        return rate;
    }

    public void setRate(float rate) {

        this.rate = rate;
    }

    public static class Builder {
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setIntro(String intro) {
            this.intro = intro;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
            return this;
        }

        public Builder setRate(float rate) {
            this.rate = rate;
            return this;
        }

        private String title;
        private String intro;
        private String author;
        private double price;
        private int numberOfPages;
        private float rate;

        public Book build() {
            return new Book(title, intro, author, price, numberOfPages, rate);
        }
    }
}
