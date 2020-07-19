package com.park.controller;

import com.park.entity.Admin;
import com.park.service.AdminService;
import com.park.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private AdminService as;

    @RequestMapping("/admin/list")
    public List<Admin> selectAllAdmin(){
        return as.list(null);
    }

}
