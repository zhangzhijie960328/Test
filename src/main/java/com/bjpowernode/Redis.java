package com.bjpowernode;

import redis.clients.jedis.Jedis;

/**
 * 张志杰
 * 2020/12/8
 */
public class Redis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.72.129", 6379);
//        jedis.auth("123456");
//        String ping = jedis.ping();
//        System.out.println(ping);
        /*String set = jedis.set("k1", "v1");
        System.out.println(set);
        String set1 = jedis.set("k2", "v2");
        System.out.println(set1);
        String set2 = jedis.set("zzj", "ghh");
        System.out.println(set2);
        String zzj = jedis.get("zzj");
        System.out.println(zzj);*/

        jedis.select(1);
        String set = jedis.set("k1", "v1");
        System.out.println(set);
        String set1 = jedis.set("k2", "v2");
        System.out.println(set1);
        String set2 = jedis.set("zzj", "ghh");
        System.out.println(set2);
        String zzj = jedis.get("zzj");
        System.out.println(zzj);
    }
}
