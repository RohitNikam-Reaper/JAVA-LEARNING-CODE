public class _40_student {

    String name;
    int age;
    double gpa;
    boolean isenroll;

    _40_student (String name , int age , double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isenroll = true;
    }
    void study(){
        System.out.println(this.name+ " is studing");
    }
}
