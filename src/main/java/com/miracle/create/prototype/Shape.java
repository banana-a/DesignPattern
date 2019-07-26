package com.miracle.create.prototype;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:46
 **/

/**
 * 原型模式
 *
 * 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 *
 * 主要解决：在运行期建立和删除原型
 *
 * 关键代码：实现克隆操作，继承Cloneable，重写clone()
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}