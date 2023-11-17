package com.devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.DateFormat;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerApplication.class, args);
	}

	/**
	 * fixedRate : process will execute at every 5 sec without previous method completion
	 * fixedDelay : process will execute after every prev. method completed ....
	 */

	@Scheduled(fixedDelay = 5000L)
	public void job(){

		Date date = new Date();
		DateFormat.getTimeInstance(DateFormat.LONG).format(date);

		System.out.printf("Simple example. For demonstration \n");
		System.out.printf("current time %s \n",DateFormat.getTimeInstance(DateFormat.LONG).format(date));

	}

}
