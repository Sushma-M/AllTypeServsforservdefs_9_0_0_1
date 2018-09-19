/*Copyright (c) 2016-2017 vcstest1.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest1.com*/
package com.testsoapshare.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Department generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`Department`", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"`Name`"})})
public class Department implements Serializable {

    private Short departmentId;
    private String name;
    private String groupName;
    private Date modifiedDate;
    private List<EmployeeDepartmentHistory> employeeDepartmentHistories = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`DepartmentID`", nullable = false, scale = 0, precision = 5)
    public Short getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Short departmentId) {
        this.departmentId = departmentId;
    }

    @Column(name = "`Name`", nullable = false, length = 255)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`GroupName`", nullable = false, length = 255)
    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`ModifiedDate`", nullable = false)
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    public List<EmployeeDepartmentHistory> getEmployeeDepartmentHistories() {
        return this.employeeDepartmentHistories;
    }

    public void setEmployeeDepartmentHistories(List<EmployeeDepartmentHistory> employeeDepartmentHistories) {
        this.employeeDepartmentHistories = employeeDepartmentHistories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        final Department department = (Department) o;
        return Objects.equals(getDepartmentId(), department.getDepartmentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentId());
    }
}

