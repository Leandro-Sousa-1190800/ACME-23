package com.isep.acme.infrastructure;

import org.springframework.data.repository.CrudRepository;

import com.isep.acme.domain.ProdImage;

public interface ImageRepository extends CrudRepository<ProdImage, Long> {
}
