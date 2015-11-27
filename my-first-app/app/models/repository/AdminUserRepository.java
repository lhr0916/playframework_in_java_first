package models.repository;

import com.avaje.ebean.Model;
import models.domain.AdminUser;

import java.util.List;


/**
 * Created by catherine on 2015. 11. 25..
 */
public class AdminUserRepository{

    private static Model.Finder<String, AdminUser> find = new Model.Finder<String, AdminUser>(AdminUser.class);

    public AdminUser findById(String id){
        return find.byId(id);
    }

    public List<AdminUser> findAll(){
        return find.all();
    }

}
