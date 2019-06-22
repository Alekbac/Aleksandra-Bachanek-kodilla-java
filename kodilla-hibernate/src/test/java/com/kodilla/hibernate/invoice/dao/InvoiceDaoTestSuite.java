package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
   // @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product ("bike");
        Product product2 = new Product ("book");
        Product product3 = new Product ("USB_cable");

        BigDecimal prod1price = new BigDecimal( 400 );
        BigDecimal prod2price = new BigDecimal( 45 );
        BigDecimal prod3price = new BigDecimal( 30 );

        Item item1 = new Item (prod1price, 20, product1);
        Item item2 = new Item (prod2price, 60, product2);
        Item item3 = new Item (prod3price, 100, product3);

        Invoice invoice100 = new Invoice( "21/06/2019" );

        item1.setInvoice( invoice100 );
        item2.setInvoice( invoice100 );
        item3.setInvoice( invoice100 );

        List<Item> items = new ArrayList<>(  );
        items.add( item1 );
        items.add( item2 );
        items.add( item3 );

        invoice100.setItems(items);

        //When
        invoiceDao.save(invoice100);

        //Then
        Assert.assertEquals(3, items.size());

        //CleanUp
        invoiceDao.delete(invoice100);
    }
}