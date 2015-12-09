package by.julia.helloworld.entity;

/**
 * Created by julia on 08.11.2015.
 */
public class Book {

    private int id;
    private String name;
    private String pagesOfCount;
    private String authorName;

    public Book(int id, String name, String pagesOfCount, String authorName) {
        this.id = id;
        this.name = name;
        this.pagesOfCount = pagesOfCount;
        this.authorName = authorName;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPagesOfCount() {
        return pagesOfCount;
    }

    public void setPagesOfCount(String pagesOfCount) {
        this.pagesOfCount = pagesOfCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (pagesOfCount != null ? !pagesOfCount.equals(book.pagesOfCount) : book.pagesOfCount != null) return false;
        return !(authorName != null ? !authorName.equals(book.authorName) : book.authorName != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pagesOfCount != null ? pagesOfCount.hashCode() : 0);
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pagesOfCount='" + pagesOfCount + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
