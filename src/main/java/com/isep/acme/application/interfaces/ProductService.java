package com.isep.acme.application.interfaces;

import java.util.Optional;

import com.isep.acme.domain.Product;
import com.isep.acme.application.dto.ProductDTO;
import com.isep.acme.application.dto.ProductDetailDTO;

public interface ProductService {

    Optional<ProductDTO> findBySku(final String sku);

    Optional<Product> getProductBySku( final String sku );

    Iterable<ProductDTO> findByDesignation(final String designation);

    Iterable<ProductDTO> getCatalog();

    ProductDetailDTO getDetails(final String sku);

    ProductDTO create(final Product manager);

    ProductDTO updateBySku(final String sku, final Product product);

    void deleteBySku(final String sku);
}
