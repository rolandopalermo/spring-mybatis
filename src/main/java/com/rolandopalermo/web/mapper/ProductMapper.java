/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.web.mapper;

import com.rolandopalermo.web.domain.Product;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *
 * @author rolan
 */
public interface ProductMapper {

    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "name", column = "name"),
        @Result(property = "price", column = "price"),
        @Result(property = "description", column = "description")
    })
    @Select("SELECT id, name, price, description from product WHERE id = #{id}")
    Product selectProduct(int id);

    @Insert("INSERT into product(name, price, description) VALUES(#{name}, #{price}, #{description})")
    void insertProduct(Product product);

    @Update("UPDATE product SET name=#{name}, price =#{price}, description =#{description} WHERE id =#{id}")
    void updateProduct(Product product);

    @Delete("DELETE FROM product WHERE id =#{id}")
    void deleteProduct(int id);
    
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "name", column = "name"),
        @Result(property = "price", column = "price"),
        @Result(property = "description", column = "description")
    })
    @Select("SELECT id, name, price, description from product")
    List<Product> selectAllProduct();

}
