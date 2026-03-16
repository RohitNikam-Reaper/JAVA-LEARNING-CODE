public class _53_aggregation {
    public static void main(String[] args){

        // AGGREGATION:- Represent a "HAS-A" relationship between objects
        //              one object contain another object as part of it's structure
        //              but the contained object/s can exist independently

        _53_book book1 = new _53_book("Frankenstein" , 353 );
        _53_book book2 = new _53_book("Pan's Labyrinth" , 320 );
        _53_book book3 = new _53_book("50 Shades Of Grey" , 560 );

        _53_book[] books = {book1,book2,book3}; // array of books
//        for (_53_book book : books){
//            System.out.println(book.displayinfo());
//        }

        _53_library library = new _53_library("NYC LIBRARY",1897, books);
        // this book object is aggregation
        library.displayinfo();
        // the important concept is that i delete the library class the objects book1.2.3 can exist independently
    }
}
