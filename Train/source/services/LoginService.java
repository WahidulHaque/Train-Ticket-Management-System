//User defined package declaration
package services;
///importing user defined package
import repositories.UserRepository;
//class name
public class LoginService{
     //Instance
    UserRepository urp=new UserRepository();
    //Parameterless constructor
    public LoginService(){

    }
    //methods
    public boolean getValidation1(String username,String password){
      
        return urp.loginValidationAdmin(username, password);
    }
    public boolean getValidation2(String username,String password){
        return urp.loginValidationUser(username, password);
    }
}