package com.snaillemon.s2sm.vo;

/**
 * Created by GoodBoy on 11/10/2016.
 */
public class Employee {
    //员工id
    public int id;
    //员工姓名
    public String eName;
    //员工部门编号
    public int did;

    public Employee() {
    }

    public Employee(int id, String eName, int did) {
        this.id = id;
        this.eName = eName;
        this.did = did;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", eName='" + eName + '\'' +
                ", did=" + did +
                '}';
    }
}
