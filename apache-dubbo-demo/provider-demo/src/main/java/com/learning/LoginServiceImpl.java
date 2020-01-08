package com.learning;

public class LoginServiceImpl implements LoginService {

    @Override
    public String login(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}
