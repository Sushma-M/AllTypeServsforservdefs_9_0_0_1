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
 * ArticleTagssx generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`article_tagssx`")
@IdClass(ArticleTagssxId.class)
public class ArticleTagssx implements Serializable {

    private Integer articleId;
    private Integer tagId;
    private String blank;

    @Id
    @Column(name = "`article_id`", nullable = false, scale = 0, precision = 10)
    public Integer getArticleId() {
        return this.articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Id
    @Column(name = "`tag_id`", nullable = false, scale = 0, precision = 10)
    public Integer getTagId() {
        return this.tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Id
    @Column(name = "`blank`", nullable = true, length = 255)
    public String getBlank() {
        return this.blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArticleTagssx)) return false;
        final ArticleTagssx articleTagssx = (ArticleTagssx) o;
        return Objects.equals(getArticleId(), articleTagssx.getArticleId()) &&
                Objects.equals(getTagId(), articleTagssx.getTagId()) &&
                Objects.equals(getBlank(), articleTagssx.getBlank());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArticleId(),
                getTagId(),
                getBlank());
    }
}

