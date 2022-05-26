package com.github.systemdesign;

import com.github.systemdesign.service.LogInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppRunner implements CommandLineRunner {
    private final LogInterface logInterface;

    public AppRunner(LogInterface logInterface) {
        this.logInterface = logInterface;
    }

    @Override
    public void run(String... args) throws Exception {
        logInterface.hit(1);
        logInterface.hit(2);
        logInterface.hit(3);
        log.info("Count : {}", logInterface.getCount(4));

        logInterface.hit(300);
        log.info("Count : {}", logInterface.getCount(300));

        log.info("Count : {}", logInterface.getCount(301));
    }
}
