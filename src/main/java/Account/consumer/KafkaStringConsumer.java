package Account.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaStringConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaStringConsumer.class);

    @KafkaListener(topics = "bootcoin" , containerFactory = "kafkaListenerContainerFactory", groupId = "group_id")
    public void consume(@Payload String account) throws Exception{
        logger.info("Prueba "+ Thread.currentThread().getId());
        logger.info("Mensaje recibido: "+ account);
    }

}