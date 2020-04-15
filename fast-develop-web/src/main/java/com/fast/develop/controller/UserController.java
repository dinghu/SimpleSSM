package com.fast.develop.controller;

import com.fast.develop.pojo.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/login")
    public Result login() {
        System.out.println("11111");
        Result result = Result.OK();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name","dinghu");
        result.setData(hashMap);
        return result;
    }
}
