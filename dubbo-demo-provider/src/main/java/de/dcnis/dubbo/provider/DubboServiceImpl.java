package de.dcnis.dubbo.provider;

import de.dcnis.dubbo.DubboService;

public class DubboServiceImpl implements DubboService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
