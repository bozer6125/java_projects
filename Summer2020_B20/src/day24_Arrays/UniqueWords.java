package day24_Arrays;

public class UniqueWords {

    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++", "Ruby"};
for(int i=0; i<=words.length-1;i++){
    String s=words[i];
    int count=0;

    for(int j= 0;j<=words.length-1;j++){
        String each=words[j];
        if(s.equals(each)){
            count++;
        } }
        if(count==1){
            System.out.print(s+" ");

    }
}

    }
        }