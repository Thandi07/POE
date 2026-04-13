/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thand
 */
import java.util.Scanner;
public class Login {
 
      private String username;
    private String password;
    private String cellphonenumber;

    public Login(String username, String password, String cellphonenumber) {
        this.username = username;
        this.password = password;
        this.cellphonenumber = cellphonenumber;
    }

    public boolean authenticate(Scanner input) {
        System.out.println("\n-------Login--------");
        System.out.print("Enter your username: ");
        String loginUsername = input.nextLine();
        System.out.print("Enter your password: ");
        String loginPassword = input.nextLine();
        System.out.print("Enter your cellphone number: ");
        String loginCellphonenumber = input.nextLine();

        if (loginUsername.equals(username) && loginPassword.equals(password) && loginCellphonenumber.equals(cellphonenumber)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username, password, or cellphone number. Please try again.");
            return false;
        }
    }
}  

