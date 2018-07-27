package edu.msg.ro.persistence.user.dao;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import edu.msg.ro.persistence.user.entity.Role;
import edu.msg.ro.persistence.user.entity.User;

import java.io.Serializable;
import java.util.List;

public interface UserManagement extends Serializable {
    void addUser(User user);
    User updateUser(User user);
    List<User> getAllUsers();
    void deactivateUser(int id);
    void removeRole(Role role);

}
