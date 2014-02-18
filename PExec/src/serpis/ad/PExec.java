/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serpis.ad;

/**
 *
 * @author Pablo
 */
public class PExec {
    
    public static void main (String [] args){
        
        try 
        { 
            
           Process p = Runtime.getRuntime().exec ("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
           System.out.println("Ejecutando Chrome");
        } 
        catch (Exception e) 
        { 
           System.out.println("Programa no ejecutable"); 
        }

     }
    
}
