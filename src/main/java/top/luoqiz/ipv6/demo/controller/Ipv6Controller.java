package top.luoqiz.ipv6.demo.controller;

import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: Ipv6Controller</p>
 *
 * @author luoqiz
 * @version 1.0
 * @description TODO
 * @date 2021/2/20 10:05
 * @since 1.0
 */
@RestController
@RequestMapping
public class Ipv6Controller {

    @GetMapping("/")
    public String test1() {
        return "this is ipv6 test api";
    }

    @GetMapping("/{param}")
    public String test1(@PathVariable String param) {
        return String.format("custom param: %s", param);
    }
}
