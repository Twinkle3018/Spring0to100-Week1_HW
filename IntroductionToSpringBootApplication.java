package com.codingshuttle.twinkle.week1Intrduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

//	@Autowired
//	Apple apple1;
//
//	@Autowired
//	Apple apple2;

//	@Autowired
//	DBService dbService;

	@Autowired
	CakeBaker cakebaker;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		cakebaker.bakeCake();
		//System.out.println(dbService.getData());
		//apple1.eatApple();
		//apple2.eatApple();
		//System.out.println(apple1.hashCode());
		//System.out.println(apple2.hashCode());
	}
}
