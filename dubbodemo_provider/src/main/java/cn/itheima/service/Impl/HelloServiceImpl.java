package cn.itheima.service.Impl;

import cn.itheima.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return  "hello"+name;
    }
}
