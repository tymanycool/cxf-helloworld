package com.tianyao.demo;

import javax.jws.WebService;

@WebService
public interface TestService {
    String sayHello(String s);
}
