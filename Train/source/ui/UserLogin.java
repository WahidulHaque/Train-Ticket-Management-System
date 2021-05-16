//user defined package declaration
package ui;
//importing built in package
  import javax.swing.*;
  import java.awt.*;
 import java.awt.event.*;
 //import javax.swing.ImageIcon;
 
 import java.awt.Color;
 
 import java.awt.Font;
 //importing user defined package
 import services.*;
//classname
public class UserLogin extends JFrame implements ActionListener{
    //Graphical Control Elements
    JLabel lalf=new JLabel("Account Login Form");
    JLabel username=new JLabel("Username");
    JTextField jtfu=new JTextField();
    JLabel passname=new JLabel("Password");
    JPasswordField password=new JPasswordField();
    JButton login=new JButton("Login");
    JButton signupButton=new JButton("Sign Up");
 
//parameterless constructor
    public UserLogin(){
        //GUI set frame details of Train Ticket Management System login form on this Frame
        this.setTitle("Train Ticket Management System");
        this.setSize(700,500);
        this.setBackground(Color.PINK);
        this.getContentPane().setBackground(Color.GREEN);


        this.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,20));
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    
       //Graphical Control Elements set and adding on this frame
        lalf.setBounds(165, 10, 200, 80);
        lalf.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,20));
        lalf.setForeground(Color.BLACK);
        this.add(lalf);

        username.setBounds(100,100,100, 25);
        username.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,20));
        username.setForeground(Color.BLACK);
        this.add(username);

        jtfu.setBounds(100, 150, 100, 25);
        this.add(jtfu);

        passname.setBounds(250, 100, 150, 25);
        passname.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,20));
        passname.setForeground(Color.BLACK);
        this.add(passname);

        password.setBounds(250, 150, 100, 25);
        this.add(password);
        login.setBounds(159, 200, 130, 25);
        login.setBackground(Color.CYAN);

        this.add(login);
        //Graphical Control element object registers addActionListener on this Frame
        login.addActionListener(this);
        signupButton.setBounds(159, 250, 130, 25);
         signupButton.setBackground(Color.CYAN);

        this.add(signupButton);
        //Graphical Control element object registers addActionListener on this Frame
        signupButton.addActionListener(this);

    }
    //password validation method
    boolean validation(){ 
        return true;
        
    }
    // actionPerformed method override handles action events
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signupButton){
            UserRegistration ur=new UserRegistration();
            this.dispose();
        }
        else if(e.getSource()==login){
          
            if(jtfu.getText().equals("")||password.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Fill up properly","Error Message",JOptionPane.ERROR_MESSAGE);
            }
            else{
            LoginService ls=new LoginService();
            if(ls.getValidation1(jtfu.getText(),password.getText())){
                this.dispose();
                AdminHome uh=new AdminHome();
                
               }
            
            
               else  if(ls.getValidation2(jtfu.getText(),password.getText())){
                    this.dispose();
                    UserHome uh=new UserHome();
               
                }
            }
            }
          //  JOptionPane.showMessageDialog(this,"Not Matched","Error Message",JOptionPane.ERROR_MESSAGE);



    
        
    }
        
    //Main method
    public static void main(String[] args) {
        //Instance
        UserLogin us= new UserLogin();
        // us.pack();
    }
}