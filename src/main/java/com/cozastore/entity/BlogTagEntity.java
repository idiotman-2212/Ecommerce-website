package com.cozastore.entity;


import com.cozastore.entity.keys.BlogTagKeys;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

import java.util.Date;

@Entity(name = "blog_tag")
public class BlogTagEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_blog")
    private BlogEntity blog;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_tag")
    private TagEntity tag;

    @Column(name = "create_date")
    private Date createDate;

    @PrePersist
    protected void onCreate() {
        createDate = new Date();
    }


    public BlogEntity getBlog() {
        return blog;
    }

    public void setBlog(BlogEntity blog) {
        this.blog = blog;
    }

    public TagEntity getTag() {
        return tag;
    }

    public void setTag(TagEntity tag) {
        this.tag = tag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

