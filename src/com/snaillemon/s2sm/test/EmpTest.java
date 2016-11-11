package com.snaillemon.s2sm.test;

import com.snaillemon.s2sm.service.EmpService;
import com.snaillemon.s2sm.vo.Employee;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GoodBoy on 11/10/2016.
 */
public class EmpTest {
    @Test
    public void test() throws Exception {
//       加载spring的ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//       从ioc容器中获取业务对象
        EmpService service = context.getBean("empServiceImpl",EmpService.class);
//        执行业务方法
        /*Employee emp = new Employee(17, "heiheiyuan", 4);
        try {
            service.insertOne(emp);
            System.out.println("成功插入一条数据");
        }catch (Exception e) {
            e.printStackTrace();
        }*/
        Employee employee = service.selectOne(5);
        if (employee == null) {
            System.out.println("no data");
        }else
            System.out.println(employee.toString());
        /*EmpAction action = new EmpAction();
        String s = action.execute();
        System.out.println(s);*/
    }
}
