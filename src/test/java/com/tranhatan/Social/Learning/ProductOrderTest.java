package com.tranhatan.Social.Learning;

import com.tranhatan.Social.Learning.entity.Order;
import com.tranhatan.Social.Learning.entity.Product;
import com.tranhatan.Social.Learning.repository.OrderRepository;
import com.tranhatan.Social.Learning.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.math.BigDecimal;
import java.util.List;


@SpringBootTest
public class ProductOrderTest {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    void manyToManyInsertTest() {
        Product product_1 = new Product();
        Product product_2 = new Product();

        Order order_1 = new Order();
        Order order_2 = new Order();
        Order order_3 = new Order();

        product_1.setProductName("Sản phẩm 1");
        product_1.setProductPrice(new BigDecimal("4.6"));

        product_2.setProductName("Sản phẩm 2");
        product_2.setProductPrice(new BigDecimal("4.8"));


        order_1.setUserId(1);
        order_2.setUserId(2);

//        List order in product
        product_1.setOrderList(List.of(order_1, order_2));
        product_2.setOrderList(List.of(order_1, order_2, order_3));

        orderRepository.save(order_1);
        orderRepository.save(order_2);
        orderRepository.save(order_3);

//        product
        productRepository.save(product_1);
        productRepository.save(product_2);

    }

    @Test
    @Transactional
    void selectManyToManyTest(){
        Product product_1 = productRepository.findById(1L).orElseThrow();
        System.out.println(product_1);
        System.out.println(product_1.getOrderList());
    }

}
