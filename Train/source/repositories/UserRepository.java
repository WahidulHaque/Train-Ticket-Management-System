//user defined package declaratin
package repositories;
//Imporrting builting package
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
//importing user defined package
import entities.User;
import entities.User1;
import entities.User2;

//class name
public class UserRepository{
    //aggregation
    Connection con;
    Statement stm;
    ResultSet rs;
//instance
    User user=new User();
    User1 user1=new User1();
    User2 user2=new User2();
    List<User> userList=new ArrayList<User>();
    List<User1>userList1=new ArrayList<User1>();

     

    //parameterless constructor
    public UserRepository(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            stm=con.createStatement();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
//method
    public boolean insertToDb(User user){
        int i=0;
        try{
            i=stm.executeUpdate("INSERT INTO users(name,username,email,password,dob,gender) VALUES('"+user.getName()+"','"+user.getUsername()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getDob()+"','"+user.getGender()+"')");
            
        }catch(SQLException e){
            System.out.println(e);
        }
        if(i==1){
            return true;
        }
        else{
            return false;
        }
        
    }

//method
    public boolean updateToDb(User user){
        int i=0;
        try{
            i=stm.executeUpdate("UPDATE users SET name='"+user.getName()+"',username='"+user.getUsername()+"',email='"+user.getEmail()+"',password='"+user.getPassword()+"',dob='"+user.getDob()+"',gender='"+user.getGender()+"' WHERE id="+user.getId());
            
        }catch(SQLException e){
            System.out.println(e);
        }
        if(i==1){
            return true;
        }
        else{
            return false;
        }
        
    }
//method
    public boolean removeFromDb(int id){
        int i=0;
        try{
            i=stm.executeUpdate("DELETE FROM users WHERE id="+id);
            
        }catch(SQLException e){
            System.out.println(e);
        }
        if(i==1){
            return true;
        }
        else{
            return false;
        }
        
    }
//method
    public User getUserFromDb(int id){
    
        try{
            rs=stm.executeQuery("SELECT * FROM users WHERE id="+id);
            if(rs.next()){
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setName((rs.getString("name")));
                user.setUsername((rs.getString("username")));
                user.setEmail((rs.getString("email")));
                user.setPassword((rs.getString("password")));
                user.setDob((rs.getString("dob")));
                user.setGender((rs.getString("gender")));
               // System.out.println(user.getName());
                return user;
            }
            else{
                return null;
            }
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
            return null;
        
        
    }//method
    public User2 getUserDestination(String name){
      
        try{
            
             rs=stm.executeQuery("SELECT * FROM trainschedule WHERE Destination='"+name+"'");
            
               rs.next();
              
            
                User2 user2=new User2();
                user2.setTrainNo(Integer.parseInt(rs.getString("Train_No")));
                user2.setTrainName((rs.getString("tName")));
                user2.setDeparture((rs.getString("Departure")));
                user2.setDepartureTime((rs.getString("dTime")));
                user2.setArrival((rs.getString("Arrival")));
                user2.setArrivalTime((rs.getString("aTime")));
                user2.setTicketPrice((rs.getString("Ticket_Price")));
                user2.setDestination((rs.getString("Destination")));
      
                return user2;

            }catch(Exception e){
              e.printStackTrace();
              
                return null;
            
        }
        
        
        
    }
  
//method
    public List<User> getAllUser(){
    
        try{
            rs=stm.executeQuery("SELECT * FROM users");
            while(rs.next()){
                user=new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setName((rs.getString("name")));
                user.setUsername((rs.getString("username")));
                user.setEmail((rs.getString("email")));
                user.setPassword((rs.getString("password")));
                user.setDob((rs.getString("dob")));
                user.setGender((rs.getString("gender")));
                userList.add(user);
                
            }
            //System.out.println(userList);
            return userList;
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
            return null;
        
        
    }
    //method
    public List<User1> getAllTrainSchedule(){
    
        try{
            rs=stm.executeQuery("SELECT * FROM trainschedule");
            while(rs.next()){
                user1=new User1();
                
                user1.setTrainNo(Integer.valueOf(rs.getString("Train_NO")));
                user1.setTrainName(rs.getString("tName"));
                user1.setDeparture(rs.getString("Departure"));
                user1.setDepartureTime(rs.getString("dTime"));
                user1.setArrival(rs.getString("Arrival"));
                user1.setArrivalTime(rs.getString("aTime"));
                user1.setTicketPrice(rs.getString("Ticket_Price"));
                userList1.add(user1);
            }
           
            return userList1;
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
            return null;
        
        
    }
//method
    public boolean loginValidationUser(String username,String password){
        try{
            rs=stm.executeQuery("SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'");
            
            if(rs.next()){
                return true;
            }
        }catch(SQLException d){
            System.out.println(d);
        }
        return false;
    }
    //method
    public boolean loginValidationAdmin(String username,String password){
        try{
              rs=stm.executeQuery("SELECT * FROM admin WHERE name='"+username+"' AND password='"+password+"'");
                
               if(rs.next()){
                    
                  return true;
              }
        }catch(SQLException d){
            System.out.println(d);
        }
        return false;
    }


}
