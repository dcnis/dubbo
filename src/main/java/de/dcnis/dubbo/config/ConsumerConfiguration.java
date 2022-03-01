package de.dcnis.dubbo.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "de.dcnis.dubbo.consumer")
@PropertySource("classpath:/dubbo/consumer.properties")
@ComponentScan(value = "de.dcnis.dubbo.consumer")
public class ConsumerConfiguration {
}
