package com.usavich.db.product.dao.impl;

import com.usavich.entity.product.Product;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/20/13
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductMapper {
    public List<Product> getProductById(@Param("productId") Integer productId);

    public List<Product> getProductListByMinId(@Param("minProductId") Integer minProductId);

    public List<Product> getProductListByTime(@Param("lastUpdateTime") Date lastUpdateTime);
}
