package com.company;

import java.util.HashMap;

public class IDandPasswords {
  static    HashMap<String,String> logininfo=new HashMap<String,String>();
    IDandPasswords (){
        logininfo.put("Hello","world");
        logininfo.put("Weekend","day");
        logininfo.put("good","night");
        logininfo.put("professor","student");
    }

    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
}
