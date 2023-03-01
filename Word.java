public class Word {
    public static void main(String[] args) {
        
        String s = "Umbrella";
        boolean isInString = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e'){
                isInString=true;
                break;
            }
        }
        System.out.println(isInString);
    }
}
