package com.miracle.structure.flyweight;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:54
 **/

/**
 * 意图：运用共享技术有效地支持大量细粒度的对象
 *
 * 主要解决：在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，
 * 直接返回在内存中已有的对象，避免重新创建
 *
 * 如何解决：用唯一标识码判断，如果内存中有，则返回这个唯一标识码所标识的对象
 *
 * 关键代码：用HashMap存储这些对象
 */
public interface Shape {
    void draw();
}
