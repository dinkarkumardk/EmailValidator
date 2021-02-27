package com.dinkar.email_validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {
    static EmailValidate emailValidate;

    private EmailValidate() {
    }

    public static EmailValidate getInstance() {
        if (emailValidate != null)
            return emailValidate;
        else {
            return new EmailValidate();
        }
    }

    public boolean isValid(String email) {
        Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        Matcher regMatcher = regexPattern.matcher(email);
        return regMatcher.matches();
    }
}
