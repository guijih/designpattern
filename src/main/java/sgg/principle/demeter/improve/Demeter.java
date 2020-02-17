package sgg.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangwei
 * @Description 迪米特法则
 * @ClassName Demeter
 * @date 2020/2/17 0017 16:52
 */
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.print(new CollageManager());
    }
}


class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class ColleyEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工的管理类
class CollageManager {
    public List<ColleyEmployee> getAllEmployee() {
        List<ColleyEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ColleyEmployee emp = new ColleyEmployee();
            emp.setId("学员id=" + i);
            list.add(emp);
        }
        return list;
    }

    public void printCollectyEmployee(){
        List<ColleyEmployee> allEmployee = getAllEmployee();
        System.out.println("学院");
        for (ColleyEmployee colleyEmployee : allEmployee) {
            System.out.println(colleyEmployee.getId());
        }
    }


}

/**类的直接朋友  CollageManager  Employee
 *ColleyEmployee 不是直接朋友 而是一个陌生类 这样违背了迪米特法则
 */
class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部学员id=" + i);
            list.add(emp);
        }
        return list;
    }

    public void print(CollageManager sub) {
        // 不是直接朋友 以局部变量的方式出现在SchoolManager
        // ColleyEmployee 是以局部变量的方式出现在SchoolManager
        // 违背了迪米特法则

        // 解决办法 讲输出学院信息的方法封装到sub
       /* List<ColleyEmployee> allEmployee = sub.getAllEmployee();
        System.out.println("学院");
        for (ColleyEmployee colleyEmployee : allEmployee) {
            System.out.println(colleyEmployee.getId());
        }*/
        sub.printCollectyEmployee();
        List<Employee> list = this.getAllEmployee();
        System.out.println("学校");
        for (Employee employee : list) {
            System.out.println(employee.getId());
        }

    }

}