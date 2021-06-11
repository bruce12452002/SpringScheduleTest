package bruce.home.ScheduleTest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

@Component
public class TestSchedule {
    private boolean flag = true;

    @Scheduled(cron = "0 52 23 * * ?")
    public void start() {
        while (flag) {
            System.out.println(LocalTime.now());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Scheduled(cron = "5 52 23 * * ?")
    public void stop() {
        System.out.println("stop");
        flag = false;
    }
}
