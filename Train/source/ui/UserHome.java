//user defined package declaration
package ui;
//importing built in package
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.ComponentOrientation;
 import java.awt.Font;
  import java.awt.event.*;
  
 import java.util.ArrayList;
 import java.util.List;
import java.util.Vector;
// importing user defined package
import services.UserService;
 import entities.User;
 import entities.User1;
 import entities.User2;;

// class name
 class UserHome extends JFrame implements ActionListener{
      //Instance
       User user =new User();
       User1 user1=new User1();
       User2 user2=new User2();
       UserService us=new UserService();
       List<User> userList=new ArrayList<User>();
       List<User1> userList1=new ArrayList<User1>();

  
    JLabel jLabel=new JLabel("==OPTIONS==");
    JPanel jpedituser=new JPanel();
    JPanel jpdestination=new JPanel();
    JPanel jptrainlist=new JPanel();

    JButton jbedituser= new JButton("Edit User Info");
    JButton jbdestination=new JButton("Destination");
    JButton jbtrainlist=new JButton("Train List");
    
    JLabel idlJLabel=new JLabel("id");

    JLabel jpAddName=new JLabel("Name");
    JLabel jpAddUsername=new JLabel("Username");
    JLabel jpAddEmail=new JLabel("Email");
    JLabel jpAddPassword=new JLabel("Password");
    JLabel jpAddConfirmPassword=new JLabel("Confirm Password");
    JLabel jpAddDob=new JLabel("Date of Birth");
    JLabel jpAddGender=new JLabel("Gender");
   
   JLabel jpltrainno=new JLabel("Train_No");
   JLabel jpltname=new JLabel("tName");
   JLabel jpldeparture=new JLabel("Departure");
   JLabel jpldtime=new JLabel("dTime");
   JLabel jplarrival=new JLabel("Arrival");
   JLabel jplatime=new JLabel("aTime");
   JLabel jplticketprice=new JLabel("Ticket_price");
   
      JComboBox<String>jpcb=new JComboBox<String>(new String[]{"Chittagong-Dhaka","Dhaka-Chittagong","Dhaka-Dinajpur",
       "Dinajpur-Dhaka","Dhaka-Sylhet","Sylhet-Dhaka","Dhaka-Noakhali","Noakhali-Dhaka","Dhaka-Kishoreganj","Kishoreganj-Dhaka"});
      
   JLabel jpldestination=new JLabel("Destination:");
   
   JLabel jpldestinationitem=new JLabel("Selected Item:");
   JTextField jptdestinationitem=new JTextField();
   
   JLabel jpltrainname=new JLabel("Train Name:");
   JLabel jpldeparturetime=new JLabel("Departure Time:");
   JLabel jplarrivaltime=new JLabel("Arrival Time:");
   JLabel jplticketprice2=new JLabel("Ticket Price:");
   JButton jpbpurchase=new JButton("Purchase");
  
   JTextField jpttname=new JTextField();
   JTextField jptdeptime=new JTextField();
   JTextField jptarrivtime=new JTextField();
   JTextField jptticketp=new JTextField();

   JTextField idtField=new JTextField();
   JTextField jpaname=new JTextField();
   JTextField jpausername=new JTextField();
   JTextField jpaemail=new JTextField();
   JPasswordField jpapassword=new JPasswordField();
   JPasswordField jpaconfirmPassword=new JPasswordField();
   JTextField jpadob=new JTextField();
   JRadioButton jpamale=new JRadioButton("Male");
   JRadioButton jpafemale=new JRadioButton("Female");
   ButtonGroup bg=new ButtonGroup();
   JButton save=new JButton("Save");
   JButton search=new JButton("Search");
   // parameterless constructor
    public UserHome(){
       //GUI set frame details  on this Frame
        this.setSize(1000,800);
        this.getContentPane().setBackground(Color.BLACK);
        this.setTitle("Ticket Booking Form");
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //Graphical Control Elements set and adding on this frame
        jpedituser.setBounds(200,100,700,500);
        jpedituser.setBackground(Color.ORANGE);
        jpedituser.setLayout(null);
        this.add(jpedituser);
       

        jpdestination.setBounds(200,100,700,500);
        jpdestination.setBackground(Color.PINK);
        jpdestination.setLayout(null);
        this.add(jpdestination);

        jptrainlist.setBounds(200,100,700,500);
        jptrainlist.setBackground(Color.CYAN);
        jptrainlist.setLayout(null);
        this.add(jptrainlist);

        jpedituser.setVisible(false);
        jpdestination.setVisible(false);
        jptrainlist.setVisible(false);


        jLabel.setBounds(450, 50, 200, 25);
        jLabel.setForeground(Color.RED);
        jLabel.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,20));
        this.add(jLabel);

        jbedituser.setBounds(20, 200, 110, 30);
        jbedituser.setBackground(Color.YELLOW); 
        jbedituser.setLayout(null);
        this.add(jbedituser);
        jbedituser.addActionListener(this);

        jbdestination.setBounds(20, 250, 110, 30);
        jbdestination.setBackground(Color.YELLOW);
        jbdestination.setLayout(null);
        this.add(jbdestination);
        jbdestination.addActionListener(this);

        jbtrainlist.setBounds(20, 300, 110, 30);
        jbtrainlist.setBackground(Color.YELLOW);
        jbtrainlist.setLayout(null);
        this.add(jbtrainlist);
       jbtrainlist.addActionListener(this);

    }
    // methid overriding
   @Override
    public void actionPerformed(ActionEvent e){
        //
        if(e.getSource()==jbedituser){
            jpedituser.setVisible(true);
            jpdestination.setVisible(false);
            jptrainlist.setVisible(false);
            clearFields();
            setLabels();
          //
            jpAddName.setBounds(200, 50, 150,25);
            jpAddUsername.setBounds(200, 100, 150,25);
            jpAddEmail.setBounds(200, 150, 150,25);
            jpAddPassword.setBounds(200, 200, 150,25);
            jpAddConfirmPassword.setBounds(200, 250, 150,25);
            jpAddDob.setBounds(200, 300, 150,25);
            jpAddGender.setBounds(200, 350, 150,25);

            jpaname.setBounds(400, 50, 150,25);
            jpausername.setBounds(400, 100, 150,25);
            jpaemail.setBounds(400, 150, 150,25);
            jpapassword.setBounds(400, 200, 150,25);
            jpaconfirmPassword.setBounds(400, 250, 150,25);
            jpadob.setBounds(400, 300, 150,25);
            jpamale.setBounds(400, 350, 60,25);
            jpamale.setBackground(Color.CYAN);
            jpafemale.setBounds(480, 350, 70,25);
            jpafemale.setBackground(Color.CYAN);
            save.setBounds(400, 400, 150,25);
            save.setBackground(Color.CYAN);
            bg.add(jpamale);
            bg.add(jpafemale);

            jpedituser.add(jpAddName);
            jpedituser.add(jpAddUsername);
            jpedituser.add(jpAddEmail);
            jpedituser.add(jpAddPassword);
            jpedituser.add(jpAddConfirmPassword);
            jpedituser.add(jpAddDob);
            jpedituser.add(jpAddGender);
            
            jpedituser.add(jpaname);
            jpedituser.add(jpausername);
            jpedituser.add(jpaemail);
            jpedituser.add(jpapassword);
            jpedituser.add(jpaconfirmPassword);
            jpedituser.add(jpadob);
            jpedituser.add(jpamale);
            jpedituser.add(jpafemale);
            jpedituser.add(save);

            idlJLabel.setBounds(200, 10, 50,25);
            idtField.setBounds(270, 10, 80,25);
            search.setBounds(400, 10, 150,25);
            search.setBackground(Color.CYAN);
            
            jpedituser.add(idlJLabel);
            jpedituser.add(idtField);
            jpedituser.add(search);
            search.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    if(idtField.getText().equals("")){
                        JOptionPane.showMessageDialog(jpedituser,"Fill up id", "Error Message", JOptionPane.ERROR_MESSAGE);

                    }
                    else{
                
                user=us.searchUserById(Integer.valueOf(idtField.getText()));
                setLabels();
                if(user==null){
                    JOptionPane.showMessageDialog(jpedituser,"User Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    setLabels();
                    jpaname.setText(user.getName());
                    jpausername.setText(user.getUsername());
                    jpaemail.setText(user.getEmail());
                    jpapassword.setText(user.getPassword());
                    jpaconfirmPassword.setText(user.getPassword());
                    jpadob.setText(user.getDob());
                    if(user.getGender().equals("Male")){
                        jpamale.setSelected(true);
                    }
                    else{jpafemale.setSelected(true);}
                    
                }
            }
                
            }
            });
            save.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    
                    user.setName(jpaname.getText());
                    user.setUsername(jpausername.getText());
                    user.setEmail(jpaemail.getText());
                    user.setPassword(jpapassword.getText());
                    user.setDob(jpadob.getText());
                    if(jpaname.getText().equals("")||jpausername.getText().equals("") ||jpaemail.getText().equals("")||jpapassword.getText().equals("")||jpadob.getText().equals("") ||jpamale.isSelected()==false&&jpafemale.isSelected()==false){
                        JOptionPane.showMessageDialog(jbedituser, "Fill up all feilds properly", "Error", JOptionPane.ERROR_MESSAGE);}
           
                    else{
                    if(us.editUser(user)){
                        JOptionPane.showMessageDialog(jpedituser, "User Information Updated", "Message",JOptionPane.INFORMATION_MESSAGE);    
                        clearFields();
                    }
                    else{
                        JOptionPane.showMessageDialog(jpedituser, "User Information can not be Updated", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                    
                }
            });


        }
       
        else if(e.getSource()==jbdestination){
            jpdestination.setVisible(true);
            jpedituser.setVisible(false);
            jptrainlist.setVisible(false);
            
            jpdestination.add(jpldestination);
            jpdestination.add(jpltrainname);
            jpdestination.add(jpldeparturetime);
            jpdestination.add(jplarrivaltime);
            jpdestination.add(jplticketprice2);
            jpdestination.add(jpbpurchase);
            jpdestination.add(jpcb);

            jpdestination.add(jpldestinationitem);
            jpdestination.add(jptdestinationitem);

            jpdestination.add(jpttname);
            jpdestination.add(jptdeptime);
            jpdestination.add(jptarrivtime);
            jpdestination.add(jptticketp);

        

            jpldestination.setBounds(200,50,150,25);
            jpcb.setBounds(300,50,180,30);
            jpcb.setBackground(Color.CYAN);
            jpldestinationitem.setBounds(200,100,180,30);
            jptdestinationitem.setBounds(300,100,180,30);
             
            jpttname.setBounds(300,150,180,30);
            jptdeptime.setBounds(300,200,180,30);
            jptarrivtime.setBounds(300,250,180,30);
            jptticketp.setBounds(300,300,180,30);

            jpltrainname.setBounds(200,150,300,25);
            jpldeparturetime.setBounds(200,200,200,25);
            jplarrivaltime.setBounds(200,250,200,25);
            jplticketprice2.setBounds(200,300,200,25);
            jpbpurchase.setBounds(300,400,100,50);
            jpbpurchase.setBackground(Color.CYAN);
           
           
            jpcb.addActionListener(new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {
               
                     if(e.getSource()==jpcb){
                        
                        jptdestinationitem.setText(jpcb.getSelectedItem().toString());
                        
                      
                          user2=us.searchUserDestination(jpcb.getSelectedItem().toString());
                 
                
                        if(user2==null){
                          JOptionPane.showMessageDialog(jpdestination," Not found" ,"Not Found",JOptionPane.INFORMATION_MESSAGE);

                           }
                        
                    else{
                   
                     
                       jpttname.setText(user2.getTrainName());
                       jptdeptime.setText(user2.getDepartureTime());
                       jptarrivtime.setText(user2.getArrivalTime());
                       jptticketp.setText(user2.getTicketPrice());
                    

                       }
                     
                  

               
                  }

              }    
                

                   });
                   jpbpurchase.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        if(jpttname.getText().equals("")||jptdeptime.getText().equals("")||jptarrivtime.getText().equals("")||jptticketp.getText().equals("")){
                            JOptionPane.showMessageDialog(jpcb, "Please select Item from combobox", "Message",JOptionPane.INFORMATION_MESSAGE);   
                        }
                         

                             else{
                          if(jpbpurchase.getText()=="Purchase"){

                            JOptionPane.showMessageDialog(jpcb, "Ticket Puchased", "Message",JOptionPane.INFORMATION_MESSAGE);    

                          }
                        }
                        
                       
                    }
                   });

                 
            }
         
            
        
        else if(e.getSource()==jbtrainlist){
            jptrainlist.setVisible(true);
            jpedituser.setVisible(false);
            jpdestination.setVisible(false);
        
            clearField();
          
            jptrainlist.removeAll();
   
            jpltrainno.setBounds(20,50,70,25);
            jpltname.setBounds(100,50,130,25);
            jpldeparture.setBounds(240,50,80,25);
            jpldtime.setBounds(330,50,50,25);
            jplarrival.setBounds(410,50,100,25);
            jplatime.setBounds(520,50,100,25);
            jplticketprice.setBounds(610,50,100,25);

            

            jptrainlist.add(jpltrainno);
            jptrainlist.add(jpltname);
            jptrainlist.add(jpldeparture);
            jptrainlist.add(jpldtime);
            jptrainlist.add(jplarrival);
            jptrainlist.add(jplatime);
            jptrainlist.add(jplticketprice);

            userList1=us.loadAllTrainSchedule();

            if(userList1!=null){
                int y=50;
            
               setLabel();
            //For each loop
            for(User1 u1:userList1){

                JLabel trainNo=new JLabel(String.valueOf((u1.getTrainNo())));
                JLabel trainName=new JLabel(u1.getTrainName());
                JLabel departure=new JLabel(u1.getDeparture());
                JLabel departureTime=new JLabel(u1.getDepartureTime());
                JLabel arrival=new JLabel(u1.getArrival());
                JLabel arrivalTime=new JLabel(u1.getArrivalTime());
                JLabel ticketPrice=new JLabel(u1.getTicketPrice());

                y+=20;

                trainNo.setBounds(20,y+10,70,25);
                jptrainlist.add(trainNo);
                trainName.setBounds(100,y+10,130,25);
                jptrainlist.add(trainName);
                departure.setBounds(240,y+10,80,25);
                jptrainlist.add(departure);
                departureTime.setBounds(330,y+10,50,25);
                jptrainlist.add(departureTime);
                arrival.setBounds(410,y+10,100,25);
                jptrainlist.add(arrival);
                arrivalTime.setBounds(520,y+10,100,25);
                jptrainlist.add(arrivalTime);
                ticketPrice.setBounds(610,y+10,100,25);
                jptrainlist.add(ticketPrice);

                

                trainNo=trainName=departure=departureTime=arrival=arrivalTime=ticketPrice=null;
            }
            y=0;
            userList1.clear();

            }
            else{
                 JOptionPane.showMessageDialog(jptrainlist,"Data not found","Error",JOptionPane.ERROR_MESSAGE);
            } 
        }
        

    }
    //methods
    void clearFields(){
        idtField.setText("");
        jpaname.setText("");
        jpausername.setText("");
        jpaemail.setText("");
        jpapassword.setText("");
        jpaconfirmPassword.setText("");
        jpadob.setText("");
        jpamale.setSelected(false);
        jpafemale.setSelected(false);
        //
    
    }
    void clearField(){
       
        //
        jpltrainno.setText(""); 
        jpltname.setText("");
        jpldeparture.setText("");
        jpldtime.setText("");
        jplarrival.setText("");
        jplatime.setText("");
        jplticketprice.setText("");  
        jpldestinationitem.setText(""); 
        
        jpltrainname.setText("");
        jpldeparturetime.setText("");
        jplarrivaltime.setText("");
        jplticketprice2.setText("");
        
    }

    void setLabels(){
        jpAddName.setText("Name");
        jpAddUsername.setText("Username");
        jpAddEmail.setText("Email");
        jpAddPassword.setText("Password");
        jpAddDob.setText("Date of Birth");
        jpAddGender.setText("Gender");
      
        
    }
    void setLabel(){
     
        jpltrainno.setText("Train_No");
        jpltname.setText("tName");
        jpldeparture.setText("Departure");
        jpldtime.setText("dTime");
        jplarrival.setText("Arrival");
        jplatime.setText("aTime");
        jplticketprice.setText("Ticket_Price");
        jpldestinationitem.setText("Selected Item");
    }
    void setLabel1(){
     
          jpltrainname.setText("tName");
          jpldeparture.setText("dTime");
          jplarrivaltime.setText("aTime");
          jplticketprice2.setText("Ticket_Price");
      }


}





