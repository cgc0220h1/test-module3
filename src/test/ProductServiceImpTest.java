package test;

import org.junit.jupiter.api.Test;
import service.IProductService;
import service.ProductServiceImp;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Duc on 5/26/2020
 * @project test-module3-
 **/

class ProductServiceImpTest {

    @Test
    void getProductById() {
        IProductService service = new ProductServiceImp();
        System.out.println(service.getProductById(5));
    }

    @Test
    void getCategoryList() {
        IProductService service = new ProductServiceImp();
        System.out.println(service.getCategoryList());
    }
}