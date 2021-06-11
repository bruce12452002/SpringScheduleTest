package bruce.home.ScheduleTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@SpringBootApplication
@EnableScheduling
public class ScheduleTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScheduleTestApplication.class, args);
    }

    @Bean
    public TaskScheduler taskScheduler() {
        var taskExecutor = new ThreadPoolTaskScheduler();
        taskExecutor.setPoolSize(2);
        return taskExecutor;
    }
}
