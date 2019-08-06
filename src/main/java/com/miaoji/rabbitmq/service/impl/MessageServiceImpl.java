package com.miaoji.rabbitmq.service.impl;

import com.miaoji.rabbitmq.mq.producer.MessageSend;
import com.miaoji.rabbitmq.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类功能描述：
 *
 * @author：喵吉爱科技
 * @createTime：2019/8/6 16:03
 */
@Service
public class MessageServiceImpl implements IMessageService {

    @Autowired
    private MessageSend messageSend;

    @Override
    public void sendMessage(String msg) {
        messageSend.sendMessage(msg);
    }
}
