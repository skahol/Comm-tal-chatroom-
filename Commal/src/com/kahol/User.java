package com.kahol;

public class User {
    String uName;
    String gender;
    String mNo;
    String UId;
    String email;
    String pwd;
    public String getuName() {
        return uName;
    }

    public String getGender() {
        return gender;
    }

    public String getmNo() {
        return mNo;
    }

    public String getUId() {
        return UId;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public String toString() {
         return "\nUser name :"+getuName()+"; Gender :"+getGender()+"; Mobile :"+getmNo()+"; Univ. ID :"+getUId()+"; Email :"+getEmail()+"; Password :"+getPwd()+"\n" ;
    }
}

