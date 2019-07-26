package com.miracle.structure.filter;

import java.util.List;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:02
 **/


public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}