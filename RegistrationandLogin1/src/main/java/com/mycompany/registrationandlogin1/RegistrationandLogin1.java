/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandlogin1;
import java.util.Scanner;
/**
 *
 * @author thand
 */
public class RegistrationandLogin1 {

    public static void main(String[] args) {
         Scanner input =  new Scanner(System.in);
        
        String username;
        String password;
         String cellphone;
         String loguser;
        String logpass;
       String logcell;
        
        System.out.println("\n--Register your account---");
        System.out.print("Enter username :");
        username=input.nextLine();
        
        //conditions for username
        
    if (username.length() <=5 & username.contains("_") ) {
            System.out.println("Username suucessfully captured");
       } else {
            System.out.println("Username is not correctly formatted, please insure username contains and underscore and is no more than 5 characters in length.");
        }
        
        System.out.print("Enter Password: ");
        password = input.nextLine();
        //conditions for password
        // Check null, lenght, a Capital letter, a number and a special character
       if (password.length() >=8 & password.matches(".*[A-Z].*") & password.matches(".*\\d.*") & password.matches(".*[!@#$%^&*(),.?\":{}|<>].*") ){
           System.out.println("Password successfully captured");
       }else{
           System.out.println("Password is not correctly formatted,please ensure that the password contains at least eight characters,a capital letter,a number and a special character");
       }
         System.out.print("Enter Cellphone number :+ ");
         cellphone=input.nextLine();
         
//conditions for cellphone numbr
//Check if it starts with country code(27) and 12 characters total (27 + 9 digits)
        if (cellphone.startsWith("27") && cellphone.length() == 11 && cellphone.matches("\\27\\d{9}")) {
            System.out.println("Cell number successfully captured");
        } else {
            System.out.println("Cellpnone number incorrectly formatted or does not contain international code");
        }
        boolean ValidUser=username.length() <= 5 && username.contains ("_");
        boolean Validpass=password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        boolean Validcell=cellphone.startsWith("27") && cellphone.length() == 11 && cellphone.matches("\\27\\d{9}");
        
        if (ValidUser && Validpass && Validcell){
        System.out.print("This user is registed successfully : " + username);
        }else{
            System.out.print("Account registration failed");
        }
         //Login
        System.out.println("\n--Login to the chat app--");
        
        System.out.print("Enter Registered username : ");
       loguser=input.nextLine();
        if (loguser.matches(username)){
        System.out.println("username Successfully loged in");
        }else{
            System.out.println("Please ensure Registered username matches entered username");
        }
         
        System.out.print("Enter Registered password : ");
       logpass=input.nextLine();
        if (logpass.matches(password)){
        System.out.println("password Successfully loged in");
        }else{
            System.out.println("Please ensure Registered password matches entered password");
        }
        
        System.out.print("Enter Registered cellphone number :+ ");
       logcell=input.nextLine();
        if (logcell.matches(cellphone)){
        System.out.println("Cellphone Number Successfully loged in");
        }else{
            System.out.println("Please ensure Cellphone username matches entered cellphone");
        }
        
       boolean validloguser=username.length() <= 5 && username.contains ("_");
        boolean validlogpass=password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        boolean validlogcell=cellphone.startsWith("27") && cellphone.length() == 11 && cellphone.matches("\\27\\d{9}");
        
        if (validloguser && validlogpass && validlogcell){
        System.out.print("Welcome" + username + "it is great to see you ");
        }else{
            System.out.print("Account log in failed");
        }
    

       }
        }


