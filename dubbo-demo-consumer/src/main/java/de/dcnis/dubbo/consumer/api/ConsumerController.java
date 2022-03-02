package de.dcnis.dubbo.consumer.api;

import de.dcnis.dubbo.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:20880")
    private DemoService dubboService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return dubboService.sayHello(name);
    }

}
