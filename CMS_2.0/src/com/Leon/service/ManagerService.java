/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service;

import com.Leon.pojo.Manager;

/**
 *
 * @author Leon
 */
public interface ManagerService {
    public boolean Login(String id, String pass);
    
    public boolean register(Manager m);
    
    public boolean modifyInfo(Manager m);
    
    public Manager getManager(String id);
}
