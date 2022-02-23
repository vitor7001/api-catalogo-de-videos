package com.vitor.CatalogoVideo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CategoryTest {
    
    @Test
    public void createCategoryWithNameAndDescription() throws Exception{
        final Category entity = new Category(
            "Any name",
            "Any description"
        );

        assertNotNull(entity);
        assertEquals(entity.getName(), "Any name");
        assertEquals(entity.getDescription(), "Any description");
    }

    @Test
    public void createCategoryWithNameAndDescriptionIsNuLL() throws Exception{
        final Category entity = new Category(
            "Any name",
            null
            );

        assertNotNull(entity);
        assertEquals(entity.getName(), "Any name");
        assertNull(entity.getDescription());
    }

    @Test
    public void createCategoryAndActive() throws Exception{
        final Category entity = new Category(
            "Any name",
            "Any description"
        );

        assertNotNull(entity);
        assertTrue(entity.getIsActive());
        
    }

    @Test
    public void createCategoryAndIsDeactivated() throws Exception{
        final Category entity = new Category(
            "Any name",
            "Any description"
        );

        entity.deactivate();
        assertNotNull(entity);
        assertFalse(entity.getIsActive());
        
    }
}
