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

}
