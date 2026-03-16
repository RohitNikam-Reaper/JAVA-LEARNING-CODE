public class _53_library {
    String name;
    int year;
    _53_book[] books;

    _53_library(String name, int year , _53_book[] books){
        this.name = name;
        this.year = year;
        this.books = books ;

    }
    void displayinfo(){
        System.out.println("The " + this.year + " " + this.name );
        System.out.println("Books Available: ");
        for(_53_book book : books){
            System.out.println(book.displayinfo());
        }
    }
}
