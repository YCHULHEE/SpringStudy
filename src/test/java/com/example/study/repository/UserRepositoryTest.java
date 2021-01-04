package com.example.study.repository;

import com.example.study.StudyApplication;
import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends StudyApplicationTests {
    // Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        // 쿼리문으로 입력
        User user = new User();
        user.setAccount("철희1");
        user.setEmail("ych357@nate.com");
        user.setPhoneNumber("010-6422-0470");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin1");

        User newUser = userRepository.save(user);
        System.out.println("newUser :" + newUser);

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }

}
