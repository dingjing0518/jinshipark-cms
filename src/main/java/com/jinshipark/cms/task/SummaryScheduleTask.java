package com.jinshipark.cms.task;

import com.jinshipark.cms.service.SummaryScheduleTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SummaryScheduleTask {
    @Autowired
    private SummaryScheduleTaskService summaryScheduleTaskService;

//    @Scheduled(cron = "0 0/1 * * * ?")//每分钟
    @Scheduled(cron = "0 0 1 * * ?")//每天凌晨1点
    private void summaryTask() {
        summaryScheduleTaskService.summaryTask();
    }
}
