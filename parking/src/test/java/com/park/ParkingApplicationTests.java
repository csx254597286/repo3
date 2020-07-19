package com.park;

import com.park.entity.Admin;
import com.park.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ParkingApplicationTests {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    void contextLoads() {
        List<Admin> admins = adminMapper.selectList(null);
        admins.forEach(System.out::println);
    }

    @Test
    void test1(){
        Admin admin = new Admin();
        admin.setAdminName("王五")
                .setAdminPhone("123456789123")
                .setAdminPwd("123465");
        int insert = adminMapper.insert(admin);
        System.out.println(insert);
    }

}
