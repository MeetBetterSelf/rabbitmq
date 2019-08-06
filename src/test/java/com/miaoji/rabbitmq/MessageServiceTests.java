package com.miaoji.rabbitmq;

import com.miaoji.rabbitmq.service.IMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * 类功能描述：
 * 测试类
 * @author：喵吉爱科技
 * @createTime：2019/8/6 16:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceTests {
    @Autowired
    private IMessageService messageService;

    @Test
    public void testSendMessage() throws Exception{
        for (int i = 0; i < 10; i++) {
            messageService.sendMessage("msg - " + i);
        }
        TimeUnit.SECONDS.sleep(12);
    }
}
