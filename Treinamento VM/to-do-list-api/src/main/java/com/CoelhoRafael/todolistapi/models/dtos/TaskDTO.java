package com.CoelhoRafael.todolistapi.models.dtos;

import java.util.Date;
public class TaskDTO {
    private String title;
    private Date date;
    private String description;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}