package cn.lastlysly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-07-31 14:38
 **/
@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){
        return "测试，Hello World";
    }
}
