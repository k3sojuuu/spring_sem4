package com.example.be.service;


import com.example.be.entity.Users;
import com.example.be.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    // Lấy tất cả người dùng
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    // Lấy người dùng theo ID
    public Optional<Users> getUserById(Long id) {
        return usersRepository.findById(id);
    }

    // Tạo mới người dùng
    public Users createUser(Users user) {
        return usersRepository.save(user);
    }

    // Cập nhật người dùng
    public Users updateUser(Long id, Users user) {
        user.setId(id);
        return usersRepository.save(user);
    }

    // Xóa người dùng
    public void deleteUser(Long id) {
        usersRepository.deleteById(id);
    }
}