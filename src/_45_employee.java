public class _45_employee  extends _45_person{

    int salary;

    _45_employee(String first ,String last , int salary){
        super(first,last);
        this.salary = salary;

    }

    void showsalary(){
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
