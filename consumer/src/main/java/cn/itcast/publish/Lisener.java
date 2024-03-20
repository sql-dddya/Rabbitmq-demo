package cn.itcast.publish;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Lisener {

    @RabbitListener(queues = "simple.queue")
    public void handleMess(String msg){
        System.out.println("接收到的消息是 msg: " + msg);
    }
}
