package controllers;

import models.domain.AdminUser;
import models.repository.AdminUserRepository;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {
    private AdminUserRepository adminUserRepository = new AdminUserRepository();

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result save(String id){
        AdminUser adminUser = new AdminUser();
        adminUser.id = id;

        adminUser.save();
        return ok("save OK : " + adminUser.role);
    }

    public Result find(String id) {
        AdminUser adminUser = adminUserRepository.findById(id);
        return ok("names: " + adminUser.id);
    }

    public Result findAll(){
        List<AdminUser> list = adminUserRepository.findAll();
        return ok("lists : " +list);
    }
}
