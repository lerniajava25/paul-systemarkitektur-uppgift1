import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void buildProduct() {

        Product product = new Product.Builder()
                .id("1")
                .name("Laptop")
                .category(Category.COMPUTER)
                .rating(8)
                .build();


        assertEquals("1", product.getId());
        assertEquals("Laptop", product.getName());
        assertEquals(Category.COMPUTER, product.getCategory());
        assertEquals(8, product.getRating());
        assertNotNull(product.getCreatedAt());
        assertNotNull(product.getUpdatedAt());
    }

    @Test
    void illegalInput() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Product.Builder()
                    .id("1")
                    .name("")
                    .category(Category.COMPUTER)
                    .rating(8)
                    .build();
        });
    }

    @Test
    void customDates() {
        LocalDateTime created = LocalDateTime.of(2026, 9, 18, 10, 0);
        LocalDateTime updated = LocalDateTime.of(2026, 9, 18, 12, 0);

        Product product = new Product.Builder()
                .id("1")
                .name("Laptop")
                .category(Category.COMPUTER)
                .rating(8)
                .createdAt(created)
                .updatedAt(updated)
                .build();

        assertEquals(created, product.getCreatedAt());
        assertEquals(updated, product.getUpdatedAt());
    }
}
