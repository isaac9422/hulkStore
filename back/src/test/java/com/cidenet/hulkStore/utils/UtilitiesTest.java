package com.cidenet.hulkStore.utils;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cidenet.hulkStore.domains.Product;
import com.cidenet.hulkStore.dto.ProductDTO;
import com.cidenet.hulkStore.exceptions.ControlledException;

public class UtilitiesTest {

    @Test
    public void transformEntityListTest() throws ControlledException {

        List<ProductDTO> productDTOList = new ArrayList<>();
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("Product");
        productDTO.setQuantity(100l);
        productDTO.setValue(1000.0);
        productDTOList.add(productDTO);
        List<Product> productList = new ArrayList<>();
        Product productSaved = new Product(productDTO);
        productList.add(productSaved);

        List<ProductDTO> productDTOListExpect = Utilities.convertEntityListToDTO(productList);

        assertEquals(productDTOListExpect, productDTOList);
    }

}
