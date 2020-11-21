package cn.targetpath.activi7_workflow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/21 11:34
 */
@RestController
public class HelloController {


    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "Activi7欢迎你!";
    }
}
