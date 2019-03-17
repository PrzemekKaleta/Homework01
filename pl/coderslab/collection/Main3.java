package pl.coderslab.collection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
    static boolean verifyLogin(String email){

        Pattern pattern = Pattern.compile("^[a-zA-Z-_][\\w-]{4,}");
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
