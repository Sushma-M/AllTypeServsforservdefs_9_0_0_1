/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Mytable generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`mytable`")
@IdClass(MytableId.class)
public class Mytable implements Serializable {

    private Integer columnA;
    private Integer columnB;
    private String columnC;

    @Id
    @Column(name = "`column_a`", nullable = false, scale = 0, precision = 10)
    public Integer getColumnA() {
        return this.columnA;
    }

    public void setColumnA(Integer columnA) {
        this.columnA = columnA;
    }

    @Id
    @Column(name = "`column_b`", nullable = false, scale = 0, precision = 10)
    public Integer getColumnB() {
        return this.columnB;
    }

    public void setColumnB(Integer columnB) {
        this.columnB = columnB;
    }

    @Column(name = "`column_c`", nullable = true, length = 50)
    public String getColumnC() {
        return this.columnC;
    }

    public void setColumnC(String columnC) {
        this.columnC = columnC;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mytable)) return false;
        final Mytable mytable = (Mytable) o;
        return Objects.equals(getColumnA(), mytable.getColumnA()) &&
                Objects.equals(getColumnB(), mytable.getColumnB());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColumnA(),
                getColumnB());
    }
}

