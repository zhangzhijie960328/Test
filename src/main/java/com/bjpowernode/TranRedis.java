package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * 张志杰
 * 2020/12/8
 */
public class TranRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.72.129", 6379);
        Transaction multi = jedis.multi();
        multi.set("k3", "v3");
        multi.set("k4", "v4");
        multi.discard();
        //multi.exec();

    }
}
