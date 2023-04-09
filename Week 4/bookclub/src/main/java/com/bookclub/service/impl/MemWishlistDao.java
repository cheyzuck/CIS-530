package com.bookclub.service.impl;

import java.util.List;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;

public class MemWishlistDao implements WishlistDao{
    private List<WishlistItem> wishlist;

    @Override
    public List<WishlistItem> list(){
        return this.wishlist;
    }

    @Override
    public WishlistItem find(String key) {
        for (WishlistItem wishListItem: this.wishlist) {
            if (wishListItem.getIsbn().equals(key)) {
                return wishListItem;
            }
        }
        return new WishlistItem();
    }
}
