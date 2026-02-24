public class _45_super {
    public static void main(String[] args) {

         // super = reprs to the parent class    (superclass -> subclass)

        //  used in constructor and method overriding
        // calls the parent constructor to initialize attributes

        _45_person PERSON = new _45_person("THOMAS","SHELBY ");
        _45_STUDENT student = new _45_STUDENT("Harry","potter",9.9);
        _45_employee employee = new _45_employee("DINO","JAMES", 50000);
        PERSON.showname();
        student.showname();
        System.out.println(student.gpa);
        student.showgpa();
        employee.showsalary();
    }
}
