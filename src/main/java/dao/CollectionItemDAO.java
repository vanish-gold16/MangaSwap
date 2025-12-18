package dao;

import entity.CollectionItem;
import org.hibernate.Session;

public class CollectionItemDAO {

    public CollectionItem findByID(Session session, int id){
        return session.get(CollectionItem.class, id);
    }



}
