package com.schedule.bean;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleBean {
	@Scheduled(fixedRate=2000)
	public void task() {
		System.out.println("*****************Scheduled task*******************");
	}

}
