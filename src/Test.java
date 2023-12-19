import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class Test {
    public static void main(String[] args) {
        // 连接mongodb服务，连接到默认localhost服务器，端口号为27017
        MongoClient mc = new MongoClient();
        // 连接数据库
        MongoDatabase mdd = mc.getDatabase("Condor_Heroes");
        // 获取数据集合
        MongoCollection<Document> hero = mdd.getCollection("heros");
        // 更新条件
        Document filter = new Document("name", "欧阳克");
        // 更新数据
        Document update = new Document("$set", new Document("age", 32));
        hero.updateOne(filter, update);
        // 调用集合中的find() 方法，查看文档
        FindIterable<Document> documents = hero.find();
        // 遍历documents
        MongoCursor<Document> iteractor = documents.iterator();
        while(iteractor.hasNext()){
            System.out.println(iteractor.next());
        }
    }


}
