package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAO {
     Session session = createSession();
     Transaction transaction = session.beginTransaction();

    public void commitTransaction() {
        transaction.commit();
    }

    public Object read(Class<Student> table, Integer key) {
        return session.byId(table).getReference(key);
    }

    public void delete(Class table, Object key) {
        session.remove(session.find(table, key));
    }

    public Object update(Class table, Object key) {
        return session.find(table, key);
    }

    public void create(Object obj) {
        session.save(obj);
        session.persist(obj);
    }

    private Session createSession() {
        //creating configuration object
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
        //creating seession factory object
        SessionFactory factory = cfg.buildSessionFactory();
        //creating session object
        return factory.openSession();
    }
}
