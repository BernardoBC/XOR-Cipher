/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cifrado;

import java.util.Random;

/**
 *
 * @author Bernardo Bonilla
 */
public class cifradoxor {
    
    public cifradoxor(){}
    
    public static String Encrypt(String Msg){
        if(Msg.length()==0){
            return "";
        }
        Random r = new Random();
        char Key = (char)(r.nextInt(26) + 'a');
        String txt = "";
        int xor;
        char temp;
        for (int i = 0; i < Msg.length(); i++) {
            xor = Msg.charAt(i) ^ Key;
            temp = (char)xor;
            txt = txt + (int)temp + " ";
        }
        return txt+(int)Key;
    }
    public static String Decrypt(String txt){
        String[] symbols = txt.split(" ");
        String Msg= "";
        char Key = (char)(Integer.parseInt(symbols[symbols.length-1]));
        int xor;
        char temp;
        for (int i = 0; i < symbols.length; i++) {
            xor = (char)Integer.parseInt(symbols[i]) ^ Key;
            temp = (char)xor;
            Msg = Msg + temp;
        }
        return Msg;
    }
}
