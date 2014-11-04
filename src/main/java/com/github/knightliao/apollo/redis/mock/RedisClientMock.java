package com.github.knightliao.apollo.redis.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.knightliao.apollo.redis.RedisClient;

/**
 * @description : RedisClientMock
 * 
 * @author : WuNing
 * @email : Wuning01@baidu.com
 * @date : 2014年3月17日 下午5:20:23
 */

public class RedisClientMock extends RedisClient {
    private static final Logger logger = LoggerFactory.getLogger(RedisClientMock.class);

    /**
     * mock掉一些需要的函数 后续按需要添加
     */

    @Override
    public boolean rpush(String key, Object value) throws Exception {
        logger.info("[Redis Client Mock : RPUSH] key:" + key + " value:" + value);
        return true;
    }
}