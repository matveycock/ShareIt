package ru.matveycock.ShareIt.kafka;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic test(){
        return new NewTopic("jopa", 1, (short) 1);
    }
}
