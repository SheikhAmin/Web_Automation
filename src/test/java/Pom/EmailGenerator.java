package Pom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmailGenerator {
    List<String> emailList = new ArrayList<>();
    Random random = new Random();

    public String generateRandomEmail() {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder emailPrefix = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            emailPrefix.append(chars.charAt(random.nextInt(chars.length())));
        }

        String email = emailPrefix + "@example.com";
        emailList.add(email);
        return email;
    }

    public List<String> getEmailList() {
        return emailList;
    }

}

