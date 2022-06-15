package com.pluralsight.springaop.flightsmanagement.flyer;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

// To be used to advise objects programmatically
//public class FlyerImpl extends DelegatingIntroductionInterceptor implements Flyer {
public class FlyerImpl implements Flyer {

    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }

}
