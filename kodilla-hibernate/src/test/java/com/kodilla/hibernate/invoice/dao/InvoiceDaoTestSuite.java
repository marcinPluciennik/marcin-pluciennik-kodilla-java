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

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product pencil = new Product("PENCIL");
        Product noteBook = new Product("NOTEBOOK");
        Product marker = new Product("MARKER");

        Item item1 = new Item(pencil,new BigDecimal(10), 3, new BigDecimal(30));
        Item item2 = new Item(noteBook, new BigDecimal(100), 1, new BigDecimal(100));
        Item item3 = new Item(marker, new BigDecimal(1), 10, new BigDecimal(10));
        Item item4 =  new Item(pencil,new BigDecimal(10), 100, new BigDecimal(300));

        item1.setProduct(pencil);
        item2.setProduct(noteBook);
        item3.setProduct(marker);
        item4.setProduct(pencil);

        Invoice invoice = new Invoice("123456");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
         invoiceDao.save(invoice);
         int invoiceID = invoice.getId();

        //Than
        Assert.assertNotEquals(0, invoiceID);

        //CleanUp
        //try{
        //    invoiceDao.deleteById(invoiceID);
        //} catch (Exception e){
        //}
    }
}
