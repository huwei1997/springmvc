package cap.controller.controller;

import cap.controller.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;


@Controller
public class HelloAction extends ActionSupport {
    private Admin admin;


    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String hello() {
        return SUCCESS;
    }

}