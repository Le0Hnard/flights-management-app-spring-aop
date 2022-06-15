package com.pluralsight.springaop.flightsmanagement.introduction;

import com.pluralsight.springaop.flightsmanagement.domain.Flight;
import com.pluralsight.springaop.flightsmanagement.flyer.Flyer;
//import com.pluralsight.springaop.flightsmanagement.flyer.FlyerAdvisor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = com.pluralsight.springaop.flightsmanagement.config.Config.class)
public class FlyerTest {

    @Autowired
    private Flight flight;

    @Test
    public void FlyerTest() {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("flightsmanagement/aop.xml");
//
//        Flight flight = (Flight) context.getBean("flight");
//        FlyerAdvisor flyerAdvisor = new FlyerAdvisor();
//        ProxyFactory proxyFactory = new ProxyFactory();
//        proxyFactory.setTarget(flight);
//        proxyFactory.addAdvisor(flyerAdvisor);
//        proxyFactory.setOptimize(true);
//
//        Flight proxyFlight = (Flight) proxyFactory.getProxy();
//        assertTrue(proxyFlight instanceof Flight);
//        System.out.println(proxyFlight.getId());
//        System.out.println(proxyFlight.getCompany());
//
//        assertTrue(proxyFlight instanceof Flyer);
//        ((Flyer)proxyFlight).takeOff();
//        ((Flyer)proxyFlight).fly();
//        ((Flyer)proxyFlight).land();
//
//        System.out.println(proxyFlight.getClass().getName());
//
//        context.close();

        assertTrue(flight instanceof Flight);
        System.out.println(flight.getId());
        System.out.println(flight.getCompany());

        assertTrue(flight instanceof Flyer);
        ((Flyer)flight).takeOff();
        ((Flyer)flight).fly();
        ((Flyer)flight).land();
        System.out.println(flight.getClass().getName());
    }

}
