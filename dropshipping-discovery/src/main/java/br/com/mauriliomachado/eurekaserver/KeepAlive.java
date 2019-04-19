package br.com.mauriliomachado.eurekaserver;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

@Component
public class KeepAlive {


    @Scheduled(cron = "0 * * * * ?")
    public void keepAlive() throws IOException {
        URL url = new URL("https://dropshipping-balancer.herokuapp.com/api/greeting");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
    }
}
