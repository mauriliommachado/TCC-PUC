package br.com.mauriliomachado.zuulserver;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class KeepAlive {

    @Scheduled(cron = "0 0/30 * * * ?")
    public void sendDailySms() {
        System.out.println("--------------- KEEP ALIVE ---------------\n");

    }
}
