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

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author tangjie<https://github.com/tang-jie>
 * @filename:Person.java
 * @description:Person功能模块
 * @blogs http://www.cnblogs.com/jietang/
 * @since 2017/6/14
 */
public class Person {
    private int my_id;
    private String my_name;
    private int my_age;
    private String my_self_remark;
    private Date date;
    private String company;

    //only test attr!
    private String my_self_remark_info_detail;

    public int getMyId() {
        return my_id;
    }

    public void setMyId(int my_id) {
        this.my_id = my_id;
    }

    public String getMyName() {
        return my_name;
    }

    public void setMyName(String my_name) {
        this.my_name = my_name;
    }

    public int getMyAge() {
        return my_age;
    }

    public void setMyAge(int my_age) {
        this.my_age = my_age;
    }

    public String getMySelfRemark() {
        return my_self_remark;
    }

    public void setMySelfRemark(String my_self_remark) {
        this.my_self_remark = my_self_remark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMySelfRemarkInfoDetail() {
        return my_self_remark_info_detail;
    }

    public void setMySelfRemarkInfoDetail(String my_self_remark_info_detail) {
        this.my_self_remark_info_detail = my_self_remark_info_detail;
    }

    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "[my_id=" + this.my_id
                + ",my_name=" + this.my_name
                + ",my_age=" + this.my_age
                + ",my_self_remark=" + my_self_remark
                + ",date=" + df.format(date)
                + ",company=" + company
                + ",my_self_remark_info_detail=" + my_self_remark_info_detail
                + "]";
    }
}

