package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<User,UserDetail> users = new HashMap<User, UserDetail>();
        User u1=new User();
        UserDetail d1=new UserDetail();
        User u2=new User();
        UserDetail d2=new UserDetail();
        User u3=new User();
        UserDetail d3=new UserDetail();

        u1.name="Ibrahim";
        u1.surName="Bayramli";
        d1.mailAddress="ibrahim@ibrahim.com";
        d1.phoneNumber="123456789";
        d1.address="Kocaeli";
        d1.password="4321";

        u2.name="Bora";
        u2.surName="Bayramli";
        d2.mailAddress="bora@bora.com";
        d2.phoneNumber="111111111";
        d2.address="Istanbul";
        d2.password="0000";

        u3.name="Tolga";
        u3.surName="Bayramli";
        d3.mailAddress="tolga@tolga.com";
        d3.phoneNumber="44444444";
        d3.address="Sakarya";
        d3.password="1111";

        users.put(u1,d1);
        users.put(u2,d2);
        users.put(u3,d3);

        User u4 = new User();
        u4.name="Bora";
        u4.surName="Bayramli";

        String result=users.get(u4).password;
        System.out.println(result);

    }
}
