package com.naprawnikbfr.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In constructor: BaseballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min in batting practice";
    }
}
