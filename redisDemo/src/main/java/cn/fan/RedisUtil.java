package cn.fan;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
    private static JedisPoolConfig config;
    private static JedisPool jedisPool;

    static {
        config = new JedisPoolConfig();
        config.setMaxTotal(30);
        config.setMaxIdle(2);
        jedisPool = new JedisPool(config,"127.0.0.1",6379);
    }

    public static Jedis getJedis(){
        return jedisPool.getResource();
    }

    public static void close(Jedis jedis){
        jedis.close();
    }

    public static void main(String[] args) {
        Jedis jedis = getJedis();
        String password = jedis.get("password");
        System.out.println("password = " + password);
    }
}
