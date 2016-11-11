package com.snaillemon.s2sm.dao;

import com.snaillemon.s2sm.vo.Employee;

/**
 * Created by GoodBoy on 11/10/2016.
 */
public interface EmpDao {

    int insertOne(Employee emp) throws Exception;

    Employee selectOne(int id)throws Exception;
}
