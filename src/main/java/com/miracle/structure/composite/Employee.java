package com.miracle.structure.composite;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:15
 **/

import java.util.ArrayList;
import java.util.List;

/**
 * 意图：将对象组合成属性结构以表示“部分-整体”的层次结构
 *
 * 何时使用：1、你想表示对象的部分-整体层次结构。2、您希望用户忽略组合对象与单个对象的使用具有一致性
 *
 * 如何解决：树枝和叶子实现统一接口，树枝内部组合该接口
 *
 * 关键代码：树枝内部组合该接口，并且含有内部属性List，里面放Component
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }
    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
