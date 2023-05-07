package com.bookclub.service.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bookclub.model.WishlistItem;

@Repository("wishlistDao")
public class MongoWishlistDao implements WishlistDao{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<WishlistItem> list(){
        return mongoTemplate.findAll(WishlistItem.class);
    }

    @Override
    public void add(WishlistItem entity){
        mongoTemplate.save(entity);
    }

    @Override
    public void update(WishlistItem entity){

    }

    @Override
    public boolean remove(WishlistItem entity){
        Query query = new Query();

        query.addCriteria(Criteria.where("id").is(entity.getId()));

        mongoTemplate.remove(query, WishlistItem.class);

        return true;
    }

    @Override
    public WishlistItem find(String key){
        return mongoTemplate.findById(key, WishlistItem.class);
    }
}
