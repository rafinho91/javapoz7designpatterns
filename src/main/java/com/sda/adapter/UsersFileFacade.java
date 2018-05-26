package com.sda.adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersFileFacade {

    private String path;

    public UsersFileFacade(String path) {
        this.path = path;
    }

    public List<UserDto> getAll(){
        List<UserDto> users = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while (scanner.hasNextLine()){
                String value = scanner.nextLine();
                String[] splitValue = value.split(",");
                UserDto user = new UserDto();
                user.setFirstName(splitValue[0]);
                user.setLastName(splitValue[1]);
                user.setPhoneNumber(splitValue[2]);
                user.setCity(splitValue[3]);
                user.setStreet(splitValue[4]);
                user.setFlatNumber(Integer.parseInt(splitValue[5]));
                users.add(user);
            }
        } catch (FileNotFoundException e) {
            System.out.println("WARN: FILE NOT FOUND");
        }
        return  users;
    }
}
