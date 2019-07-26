package com.miracle.structure.filter.Criteriaimpl;

import com.miracle.structure.filter.Criteria;
import com.miracle.structure.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:03
 **/


public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}