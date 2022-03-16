import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String text = "Ой, девочки, вы упали";
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!map.containsKey(chars[i])){
                map.put(chars[i],1);
            }else{
                map.put(chars[i],map.get(chars[i])+1);
            }

        }
        System.out.println(map.toString());


    }
}
