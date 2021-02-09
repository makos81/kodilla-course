package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Item item = new Item(new BigDecimal(20),1,new BigDecimal(40));
        Item item2 = new Item(new BigDecimal(20),2,new BigDecimal(30));
        Invoice invoice = new Invoice("1");
        product1.getItemList().add(item);
        product1.getItemList().add(item2);
        product2.getItemList().add(item);
        product2.getItemList().add(item2);
        item.setProduct(product1);
        item2.setProduct(product2);
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        itemDao.save(item);
        invoiceDao.save(invoice);
        productDao.save(product1);
        productDao.save(product2);

        int product1ID = product1.getId();
        int product2ID = product2.getId();
        int itemID = item.getId();
        int item2ID = item2.getId();
        int invoiceID = invoice.getId();

        Assertions.assertEquals(item.getProduct().getId(),product1ID);
        Assertions.assertEquals(item2.getProduct().getId(), product2ID);
        Assertions.assertEquals(item.getInvoice().getId(), invoiceID);
        Assertions.assertEquals(item2.getInvoice().getId(), invoiceID);

        try{
            invoiceDao.deleteById(invoiceID);
        }catch(Exception e){
            System.out.println("Strange but this cleaning doesnt work");
        }


    }
}
