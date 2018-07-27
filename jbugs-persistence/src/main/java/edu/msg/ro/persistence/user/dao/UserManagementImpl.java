package edu.msg.ro.persistence.user.dao;

import edu.msg.ro.persistence.user.entity.Role;
import edu.msg.ro.persistence.user.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "UserManagementImpl",mappedName = "UserManagementImpl")
public class UserManagementImpl implements UserManagement{

    @PersistenceContext(unitName = "jbug-persistence")
    EntityManager em;

    @Override
    public void deactivateUser(int id) {
        User user;
    }

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public User updateUser(User user) {
        em.merge(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void removeRole(Role role) {
        em.remove(role);
    }
}
