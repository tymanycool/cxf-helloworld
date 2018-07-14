package com.tianyao.demo;

public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String s) {
        return "tianyao:"+s;
    }
}
