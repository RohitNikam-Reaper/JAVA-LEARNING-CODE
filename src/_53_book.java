public class _53_book {
    String title;
    int pages;

    _53_book(String title, int pages){
        this.title = title;
        this.pages = pages;

    }
    String displayinfo(){
        return this.title + " (" + this.pages + ") pages";

    }
}
