package models;

public class Favorite {

    User user;

    Announcement announcement;

    public Favorite() {
    }

    public Favorite(User user, Announcement announcement) {
        this.user = user;
        this.announcement = announcement;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "user=" + user +
                ", announcement=" + announcement +
                '}';
    }
}
