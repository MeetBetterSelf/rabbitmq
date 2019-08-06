package com.miaoji.rabbitmq.service;

/**
 * 类功能描述：
 *
 * @author：喵吉爱科技
 * @createTime：2019/8/6 16:02
 */
public interface IMessageService {

    /**
     *  发送队列消息
     * @param msg
     */
    void sendMessage(String msg);
}
