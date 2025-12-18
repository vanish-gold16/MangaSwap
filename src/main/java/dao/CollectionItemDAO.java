package dao;

import entity.CollectionItem;
import org.hibernate.Session;

import java.util.List;

public class CollectionItemDAO {

    public CollectionItem findByID(Session session, int id){
        return (CollectionItem) session.get(CollectionItem.class, id);
    }

    public List<CollectionItem> findTradableItemsByUser(Session session, int userID){
        return (List<CollectionItem>) session.createQuery("SELECT item" +
                "FROM CollectionItem item " +
                "WHERE item.user.id = :uid " +
                "AND item.forTrade = true").
                setParameter("uid", userID).list();
    }

}
