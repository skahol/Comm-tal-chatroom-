package com.kahol;

public class Alumni {
    String uname;
    String gender;
    String email;
    String pwd;
    String batch;

    public String getUname() {
        return uname;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public String getBatch() {
        return batch;
    }

    public String toString(){
        return ("\nAlumini-name :"+getUname()+"; Gender :"+getGender()+"; Email :"+getEmail()+"; Password :"+getPwd()+"; Batch :"+getBatch()+"\n");
    }
}
