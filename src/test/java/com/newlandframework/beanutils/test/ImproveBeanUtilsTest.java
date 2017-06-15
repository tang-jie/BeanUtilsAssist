/**
 * Copyright (C) 2017 Newland Group Holding Limited
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.newlandframework.beanutils.test;

import com.newlandframework.beanutils.assist.BeanUtilsAssist;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author tangjie<https://github.com/tang-jie>
 * @filename:ImproveBeanUtilsTest.java
 * @description:ImproveBeanUtilsTest功能模块
 * @blogs http://www.cnblogs.com/jietang/
 * @since 2017/6/14
 */
public class ImproveBeanUtilsTest {
    private static Map<String, Object> map = new HashMap<String, Object>();

    @BeforeClass
    public static void setUp() {
        map.put("my_name", "tangjie");
        map.put("my_id", 8888);
        map.put("my_age", 32);
        map.put("my_self_remark", "just do it!");
        map.put("date", new Date());
        map.put("company", "Newland");
        map.put("my_self_remark_info_detail", "only test it!");
    }

    @Test
    public void testNoImproveBeanUtils() {
        Person person = new Person();

        BeanUtilsAssist.populate(person, map, false);

        assertNull(person.getMyName());
        assertEquals(person.getMyId(), 0);
        assertEquals(person.getMyAge(), 0);
        assertNull(person.getMySelfRemark());
        assertNotNull(person.getDate());
        assertNotNull(person.getCompany());
        assertEquals(person.getCompany(), "Newland");
        assertNull(person.getMySelfRemarkInfoDetail());

        System.out.println(person.getMyName());
        System.out.println(person.getMyId());
        System.out.println(person.getMyAge());
        System.out.println(person.getMySelfRemark());
        System.out.println(person.getDate());
        System.out.println(person.getCompany());
        System.out.println(person.getMySelfRemarkInfoDetail());
        System.out.println("-----------------------------------");
        System.out.println(person);
    }

    @Test
    public void testImproveBeanUtils() {
        Person person = new Person();

        BeanUtilsAssist.populate(person, map, true);

        assertNotNull(person.getMyName());
        assertEquals(person.getMyName(), "tangjie");
        assertEquals(person.getMyId(), 8888);
        assertEquals(person.getMyAge(), 32);
        assertNotNull(person.getMySelfRemark());
        assertEquals(person.getMySelfRemark(), "just do it!");
        assertNotNull(person.getDate());
        assertNotNull(person.getCompany());
        assertEquals(person.getCompany(), "Newland");
        assertNotNull(person.getMySelfRemarkInfoDetail());
        assertEquals(person.getMySelfRemarkInfoDetail(), "only test it!");

        System.out.println(person.getMyName());
        System.out.println(person.getMyId());
        System.out.println(person.getMyAge());
        System.out.println(person.getMySelfRemark());
        System.out.println(person.getDate());
        System.out.println(person.getCompany());
        System.out.println(person.getMySelfRemarkInfoDetail());
        System.out.println("-----------------------------------");
        System.out.println(person);
    }
}

