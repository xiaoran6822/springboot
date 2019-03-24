package com.xqh.purespringboot.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 上午10:20 2019/3/22
 * @ModifiedBy:
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class SessionConfig {
}
