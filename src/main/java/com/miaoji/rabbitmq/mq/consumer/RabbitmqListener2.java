package com.miaoji.rabbitmq.mq.consumer;

import com.miaoji.rabbitmq.config.RabbitmqConfig;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 类功能描述：
 * 消息监听类
 * @author：喵吉爱科技
 * @createTime：2019/8/6 15:58
 */
//@Component
public class RabbitmqListener2 {

    /**
     *  接收消息的方法
     * @param msg
     */
    @RabbitListener(queues = RabbitmqConfig.QUEUE_NAME)
    public void receiveMessage(String msg, Message message, Channel channel) throws Exception{
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("*** 接收的消息2 *** " + msg);

        } catch (Exception e) {
            e.printStackTrace();
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
        }
    }
}
