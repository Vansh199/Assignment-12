public class Consonants {
    public static void main(String[] args) {
        
        String s = "Hello,have a good day";
        char Consonant;
        char notConsonant;
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){
                Consonant=c[i];
            }
            else{
                notConsonant=c[i];
                System.out.print(notConsonant);
            }
        }
    }
}
