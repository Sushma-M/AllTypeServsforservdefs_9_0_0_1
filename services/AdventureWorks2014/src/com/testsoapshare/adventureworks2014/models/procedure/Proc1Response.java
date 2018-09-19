/*Copyright (c) 2016-2017 vcstest1.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest1.com*/
package com.testsoapshare.adventureworks2014.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class Proc1Response implements Serializable {


    @JsonProperty("content")
    @ColumnAlias("content")
    private List<Proc1ResponseContent> content;

    public List<Proc1ResponseContent> getContent() {
        return this.content;
    }

    public void setContent(List<Proc1ResponseContent> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proc1Response)) return false;
        final Proc1Response proc1response = (Proc1Response) o;
        return Objects.equals(getContent(), proc1response.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContent());
    }
}
