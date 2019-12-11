package humanity;

public class Person {
    private String name;
    private Person friend;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addFriend(Person friend) {
        if (friend == null || friend.name.equals(name)) {
            return false;
        } else
            this.friend = friend;
        return true;
    }

    public boolean removeFriend() {
        if (friend == null) {
            return false;
        } else
            friend = null;
        return true;
    }

    public boolean isLonely() {
        return friend == null;
    }

    public String getFriendName() {
        return friend == null ? null : friend.name;
    }
}
