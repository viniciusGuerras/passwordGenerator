package passgen;

import java.util.Random;

public class PassGenerator{

    public static String passGen(int size){
        //use simbol list and ASCII codes to generate a password
        String specialChars     = "~`!@#$%^&*()_-+={[}]|:;\"'<,>.?/";
        StringBuilder password =                  new StringBuilder();
        char extra_char         =                                        0;
    
        for(int i = 0; i < size; i++){
            int random_choice = (char)randint(0, 3);
            if(random_choice == 0){
                extra_char = (char)randint(48, 57);
            }
            else if(random_choice == 1){
               extra_char = (char)randint(64, 90);
            }
            else if(random_choice == 2){
                extra_char = (char)randint(97, 122);
            }
            else{
                int randomIndex = randint(0, specialChars.length() - 1);
                extra_char = specialChars.charAt(randomIndex);
            }
            password.append(extra_char);
        }
        return password.toString();
    }

    //pseudo randomly returns an integer
    public static int randint(int min, int max){
        Random rand = new Random();
        int randNum = rand.nextInt((max - min) + 1) + min;
        return randNum;
    }
    
}
