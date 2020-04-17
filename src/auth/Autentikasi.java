/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author Eko Priyo Triasmoro
 */
public class Autentikasi {
    String username;
    char[] password;
    public void setUsername(String a){
      this.username = a;
    }
    
    public void setPassword(char[] a){
        this.password = a;
    }
    
    public void CekLogin(){
        String xusername = "admin";
        char[] xpassword = new char[] {'a', 'd', 'm', 'i', 'n'};

        if(xusername.equals(username)&& Arrays.equals(xpassword, password) ){
            JOptionPane.showConfirmDialog(null, "Isian Benar","Informasi",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showConfirmDialog(null, "Isian Salah","Informasi",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
}
