public class _45_STUDENT extends _45_person {

    double gpa;

    _45_STUDENT(String first , String last , double gpa ){
        super(first,last);
        this.gpa = gpa;
    }

    void showgpa(){
        System.out.println(this.first + " 's gpa is:  "+ this.gpa);
    }
}
