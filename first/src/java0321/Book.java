package java0321;

public class Book {
    String title;
    String author;
    void show(){
        System.out.println(title+" "+author);
    }

    public Book(){
        this("","홍길동");
        System.out.println("1");
    }
    public Book(String title){
        this(title, "작가미상");
        System.out.println("2");
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("3");
    }

    public static void main(String[] args) {
        Book emptyBook = new Book();
        emptyBook.show();
    }
}
