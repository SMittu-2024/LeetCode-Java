/** Find First Non-Repeating Character in a String
*E.g. String str = "swiss";
*Output should be: First Non-Repeating Character in a String is: w
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "swiss";
        char[] arr = str.toCharArray();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.print("First Non-Repeating Character in a String is: ");
        Set<Character> keys = map.keySet();
        for(Character key: keys){
            if(map.get(key)==1){
                System.out.print(key);
                break;
            }
        }
    }
}
