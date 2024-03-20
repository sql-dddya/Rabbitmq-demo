package cn.itcast.publish;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    // 第一种：基础模式
    @Test
    public void pulishSimpleModeTest(){
        String queueName = "simple.queue";
        String message = "what a beautiful day!!!!!";
        rabbitTemplate.convertAndSend(queueName, message);
    }

}
