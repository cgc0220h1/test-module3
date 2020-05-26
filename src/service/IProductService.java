package service;

import com.sun.org.apache.xml.internal.resolver.Catalog;
import model.Category;
import model.Product;

import java.util.List;

/**
 * @author Duc on 5/26/2020
 * @project test-module3-
 **/

public interface IProductService {
    List<Product> getAllProduct();

    Product getProductById(int id);

    List<Category> getCategoryList();

    boolean addProduct(Product product);

    boolean editProduct(int id, Product product);

    boolean deleteProduct(int id);

    List<Product> searchProductByName(String name);
}

