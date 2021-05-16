//user defined package declaration
package ui;
//built in package importing
import javax.swing.*;
import java.awt.event.*;
 
import java.awt.Color;
 
 import java.awt.Font;

//user defined package importing
import services.UserService;
//import sun.security.util.Password;
import entities.User;
//class name
class UserRegistration extends JFrame implements ActionListener{
  //aggregation
    User user;
    //Instance
    JLabel jLabel=new JLabel("User Registration Form");
    JLabel lName=new JLabel("Name");
    JLabel lUsername=new JLabel("Username");
    JLabel lEmail=new JLabel("Email");
    JLabel lPassword=new JLabel("Password");
    JLabel lConfirmPassword=new JLabel("Confirm Password");
    JLabel lDob=new JLabel("Date of Birth");
    JLabel lGender=new JLabel("Gender");

    JTextField name=new JTextField();
    JTextField username=new JTextField();
    JTextField email=new JTextField();
    JPasswordField password=new JPasswordField();
    JPasswordField confirmPassword=new JPasswordField();
    JTextField dob=new JTextField();
    JRadioButton male=new JRadioButton("Male");
    JRadioButton female=new JRadioButton("Female");
    ButtonGroup bg=new ButtonGroup();
    JButton register=new JButton("Submit");
    

//parameterless constructor
    public UserRegistration(){
           //GUI set frame details  on this Frame
        this.setSize(725,700);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Registration Form");
        this.setBackground(Color.RED);

        this.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,20));
    //Graphical Control Elements set and adding on this frame
        jLabel.setBounds(300, 30, 200, 50);
        this.add(jLabel);
        jLabel.setForeground(Color.BLACK);
        lName.setBounds(200, 100, 100, 10);
        this.add(lName);
        lUsername.setBounds(200, 150, 100, 10);
        this.add(lUsername);
        lEmail.setBounds(200, 200, 100, 10);
        this.add(lEmail);
        lPassword.setBounds(200, 250, 100, 10);
        this.add(lPassword);
        lConfirmPassword.setBounds(200, 300, 150, 10);
        this.add(lConfirmPassword);
        lDob.setBounds(200, 350, 100, 10);
        this.add(lDob);
        lGender.setBounds(200, 400, 100, 10);
        this.add(lGender);

        name.setBounds(350, 90, 150, 25);
        this.add(name);
        name.addActionListener(this);
        username.setBounds(350, 140, 150, 25);
        this.add(username);
        username.addActionListener(this);
        email.setBounds(350, 190, 150, 25);
        this.add(email);
        password.setBounds(350, 240, 150, 25);
        this.add(password);
        confirmPassword.setBounds(350, 290, 150, 25);
        this.add(confirmPassword);
        dob.setBounds(350, 340, 150, 25);
        this.add(dob);
        male.setBounds(350, 395, 80, 25);
        male.setBackground(Color.PINK);

        this.add(male);
        female.setBounds(450, 395, 80, 25);
        female.setBackground(Color.PINK);

        this.add(female);
        bg.add(male);
        bg.add(female);
        register.setBounds(280, 450, 150, 25);
        register.setBackground(Color.PINK);

        this.add(register);
        register.addActionListener(this);

    }
    //method overriding
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==register){

              if(name.getText().equals("") ||username.getText().equals("")||email.getText().equals("")||password.getText().equals("")||confirmPassword.getText().equals("") ||male.isSelected()==false&&female.isSelected()==false){
                JOptionPane.showMessageDialog(this,"Information is not filled","Error Message",JOptionPane.ERROR_MESSAGE);
              }
                else{
             
              UserService us=new UserService();
        
              User user=new User(new String[]{name.getText(),username.getText(),email.getText(),password.getText(),dob.getText(),"Male"});
              if(us.addNewUser(user)){
                JOptionPane.showMessageDialog(this, "User Registered.", "Notification", JOptionPane.INFORMATION_MESSAGE);
                new UserLogin();
                this.dispose();
            }

            
              }
         
        
            }
          }

    
    }

    
