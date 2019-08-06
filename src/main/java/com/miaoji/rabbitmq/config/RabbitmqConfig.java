package com.miaoji.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类功能描述：
 *
 * @author：喵吉爱科技
 * @createTime：2019/8/6 15:48
 */
@Configuration
public class RabbitmqConfig {
    // 设置交换空间、路由key、队列名称
    public static final String EXCHANGE = "com.miaoji.exchange";
    public static final String ROUNTINGKEY = "com.miaoji.rountingkey";
    public static final String QUEUE_NAME = "com.miaoji.queue";

    @Bean
    public Binding bindExchangeQueue(DirectExchange exchange, Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUNTINGKEY);
    }

    /**
     *  直连模式，持久化并自动删除
     * @return
     */
    @Bean
    public DirectExchange getDirectExchange() {
        return new DirectExchange(EXCHANGE, true, true);
    }

    /**
     *  队列信息
     * @return
     */
    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }


}
