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
        String CTxt = "";
        int xor;
        char temp;
        for (int i = 0; i < Msg.length(); i++) {
            xor = Msg.charAt(i) ^ Key;
            //xor=xor+32;
            temp = (char)xor;
            //System.out.println(xor+"    "+temp);
            CTxt = CTxt + (int)temp + " ";
        }
        return CTxt+(int)Key;
    }
    public static char getKey(String CTxt){
        String[] symbols = CTxt.split(" ");
        return (char)(Integer.parseInt(symbols[symbols.length-1]));
    }
    public static String Decrypt(String CTxt){
        String[] symbols = CTxt.split(" ");
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
