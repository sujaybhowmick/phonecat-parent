package com.phonecat.entities;

import com.mongodb.BasicDBObject;

import java.util.Date;

/**
 * Created by sujay on 03/11/14.
 */
public class Base {
    Date lastUpdatedDate;

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }
}
