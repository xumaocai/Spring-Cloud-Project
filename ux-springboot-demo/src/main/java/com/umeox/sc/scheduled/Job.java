package com.umeox.sc.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Job {

	//秒 分 时 日 月 年
	@Scheduled(cron="0/5 * * * * ?")
	public void execute(){
		System.out.println("我执行job...");
	}
}
