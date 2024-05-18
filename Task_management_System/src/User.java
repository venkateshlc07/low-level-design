import java.time.LocalDate;
import java.util.Date;

public class User {
    private  String name;
    private String userId;
    private LocalDate createdAt;

    public User(String userId, String name){
        this.userId = userId;
        this.name = name;
        this.createdAt = LocalDate.now();
    }

    public String getUserId(){
        return  userId;
    }

    public String toString(){
        return name;
    }




}
