/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

/**
 * TempTimeCheck generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`TempTimeCheck`")
public class TempTimeCheck implements Serializable {

    private Integer id;
    private String name;
    private Date date;
    private Time time;
    @Type(type = "DateTime")
    private LocalDateTime dateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`name`", nullable = true, length = 255)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`date`", nullable = true)
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "`time`", nullable = true)
    public Time getTime() {
        return this.time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Column(name = "`dateTime`", nullable = true)
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TempTimeCheck)) return false;
        final TempTimeCheck tempTimeCheck = (TempTimeCheck) o;
        return Objects.equals(getId(), tempTimeCheck.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

