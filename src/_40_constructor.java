
public class _40_constructor {

    public static void main(String[] agrs){

        // constructor =  a special method to initialize a objects
        // you can pass argument to  a constructor
        // and set up intial values

        _40_student student1 = new _40_student("BATMAN",30,9.99);
        _40_student student2 = new _40_student("JOKER",29,8.67);
        _40_student student3 = new _40_student("SUPERMAN",30,9.78);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student2.name);
        System.out.println(student3.isenroll);

        student1.study();
        student2.study();
        student3.study();


    }
}
