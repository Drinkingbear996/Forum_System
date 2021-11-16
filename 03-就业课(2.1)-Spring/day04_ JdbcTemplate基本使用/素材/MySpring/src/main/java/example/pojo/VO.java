package example.pojo;

import java.util.List;

public class VO {
    List<User> UserList;

    public List<User> getUserList() {
        return UserList;
    }

    public void setUserList(List<User> userList) {
        UserList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "UserList=" + UserList +
                '}';
    }
}
