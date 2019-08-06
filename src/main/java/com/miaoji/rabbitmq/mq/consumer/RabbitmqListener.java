package com.miaoji.rabbitmq.mq.consumer;

import com.miaoji.rabbitmq.config.RabbitmqConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 类功能描述：
 * 消息监听类
 * @author：喵吉爱科技
 * @createTime：2019/8/6 15:58
 */
@Component
public class RabbitmqListener {

    /**
     *  接收消息的方法
     * @param msg
     */
    @RabbitListener(queues = RabbitmqConfig.QUEUE_NAME)
    public void receiveMessage(String msg) throws Exception{
        System.out.println("*** 接收的消息 *** " + msg);

    }
}
