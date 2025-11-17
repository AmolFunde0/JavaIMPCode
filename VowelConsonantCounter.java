public class VowelConsonantCounter{
    public static void main(String args[]){
        String str = "Hello World";
        countVowelConsonant(str);
    }


public static void countVowelConsonant(String str){
    int vowel=0;
    int consonant=0;
    str = str.toLowerCase();
    for(char c : str.toCharArray()){
        if(c>='a'&&c<='z'){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel++;
            }else{
                consonant++;
            }
        }
    }

    System.out.println(vowel+" : Vowels");
    System.out.println(consonant+" : Consonant");
}

}