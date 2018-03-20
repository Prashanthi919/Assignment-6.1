package com.example.prashu.assignment61;

public class Validation {

    public static boolean checkPassword(String password
    ){

        if(password == null){
            return false;
        }

        if(password.length()<6)
            return false;
        return true;


    }


    public static boolean checkUsername(String username)
        {
            if(username == null)
                return false;
            return true;
        }


}
