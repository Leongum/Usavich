package com.usavich.rest.product;

import com.usavich.common.lib.CommonUtils;
import com.usavich.entity.product.Product;
import com.usavich.service.product.def.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/21/13
 * Time: 6:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductRestService implements ProductRestDef {
    @Autowired
    private ProductService productService;

    @Override
    public List<Product> getProducts(String productId, String minId, String lastUpdateTime) {
        return productService.getProducts(CommonUtils.parseIntegerToNull(productId),
                CommonUtils.parseIntegerToNull(minId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }
}
