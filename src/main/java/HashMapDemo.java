import com.coco.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDemo {

    private static String acct ="AMA_LOAN_ACCT";

    public static void main(String[] args) {

        User user = new User();
        user.setName("name1");
        user.setAge(1);

        List<User> users= new ArrayList<User>();
        users.add(user);

        HashMap<String, Object> saveDataMap= new HashMap<String, Object>();

        saveDataMap.put(acct, users);
        System.out.println(saveDataMap);

        User user2 = new User();
        user2.setName("name2");
        user2.setAge(2);

        ((List<User>)saveDataMap.get(acct)).add(user2);
        System.out.println(saveDataMap);

    }
}
