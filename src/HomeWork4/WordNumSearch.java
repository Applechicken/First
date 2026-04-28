package HomeWork4;

public class WordNumSearch {
    public static void main(String[] args){
        String Text="2020年,大连与沈阳的列车D7732/D7733 、G3725/G3728 等都暂停过，还有其他车次例如，“Z18”、“T126”、“K1313”、“L210”和1276等列车也暂停过。";
        StringBuilder word = new StringBuilder();
        for(int i =0;i<Text.length();i++){
            char c=Text.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '/'){
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
