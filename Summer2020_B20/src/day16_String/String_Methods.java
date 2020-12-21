package day16_String;

public class String_Methods {
    public static void main(String[] args) {


        //replace
        String email="cybertek@gmail.com";
        email= email.replace("gmail","yahoo");
        System.out.println(email);

        String word="java";
        word=word.replace("a","e");
        System.out.println(word);

        String sentence="I like to learn Java, Java is cool, Java is fun";
                sentence=sentence.replace("a, Java","a, C#");
sentence=sentence.replace("Java ","Python ");

        System.out.println(sentence);

        String s1= "I like to stay in Cybertek, Cybertek is nice place";//MIT
            s1=s1.replace("Cybertek","MIT");
        System.out.println(s1);

        String s2="I like to leaRn Java";
        s2=s2.replace('R','r');
        System.out.println(s2);

        //replaceFirst(oldvalue,newvalu);


        String s3="I like to drink tea and tea";
        s3=s3.replaceFirst("tea","cola");
        System.out.println(s3);

        String s4="I like to watch Game of Thrones, and Walking Dead";
        s4=s4.replace(", and Walking Dead","" );
        System.out.println(s4);

        //indexOf();
        String s5="I like to stay in Cybertek, we are learning Java";
            int r1=s5.indexOf("r");
            int r2=s5.indexOf("re");//return first char r index
            int r3=s5.indexOf("rn");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println(s5.charAt(r1));
        //lastIndexOf()

        String s6="Java is a programmin language, and Java is fun";
        int I1=s6.indexOf("Java is fun");
        int I2=s6.lastIndexOf("J");

        System.out.println(I1);
        System.out.println(I2);






    }
}
