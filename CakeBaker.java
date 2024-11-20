package com.codingshuttle.twinkle.week1Intrduction.introductionToSpringBoot;

import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    final private Frosting frosting;
    final private Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    void bakeCake(){
        System.out.println(frosting.getFrostingType());
        System.out.println(syrup.getSyrupType());
        System.out.println("baking a cake");
    }
}
