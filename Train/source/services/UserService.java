//user defined package
package services;
//importing builting package
import java.util.*;
//importing user defined package
import entities.User;
import repositories.UserRepository;
import entities.User1;
import entities.User2;
//class name
public class UserService{
    //aggregation
    User user;
    User1 user1;
    User2 user2;
   // instance
    List<User> userList=new ArrayList<User>();
    List<User1> userList1=new ArrayList<User1>();
    UserRepository urp=new UserRepository();
    //methods
    public boolean addNewUser(User user){
        return urp.insertToDb(user);
    }
    public boolean editUser(User user){
        return urp.updateToDb(user);
    }
    public boolean deleteUser(int id){
        return urp.removeFromDb(id);
    }
    public User searchUserById(int id){
        user= urp.getUserFromDb(id);
        return user;
    }
     
    public User2 searchUserDestination( String name){
        user2=urp.getUserDestination(name);
        return user2;
    }
    

    public List<User> loadAllUser(){
        userList= urp.getAllUser();
        return userList;
    }
    public List<User1> loadAllTrainSchedule(){
        userList1= urp.getAllTrainSchedule();  
        return userList1;
    }
}