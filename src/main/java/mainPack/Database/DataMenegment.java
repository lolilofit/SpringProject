/*package mainPack.Database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DataMenegment implements DataMenegmentInterface {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    public User add(User user) {
        entityManager.getTransaction().begin();
        User userFromDB = entityManager.merge(user);
        entityManager.getTransaction().commit();
        return userFromDB;
    }

    public void delete(int id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(User.class, id));
        entityManager.getTransaction().commit();
    }

    public void update(User user) {
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();
    }

    public List<User> getAllUsers() {
        TypedQuery<User> typedQuery = entityManager.createNamedQuery("mainPack.Database.User.getAll", User.class);
        return typedQuery.getResultList();
    }
}
*/