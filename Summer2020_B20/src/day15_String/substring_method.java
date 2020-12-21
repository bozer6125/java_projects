package day15_String;


public class substring_method {
    public static void main(String[] args) {


        String sentence = "Java is fun";
//                0123456789...

        //substring method
        String word1 = sentence.substring(0, 4);
        System.out.println(word1);


        String word2=sentence.substring(8,11);
        System.out.println(word2);


        System.out.println("=======================");

        String sentence2="I like Movies and TV Series";
        String word3 =sentence2.substring(7,13);
        System.out.println(word3);


        System.out.println("====================");
        String firstName="MUHTAR";
        String firstCharacter=firstName.substring(0,1);
        System.out.println(firstCharacter);
        String rest= firstName.substring(1,6);
        System.out.println(rest);
        firstName= firstCharacter.toUpperCase()+rest.toLowerCase();
        System.out.println(firstName);
    }
}
