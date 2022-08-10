package com.testemkdata.users.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.testemkdata.users.entity.Users;
import com.testemkdata.users.repository.UsersRepository;

@Component
public class UsersService {
	
	private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }
    
    public Users saveUser(Users users) {
    	return usersRepository.save(users);
    }

    public void delUser(Users users) {       
    	usersRepository.deleteById(users.id);
    }


}
