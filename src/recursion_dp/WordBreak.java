package recursion_dp;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {
    public static void main(String[] args) {
        new WordBreak().wordbreak("cats",List.of("cats","dogs"));
    }

    public boolean wordbreak(String s, List<String> wordDict){
        Map<String,Boolean> map= new HashMap<>();
        if (wordDict.contains(s))
            return  true;
        if (map.containsKey(s)){
            return map.get(s);
        }
        for (int i=1; i<= s.length();i++){
            String left = s.substring(0,i);
            if (wordDict.contains(left)&& wordbreak(s.substring(i),wordDict)) {
                map.put(s, true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }
}
