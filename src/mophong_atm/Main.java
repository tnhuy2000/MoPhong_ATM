/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mophong_atm;
import mophong_atm.SignIn;
//import mophong_atm.Sound_cdjv;
import mophong_atm.processData.Customer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author NhuongTT2
*/

/////////////////////////////
public class Main {
    static ArrayList<Customer> list;
    public static void main(String[] args) throws FileNotFoundException, IOException{
        SignIn dangNhap=new SignIn();
        dangNhap.setVisible(true);
    }

}
