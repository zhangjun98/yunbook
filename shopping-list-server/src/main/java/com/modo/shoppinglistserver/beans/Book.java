package com.modo.shoppinglistserver.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author:modoyun
 * @TIME:15:53
 * @DATE:2020/6/17 -rf
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    /*book_id
        book_name
        author
        introduce
        image_url
        publisher
        isbn
        publish_time
        price
        sale_price
        count
        detail
        type_id
*/
    private int bookId;
    private String bookName;
    private String author;
    private String introduce;
    private String imageUrl;
    private String publisher;
    private String isbn;
    private Double price;
    private Double salePrice;
    private Date publishTime;
    private Integer count;
    private String detail;
    private Integer typeId;
}
