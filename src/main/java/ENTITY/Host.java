package entity;

import interfaces.Connection;

public class Host implements Connection {
    private String url;
    private String username;
    private String pass;

    public Host(String url, String username, String pass) {
        this.url = url;
        this.username = username;
        this.pass = pass;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public void setPass(String pass) {

        this.pass = pass;
    }

    public String getUrl() {

        return url;
    }

    public String getUsername() {

        return username;
    }

    public String getPass() {

        return pass;
    }

    @Override
    public void connect() {

    }
}
