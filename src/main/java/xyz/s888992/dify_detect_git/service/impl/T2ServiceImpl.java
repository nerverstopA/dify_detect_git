package xyz.s888992.dify_detect_git.service.impl;

import org.springframework.stereotype.Service;
import xyz.s888992.dify_detect_git.service.T2Service;

@Service
public class T2ServiceImpl implements T2Service {
    @Override
    public int say() {
        int a =1,b=0;

        return a/0;
    }
}
