package com.mmc.rest.RESTAppDemo;


import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/hello")
    public HelloMessage helloFromServer(@RequestParam(value = "name", defaultValue = "Nieznajomy") String name, @RequestHeader("User-Agent") String method){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new HelloMessage("Hello from server, " + name + " with method: " + method);
    }

}
