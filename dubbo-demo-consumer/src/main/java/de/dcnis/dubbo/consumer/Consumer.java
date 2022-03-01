package de.dcnis.dubbo.consumer;

import de.dcnis.dubbo.DubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DubboService demoService = (DubboService) context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("Dennis");
        // Display the call result
        System.out.println(hello);
    }

}
