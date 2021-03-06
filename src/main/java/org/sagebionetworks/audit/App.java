package org.sagebionetworks.audit;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/database.xml");
        context.registerShutdownHook();

        ConcreteType concreteType = context.getBean(ConcreteType.class);
        concreteType.doWork();

        CertifiedUser certifiedUser = context.getBean(CertifiedUser.class);
        certifiedUser.doWork();

        context.close();
    }

}
