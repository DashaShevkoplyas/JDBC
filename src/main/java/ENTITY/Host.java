package ENTITY;

import interfaces.Connection;

public class Host implements Connection {
    private String URL;
    private String USERNAME;
    private String PASS;

    public Host(String URL, String USERNAME, String PASS){
        this.URL = URL;
        this.USERNAME =USERNAME;
        this.PASS = PASS;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public String getURL() {
        return URL;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASS() {
        return PASS;
    }

    @Override
    public void connect() {

    }
}
