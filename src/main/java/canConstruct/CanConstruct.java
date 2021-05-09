package canConstruct;

import java.util.HashMap;
import java.util.List;

public class CanConstruct {

    /**
     * Regular function checking if it is possible to create target word from elements of words list
     * @param target target word
     * @param words list of words
     * @return true when it is possible to create target from bits of words, else false
     */
    public boolean canConstruct(String target, List<String> words){
        if(target.isEmpty()) return true;
        for(String word : words){
            if(!target.startsWith(word)) continue;
            if(canConstruct(target.replaceFirst(word, ""), words)) return true;
        }
        return false;
    }

    /**
     * Wrapper function that passes empty HashMap to memoized function
     * @param target target word
     * @param words list of words
     * @return true when it is possible to create target from bits of words, else false
     */
    public boolean canConstructMemo(String target, List<String> words){
        return canConstructMemo(target, words, new HashMap<>());
    }

    /**
     * Memoized function checking if it is possible to create target word from elements of words list
     * @param target target target word
     * @param words words list of words
     * @param memo passed by wrapper
     * @return true when it is possible to create target from bits of words, else false
     */
    private boolean canConstructMemo(String target, List<String> words, HashMap<String, Boolean> memo){
        if(memo.containsKey(target)) return memo.get(target);
        if(target.isEmpty()) return true;
        for(String word : words){
            if(!target.startsWith(word)) continue;
            if(canConstructMemo(target.replaceFirst(word, ""), words, memo)){
                memo.put(target, true);
                return true;
            }
        }
        memo.put(target, false);
        return false;
    }
}
