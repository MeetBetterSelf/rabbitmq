package com.miaoji.rabbitmq.mq.producer;

import com.miaoji.rabbitmq.config.RabbitmqConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 类功能描述：
 *
 * @author：喵吉爱科技
 * @createTime：2019/8/6 15:40
 */
@Component
public class MessageSend {
    private static final Logger logger = LoggerFactory.getLogger(MessageSend.class);
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String msg) {
        logger.info("向exchange=" + RabbitmqConfig.EXCHANGE + ",rountingkey = " + RabbitmqConfig.ROUNTINGKEY + "，发送消息：" + msg);
        rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE, RabbitmqConfig.ROUNTINGKEY, msg);
    }
}
