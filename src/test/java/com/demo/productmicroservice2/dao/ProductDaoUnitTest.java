package com.demo.productmicroservice2.dao;

import com.demo.productmicroservice2.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ProductDaoUnitTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private ProductDao productDao;

    @Test
    public void emptyResultTest() {
        Iterable<Product> products = productDao.findAll();
        assertThat(products).isNotEmpty(); //isNotEmpty() : because we have the 3 products in the database (else use: isEmpty() )
    }
}
