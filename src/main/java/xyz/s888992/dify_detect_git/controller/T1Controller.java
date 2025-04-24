package xyz.s888992.dify_detect_git.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.s888992.dify_detect_git.service.T1Service;

@RequestMapping("/t1")
@RestController
public class T1Controller {
    @Resource
    private T1Service t1Service;


    @GetMapping("/r1")
    public String r1(){
        return t1Service.jump();
    }
}
