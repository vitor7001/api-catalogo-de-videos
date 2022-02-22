package com.vitor.CatalogoVideo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CategoryTest {
    
    @Test
    public void createCategoryWithName() throws Exception{
        final Category entity = new Category(
            "Any name",
            "Any description"
        );

        assertNotNull(entity);
        assertEquals(entity.getName(), "Any name");
        assertEquals(entity.getDescription(), "Any description");
    }

}
