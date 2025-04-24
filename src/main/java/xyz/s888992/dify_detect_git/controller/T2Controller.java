package xyz.s888992.dify_detect_git.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.s888992.dify_detect_git.service.T2Service;

@RequestMapping("/t2")
@RestController
public class T2Controller {
    @Resource
    private T2Service t2Service;
    @GetMapping("/r1")
    public int r1(){
        return t2Service.say();
    }
}
