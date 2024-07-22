import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.result.DeleteResult;
import java.sql.*;

public class Main {
    public static void main(String[] args) {


        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://ithancamacho:epn123@cluster0.uhwmdtv.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")) {
            MongoDatabase database = mongoClient.getDatabase("miBaseDeDatos");
            MongoCollection<Document> collection = database.getCollection("miColeccion");
            Document documento = new Document("nombre", "Damian")
                    .append("apellido", "Rueda")
                    .append("edad", 19);
            collection.insertOne(documento);
            System.out.println("Documento insertado con éxito");

        }
    }
}