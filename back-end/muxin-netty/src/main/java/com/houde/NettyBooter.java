package com.houde;

import com.houde.netty.WSServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2019-02-06
 * Time: 23:00
 */
@Slf4j
@Component
public class NettyBooter implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("NettyBooter ...");
        if (event.getApplicationContext().getParent() == null) { //
            WSServer.getInstance().start();
        }
    }
}
