package com.bookclub.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;

public class MemWishlistDao implements WishlistDao{
    private List<WishlistItem> wishlist;

    public MemWishlistDao(){
        this.wishlist=new ArrayList<WishlistItem>();
        WishlistItem wishlistItem1 = new WishlistItem("9780606236157", "The Lost Hero (Heroes of Olympus, Book 1)");
        this.wishlist.add(wishlistItem1);

    }

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
