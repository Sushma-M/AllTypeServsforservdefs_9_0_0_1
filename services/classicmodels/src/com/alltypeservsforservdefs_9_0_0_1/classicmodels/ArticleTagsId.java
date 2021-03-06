/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class ArticleTagsId implements Serializable {

    private Integer articleId;
    private Integer tagId;

    public Integer getArticleId() {
        return this.articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return this.tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArticleTags)) return false;
        final ArticleTags articleTags = (ArticleTags) o;
        return Objects.equals(getArticleId(), articleTags.getArticleId()) &&
                Objects.equals(getTagId(), articleTags.getTagId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArticleId(),
                getTagId());
    }
}
