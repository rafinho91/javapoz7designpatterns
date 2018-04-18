package com.sda.adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserFileAdapter implements UserAdapter{

    private String path;

    public UserFileAdapter(String path) {
        this.path = path;
    }

    public List<User> readAll(){
        List<User> users = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while (scanner.hasNextLine()){
                String value = scanner.nextLine();
                String[] splitValue = value.split(",");
                User user = new User();
                user.setFirstName(splitValue[0]);
                user.setLastName(splitValue[1]);
                user.setPhoneNumber(splitValue[2]);
                users.add(user);
            }
        } catch (FileNotFoundException e) {
            System.out.println("WARN: FILE NOT FOUND");
        }
        return  users;
    }
}
