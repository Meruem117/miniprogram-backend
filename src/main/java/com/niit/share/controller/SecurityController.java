package com.niit.share.controller;

import com.niit.share.base.response.BaseResponse;
import com.niit.share.utils.ResUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/security")
public class SecurityController {
    @Resource
    AuthenticationManager authenticationManager;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Security";
    }

    @PostMapping("/login")
    public BaseResponse<String> login(@RequestBody Map<String, String> params) {
        String username = params.get("username");
        String password = params.get("password");
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authentication = authenticationManager.authenticate(token);
        System.out.println(authentication.isAuthenticated());
        return ResUtils.success("success");
    }
}
