package io.springboot.mytest.controller;

import io.springboot.mytest.Bean.MyTestBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${mytest.name}")
    private String myTestName;

    private  MyTestBean myTestBean;

    public  Controller (MyTestBean myTestBean) {
        this.myTestBean = myTestBean;
    }
    @GetMapping("/test")
    public String test() {
        System.out.println("Value of mytest.name: " + myTestName);
        myTestBean.testMethod();
        System.out.println("Value of server.port: " +myTestName );
        myTestBean.test1();
        return "Value printed in log and test method called.";
    }

}
