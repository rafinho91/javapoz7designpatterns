package com.sda.adapter;

public class Application {
    public static void main(String[] args) {
        UserFileAdapter userFileAdapter = new UserFileAdapter("C:\\sda\\javapoz7designpatterns\\src\\main\\resources\\users.txt");
        UserProgram userProgram = new UserProgram(userFileAdapter);
        userProgram.listOfUsers();
    }
}
