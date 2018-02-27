/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Entitiy.LoginUserInfo;
import static java.util.Collections.list;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Casper
 */
@ManagedBean(name="viewController")
@SessionScoped
public class ViewController {
    
    public String view(LoginUserInfo user)
    {
        String result = "";
        try{
                LinkedList<String> permNames = new LinkedList<String>();
                LinkedList<String> permLink = new LinkedList<String>();
             while(user.UserPerms.next())
            {
                permNames.add(user.UserPerms.getString("PermName"));
                permLink.add(user.UserPerms.getString("PermLink"));
            }
             
             for(int i = 0; i< permNames.size(); i++)
             {
                 result+="<br> <h:link value='" +permNames.get(i) + "' outcome='" + permLink.get(i) +"' /> </br>" ;
             }
              System.out.println(result);
        }     
        catch(Exception ex)
        {
           ex.printStackTrace();
        }
        return result;
    }
}
