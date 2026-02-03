
import java.util.*;

class Solution{
    public static int romanToNum(String s){
        int res = 0;
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for(int i = 0; i<s.length();i++){
            if(roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))){
               res-= roman.get(s.charAt(i));
            }else{
                res+= roman.get(s.charAt(i));
            }
        }
        res+= roman.get(s.charAt(s.length()-1));//for last character
      return res;
    }
}