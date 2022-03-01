package de.dcnis.dubbo.consumer;

import de.dcnis.dubbo.services.DubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component("dubboConsumer")
public class DubboConsumer {

    @DubboReference
    private DubboService dubboService;

    public String doSayHello(String name){
        return dubboService.sayHello(name);
    }
}
