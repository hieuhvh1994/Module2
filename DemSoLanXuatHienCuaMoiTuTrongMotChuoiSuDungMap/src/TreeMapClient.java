import java.util.TreeMap;

public class TreeMapClient {

    public static final char SPACE =' ';

    public static void main(String[] args) {


        String str = "Co Sach Dep Mai Duoc Khong Khong Dep Co ?";


        TreeMap<String, Integer> wordMap = countWord(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }


    }

    public static TreeMap<String, Integer> countWord(String input) {
        TreeMap<String, Integer> wordMap = new TreeMap<String, Integer>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) != SPACE) {
                sb.append(input.charAt(i));
            } else {
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }

        addWord(wordMap, sb);
        return wordMap;

    }

    public static void addWord(TreeMap<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word,count);

        } else {
            wordMap.put(word, 1);
        }
    }




}
