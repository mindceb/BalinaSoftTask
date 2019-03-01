package com.balinasoft.test_task.model;

import com.google.gson.annotations.SerializedName;

public class RegistrationBody {
    @SerializedName("login")
    private String login;
    @SerializedName("password")
    private String password;

    public RegistrationBody(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public RegistrationBody() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

