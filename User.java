package passgen;

public class User {
    private String username;
    private String password;
     
    public User(String username){
        this.username = username;
        this.password = PassGenerator.passGen(12);
    }
    public String getUsername(){
        return this.username;
    }
    public String  getPassword(){
        return this.password;
    }
}
