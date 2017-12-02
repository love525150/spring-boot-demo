package org.allen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by Dick on 2017/4/22.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

    }
}
