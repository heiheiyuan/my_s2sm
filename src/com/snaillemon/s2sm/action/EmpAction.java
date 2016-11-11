package com.snaillemon.s2sm.action;

import com.opensymphony.xwork2.Action;
import com.snaillemon.s2sm.service.EmpService;
import com.snaillemon.s2sm.vo.Employee;

/**
 * Created by GoodBoy on 11/10/2016.
 */

public class EmpAction implements Action {

    private EmpService service;

    private Employee emp;

    @Override
    public String execute() throws Exception {
        //初始化为error
        String state = ERROR;

        emp = service.selectOne(9);

        System.out.println(emp.toString());

        if (emp != null) {
            state = SUCCESS;
        }
        return state;
    }

    public void setService(EmpService service) {
        this.service = service;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
}
