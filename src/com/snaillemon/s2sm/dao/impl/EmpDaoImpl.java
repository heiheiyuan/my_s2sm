package com.snaillemon.s2sm.dao.impl;

import com.snaillemon.s2sm.dao.EmpDao;
import com.snaillemon.s2sm.vo.Employee;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by GoodBoy on 11/11/2016.
 */
public class EmpDaoImpl extends SqlSessionDaoSupport implements EmpDao {

    @Override
    public int insertOne(Employee emp) throws Exception {

        String state = "com.snaillemon.s2sm.vo.EmpMapper.insertOne";

        return getSqlSession().insert(state, emp);
    }

    @Override
    public Employee selectOne(int id) throws Exception {

        String state = "com.snaillemon.s2sm.vo.EmpMapper.selectOne";

        return getSqlSession().selectOne(state,id);
    }
}
