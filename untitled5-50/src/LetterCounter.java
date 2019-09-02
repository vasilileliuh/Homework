 class LetterCounter {
     int countUppercaseLetters(String a){
        int upperCase = 0;
        for (int i = 0; i < a.length(); i++){
            if(Character.isUpperCase(a.charAt(i)))
                upperCase++;
        }
        return upperCase;
    }

}
