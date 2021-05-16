//user defined package declaration
package entities;
//class name
public class User{
    //fields
    private int id;
    String name,username,email,password,dob,gender;
       
    //parameterless constructor
    public User(){}
    //parameterized constructor
    public User(String[] values){
        this.name=values[0];
        this.username=values[1];
        this.email=values[2];
        this.password=values[3];
        this.dob=values[4];
        this.gender=values[5];
    
    }
    //setter methods

    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    } 
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }


   //getter methods 
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getEmail() {
        return email;
    }
   
    public String getPassword() {
        return password;
    }
    
    public String getDob() {
        return dob;
    }
    
    public String getGender() {
        return gender;
    }
}