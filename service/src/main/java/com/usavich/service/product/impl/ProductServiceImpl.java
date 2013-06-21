package com.usavich.service.product.impl;

import com.usavich.db.product.dao.def.ProductDAO;
import com.usavich.entity.product.Product;
import com.usavich.service.product.def.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/21/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getProducts(Integer productId, Integer minId, Date lastUpdateTime) {
        List<Product> productList = new ArrayList<Product>();
        if (productId != null) {
            productList = productDAO.getProductById(productId);
        } else if (minId != null) {
            productList = productDAO.getProductListByMinId(minId);
        } else if (lastUpdateTime != null) {
            productList = productDAO.getProductListByTime(lastUpdateTime);
        }else{
            productList = productDAO.getProductListByMinId(-1);
        }

        return productList;
    }
}
