package de.dcnis.dubbo;

import de.dcnis.dubbo.config.ConsumerConfiguration;
import de.dcnis.dubbo.config.ProviderConfiguration;
import de.dcnis.dubbo.consumer.DubboConsumer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class MulticastRegistryTest {

    @BeforeEach
    public void initRemote(){
        AnnotationConfigApplicationContext remoteContext = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        remoteContext.start();
    }

    @Test
    public void consumer_should_get_response(){
        // GIVEN
        AnnotationConfigApplicationContext consumerContext = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        consumerContext.start();

        // WHEN
        DubboConsumer dubboConsumer = (DubboConsumer) consumerContext.getBean("dubboConsumer");
        String msg = dubboConsumer.doSayHello("Dennis");

        // THEN
        assertThat(msg).isEqualTo("Hello Dennis");
    }

}
