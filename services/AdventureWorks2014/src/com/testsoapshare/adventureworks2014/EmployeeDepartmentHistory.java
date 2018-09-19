/*Copyright (c) 2016-2017 vcstest1.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest1.com*/
package com.testsoapshare.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EmployeeDepartmentHistory generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`EmployeeDepartmentHistory`")
@IdClass(EmployeeDepartmentHistoryId.class)
public class EmployeeDepartmentHistory implements Serializable {

    private Integer businessEntityId;
    private Date startDate;
    private Short departmentId;
    private Byte shiftId;
    private Date endDate;
    private Timestamp modifiedDate;
    private Department department;
    private Employee employee;
    private Shift shift;

    @Id
    @Column(name = "`BusinessEntityID`", nullable = false, scale = 0, precision = 10)
    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    @Id
    @Column(name = "`StartDate`", nullable = false)
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Id
    @Column(name = "`DepartmentID`", nullable = false, scale = 0, precision = 5)
    public Short getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Short departmentId) {
        this.departmentId = departmentId;
    }

    @Id
    @Column(name = "`ShiftID`", nullable = false, scale = 0, precision = 3)
    public Byte getShiftId() {
        return this.shiftId;
    }

    public void setShiftId(Byte shiftId) {
        this.shiftId = shiftId;
    }

    @Column(name = "`EndDate`", nullable = true)
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Column(name = "`ModifiedDate`", nullable = false)
    public Timestamp getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`DepartmentID`", referencedColumnName = "`DepartmentID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_EmployeeDepartmentHistory_Department_DepartmentID`"))
    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        if(department != null) {
            this.departmentId = department.getDepartmentId();
        }

        this.department = department;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`BusinessEntityID`", referencedColumnName = "`BusinessEntityID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_EmployeeDepartmentHistory_Employee_BusinessEntityID`"))
    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        if(employee != null) {
            this.businessEntityId = employee.getBusinessEntityId();
        }

        this.employee = employee;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`ShiftID`", referencedColumnName = "`ShiftID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_EmployeeDepartmentHistory_Shift_ShiftID`"))
    public Shift getShift() {
        return this.shift;
    }

    public void setShift(Shift shift) {
        if(shift != null) {
            this.shiftId = shift.getShiftId();
        }

        this.shift = shift;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDepartmentHistory)) return false;
        final EmployeeDepartmentHistory employeeDepartmentHistory = (EmployeeDepartmentHistory) o;
        return Objects.equals(getBusinessEntityId(), employeeDepartmentHistory.getBusinessEntityId()) &&
                Objects.equals(getStartDate(), employeeDepartmentHistory.getStartDate()) &&
                Objects.equals(getDepartmentId(), employeeDepartmentHistory.getDepartmentId()) &&
                Objects.equals(getShiftId(), employeeDepartmentHistory.getShiftId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusinessEntityId(),
                getStartDate(),
                getDepartmentId(),
                getShiftId());
    }
}

