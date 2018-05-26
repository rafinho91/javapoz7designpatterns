package com.sda.adapter;

import java.util.List;
import java.util.stream.Collectors;

public class AdressFileAdapter implements AdressAdapter{

    private UsersFileFacade usersFileFacade;

    public AdressFileAdapter(UsersFileFacade usersFileFacade) {
        this.usersFileFacade = usersFileFacade;
    }

    @Override
    public List<Adress> getAll() {
        List<UserDto> users = usersFileFacade.getAll();
        return users.stream()
                .map(user -> new Adress(user.getCity(), user.getStreet(), user.getFlatNumber()))
                .collect(Collectors.toList());
    }
}
