package com.modo.shoppinglistserver.dao;

import com.modo.shoppinglistserver.beans.Book;
import com.modo.shoppinglistserver.beans.ShoppingCar;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:14:32
 * @DATE:2020/6/20 -rf
 */
public interface ShoppingListDao {
    /**
     * 通过图书的id查询图书
    * @param bookId
     * @return
     * @throws Exception
     */
    public Book getBookById(Integer bookId) throws Exception;

    /**
     * 通过uid查询购物车信息
     * * @param uid
     * @return
     * @throws Exception
     */
    public List<ShoppingCar> getShoppingCarByUid(Integer uid) throws Exception;

    public ShoppingCar getShoppingCarBysAu(Integer sid) throws Exception;

}
