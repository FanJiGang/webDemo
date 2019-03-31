package cn.fan.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.*;

import java.util.*;

/**
 * @author Fan
 * @date 2019-03-31 20:00
 */
public class redisUtils {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-*.xml");
        RedisTemplate template = ctx.getBean("redisTemplate", RedisTemplate.class);
        //System.out.println("template = " + template);
        //getString(template);  //存/取基本类型值
        //sgList(template);  //存/取list类型值
        //sgSet(template);  //存/取set类型值
        //sgHash(template);  //存/取map类型值
        //sgSortedSet(template);  //存/取sorted-set类型值
    }

    private static void sgSortedSet(RedisTemplate template) {
        ZSetOperations ops = template.opsForZSet();
        ops.add("score","shanghai",70);
        ops.add("score","shengzheng",80);
        ops.add("score","suzhou",40);

        Double score = ops.score("score", "suzhou");
        System.out.println("score = " + score);
    }

    private static void sgHash(RedisTemplate template) {
        HashOperations ops = template.opsForHash();
        /*
        Map<String, String> map = new HashMap<String, String>();
        map.put("name","张三");
        map.put("age","39");
        map.put("sex","man");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            ops.put("people",entry.getKey(),entry.getValue());
        }*/

        Map people = ops.entries("people");
        System.out.println("people = " + people);
    }

    private static void sgSet(RedisTemplate template) {
        SetOperations ops = template.opsForSet();
        //ops.add("emps","李思思","无语语","赵六六");

        Set emps = ops.members("emps");
        for (Object emp : emps) {
            System.out.println("emp = " + emp);
        }
    }

    private static void sgList(RedisTemplate template) {
        ListOperations listOperations = template.opsForList();
        /*缓存list类型数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("王宇");
        if(list!=null){
            for (String s : list) {
                listOperations.rightPush("students",s);
            }
        }*/
        //System.out.println("listOperations = " + listOperations);
        //获取list类型缓存
        List<String> list = new ArrayList<String>();
        Long size = listOperations.size("students");
        for (int i = 0; i < size; i++) {
            list.add((String)listOperations.leftPop("students"));
        }
        System.out.println("list = " + list);
    }

    private static void getString(RedisTemplate template) {
        ValueOperations operations = template.opsForValue();
        /*存基本类型值
        operations.set("name","张三");
        System.out.println("operations = " + operations);
        */
        //取基本类型值
        Object name = operations.get("name");
        System.out.println("name = " + name);
    }
}
