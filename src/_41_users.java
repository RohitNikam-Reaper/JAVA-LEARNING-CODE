public class _41_users {
    String username;
    String email;
    int age;

    _41_users (){
        this.username = "GUEST";
        this.email = "not provided" ;
        this.age= 0;
    }
    _41_users (String username) {
        this.username = username;
        this.email = "not provided";
        this.age = 0;
    }
    _41_users (String username,String email){
        this.username= username;
        this.email = email;
        this.age= 0;
    }
    _41_users (String username,String email,int age){
        this.username= username;
        this.email = email;
        this.age= age;
    }
}
