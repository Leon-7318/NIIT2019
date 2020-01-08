/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service;

import com.Leon.pojo.Users;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface UserService {
    
    public List<Users> findAll();
    
    public boolean Login(String id, String pass);
    
    public boolean register(Users u);
    
    public boolean modifyInfo(Users u);
    
    public Users getUser(String id);
    
}
