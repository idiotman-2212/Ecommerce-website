package com.cozastore.entity.keys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BlogTagKeys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id_blog")
    private int idBlog;

    @Column(name = "id_tag")
    private int idTag;

    public BlogTagKeys(){
    }

    public BlogTagKeys(int idBlog, int idTag){
        this.idBlog = idBlog;
        this.idTag = idTag;

    }

    public int getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }
}