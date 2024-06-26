package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

public class User {
    private final String username;
    private final String password;
    private String authToken = null;

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }



    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAuthToken() {
        return authToken;
    }

   //TODO: since token can potentially expire, would want to renew it ? may not be necessary
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
