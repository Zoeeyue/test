//import java.util.List;
//import redis.clients.jedis.Jedis;
//public class RedisJava {
//    public static void main(String[] args) {
////连接本地的 Redis 服务
//        Jedis jedis = new Jedis("localhost");
//        System.out.println("连接成功");
//        //存储数据到集合中
//        jedis.sadd("Animal","elephant","tiger","lion","cat","dog");
//        System.out.println(jedis.smembers("Animal"));
//
//
//    }
//}
import java.util.List;
        import redis.clients.jedis.Jedis;
public class RedisJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost"); // 如果 Redis 服务设置了密码，需要下面这行，没有就不需要
        // jedis.auth("123456"); System.out.println("连接成功"); //查看服务是否运行
        //设置 redis 字符串数据 String
        jedis.set("runoobkey", "www.runoob.com"); // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey")); //存储数据到列表中 list
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "jingdong"); // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0 ,2); for(int i=0; i<list.size(); i++) {
            System.out.println("列表项为: "+list.get(i)); }
    }
}





















//        jedis.set("runoobkey", "www.runoob.com");
//// 获取存储的数据并输出
//        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
////存储数据到列表中 list
//        jedis.lpush("site-list", "Runoob");
//        jedis.lpush("site-list", "Google");
//        jedis.lpush("site-list", "Taobao");
//// 获取存储的数据并输出
//        List<String> list = jedis.lrange("site-list", 0 ,2);
//        for(int i=0; i<list.size(); i++) {
//            System.out.println("列表项为: "+list.get(i));