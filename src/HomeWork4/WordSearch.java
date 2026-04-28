package HomeWork4;

public class WordSearch {
    public static void main(String[] args){
        String Text="They brought a lot of things. Mummy pig first put sunscreen on   peppa and George, and then peppa and George began to play. Play catch the   ball first, then put on the life-saving bag, swim at the seaside and spray   water on each other.";
        StringBuilder word = new StringBuilder();
        for(int i =0;i<Text.length();i++){
            char c=Text.charAt(i);
            if ((c>='a'&&c<='z' ||c>='A' && c<='Z')){
                  word.append(c);          //append就是用来一个一个内容往上加着写的,append("H"}append("HE"} ...
            }else{
                if (word.length() > 0){
                    System.out.println(word);
                    word.setLength(0);   //清空word
                }
            }
        }
        if (word.length()>0){
            System.out.println(word);
        }
    }
}
