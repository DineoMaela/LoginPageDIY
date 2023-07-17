/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author game
 */
public class LoginPage extends JFrame{
    
    //panel
    private JPanel headingPnl;
    private JPanel loginPnl;
    private JPanel btnPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel mainPnl;
    
    //buttons
    private JButton submitBtn;
    
    //textfield
    private JTextField usernameTxtFld;
    
    //passwordfield
    private JPasswordField passwordPassFld;
    
    //label
    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    
    public LoginPage(){
    
        setTitle("User login page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(600,650);
        setResizable(true);
        
        //create panel
        headingPnl = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        loginPnl = new JPanel(new GridLayout(2,1,1,1));
        mainPnl = new JPanel(new GridLayout(3,1,1,1));
        
        //create label
        headingLbl = new JLabel("Login details");
        usernameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("password: ");
        
        //create textfield n passwordfield
        usernameTxtFld = new JTextField(20);
        passwordPassFld = new JPasswordField(20);
        
        //create button
        submitBtn = new JButton("Submit");
        
        //add components to main
        headingPnl.add(headingLbl);
        
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxtFld);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordPassFld);
        
        loginPnl.add(usernamePnl);
        loginPnl.add(passwordPnl);
        
        btnPnl.add(submitBtn);
        
        mainPnl.add(headingPnl);
        mainPnl.add(loginPnl);
        mainPnl.add(btnPnl);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
    
    }
}
