package com.snaillemon.s2sm.service.impl;

import com.snaillemon.s2sm.dao.EmpDao;
import com.snaillemon.s2sm.service.EmpService;
import com.snaillemon.s2sm.vo.Employee;

/**
 * Created by GoodBoy on 11/10/2016.
 */
public class EmpServiceImpl implements EmpService{

    private EmpDao dao;

    @Override
    public int insertOne(Employee emp) throws Exception {

        return dao.insertOne(emp);
    }

    @Override
    public Employee selectOne(int id) throws Exception {

        return dao.selectOne(id);
    }

    public void setDao(EmpDao dao) {
        this.dao = dao;
    }
}
