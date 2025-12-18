package dao;

import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDAO {

    public User findByID(Session session, int id){
        return (User) session.get(User.class, id);
    }

    public void save(Session session, User user){
        session.persist(user);
    }

    public User findByUsername(Session session, String username){
        return (User) session.createQuery("SELECT user " +
                "FROM User user " +
                "WHERE user.username = :name").
                setParameter("name", username).list();
    }

}
