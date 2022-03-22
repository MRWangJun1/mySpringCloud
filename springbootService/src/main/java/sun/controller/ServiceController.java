package sun.controller;

import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.entity.ServiceInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : wangjun
 * @date : 2022/3/11  16:46
 */
@RestController
@RequestMapping(value = "service")
public class ServiceController {
    @RequestMapping(value = "hello")
    public void login(HttpServletRequest request, HttpServletResponse response, @RequestBody ServiceInfo serviceInfo) {
        RestfulResult restfulResult = new RestfulResult();
        try {
            restfulResult.setData("Service1:Welcome " + serviceInfo.getName() + "!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        CommUtils.printDataJason(response, restfulResult);
    }


    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo) {
        return "Service1:Welcome " + serviceInfo.getName() + " !";
    }


}
