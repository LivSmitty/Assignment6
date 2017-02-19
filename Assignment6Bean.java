/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livsmitty.com;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.ejb.Stateless;


@ManagedBean(value = "Assignment6Bean")
@Stateless
public class Assignment6Bean implements Serializable{

    String username;
    String password;

    public Assignment6Bean() {
        //default constructor
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
    
}
