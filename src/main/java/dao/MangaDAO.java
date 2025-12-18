package dao;

import entity.Manga;
import org.hibernate.Session;

public class MangaDAO {

    public Manga findByID(Session session, int id){
        return (Manga) session.get(Manga.class, id);
    }

}
