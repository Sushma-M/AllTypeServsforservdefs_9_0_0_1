/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class Mytable2Id implements Serializable {

    private Integer col1;
    private Integer id;

    public Integer getCol1() {
        return this.col1;
    }

    public void setCol1(Integer col1) {
        this.col1 = col1;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mytable2)) return false;
        final Mytable2 mytable2 = (Mytable2) o;
        return Objects.equals(getCol1(), mytable2.getCol1()) &&
                Objects.equals(getId(), mytable2.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCol1(),
                getId());
    }
}
