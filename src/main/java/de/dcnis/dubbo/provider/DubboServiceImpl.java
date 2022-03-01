package de.dcnis.dubbo.provider;

import de.dcnis.dubbo.services.DubboService;

@org.apache.dubbo.config.annotation.DubboService
public class DubboServiceImpl implements DubboService {

    @Override
    public String sayHello(String name){
        return "Hello " + name;
    }
}
