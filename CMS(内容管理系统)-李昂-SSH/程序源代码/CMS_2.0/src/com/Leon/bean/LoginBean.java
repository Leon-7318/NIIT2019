package com.Leon.bean;

import com.Leon.pojo.Manager;
import com.Leon.pojo.Users;
import com.Leon.service.Impl.ManagerServiceImpl;
import com.Leon.service.Impl.UserServiceImpl;
import com.Leon.service.ManagerService;
import com.Leon.service.UserService;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

/**
 * 处理登录和退出登录的请求的受管bean
 *
 * @author Leon
 */

@Component()
public class LoginBean {

    private String message;
    private String name;
    private String password;
    private int k;
    private String dateTime;
    
//    @Inject //注入要使用到其他受管bean到当前受管bean
    private Users userBean;
//    @Inject 
    private Manager managerBean;
//    @Inject
    private ConferenceBean conferenceBean; 
//    @Inject
    private NewBean newBean;
//    @Inject
    private ProductBean productBean;
//    @Inject
    private VideoBean videoBean;

    private final UserService userService = new UserServiceImpl();
    private final ManagerService managerService = new ManagerServiceImpl();
    
    //退出登录
    public String logout() {
//        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
//        if (session != null) 
//            session.invalidate(); //使得会话失效
        return "/temp.xhtml?faces-redirect=true";
    }
    
    public String login() {
        //用户登陆
        if(k==0 && userService.Login(name, password)){
            Users u = userService.getUser(name);
            userBean.setInfo(u.getName(), u.getPassword(), u.getMail(), u.getPhone(), u.getImage());
            return "/temp.xhtml?faces-redirect=true";
        } 
        //管理员登陆
        if(k==1 && managerService.Login(name,password)){
            //后续可在每个页面上获取到该信息
            Manager m = managerService.getManager(name);
            managerBean.setInfo(m.getName(), m.getPassword(), m.getMail(), m.getPhone(), m.getImage());
            
            conferenceBean.setK(1);
            productBean.setK(1);
            newBean.setK(1);
            videoBean.setK(1);
            conferenceBean.refreshPage();
            productBean.refreshPage();
            newBean.refreshPage();
            videoBean.refreshPage();
            System.out.println("-----管理员登陆-----");
            return "web_back/back_index?faces-redirect=true";
        } 
        //验证失败
        { //如果用户名或密码不对，则返回null，表示不跳转页面，并显示一个提示消息。
            message = "用户名或密码错误!请重新输入！";
            return null;
        }
    }
    
    public String goHome(){
        conferenceBean.setK(0);
        productBean.setK(0);
        newBean.setK(0);
        videoBean.setK(0);
        conferenceBean.refreshPage();
        productBean.refreshPage();
        newBean.refreshPage();
        videoBean.refreshPage();
        return "/temp.xhtml?faces-redirect=true";
    }
    
    public String getDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat(" yyyy . MM.dd . E"); 
        dateTime = sdf.format(new Date()); 
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    
    public String getMessage() {
        return message;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
}
