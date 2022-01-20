package de.mydomain.drools;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainTests {

    @Autowired
    private DiscountService discountService;

    @Test
    void discountOnCar() {
        Sale sale = new Sale();

        sale.setItem("Car");
        sale.setQuantity(11);

        discountService.applyDiscount(sale);

        assertEquals(10, sale.getDiscount());
    }

    @Test
    void discountOnBike() {
        Sale sale = new Sale();

        sale.setItem("Bike");
        sale.setQuantity(11);

        discountService.applyDiscount(sale);

        assertEquals(15, sale.getDiscount());
    }
}
