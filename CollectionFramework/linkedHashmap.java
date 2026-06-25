
package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashmap {

    public static void main (String[] args){
        
        String Str = "Trust me I am an Engineer";

        Map<Character , Integer> map = new LinkedHashMap<>();
        for (char ch : Str.toCharArray())
            {
                if(ch !=' '){

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        }

        for(char keys : map.keySet()){
            System.out.println(keys + " "+ map.get(keys));
            System.out.println();
        }
    }
    
}
