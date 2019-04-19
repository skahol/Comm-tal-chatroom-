package com.kahol;

public class Admin {
    String email;
    String pwd;

    public void setAdminEmail(String adminName) {
        this.email = adminName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAdminEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public String toString(){
        return ("Admin email :"+email+"\n");
    }
}
