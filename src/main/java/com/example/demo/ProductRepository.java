package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @author Petar Tahchiev
 * @since 2.2.2
 */
@Repository(value = "productRepository")
@RepositoryRestResource(itemResourceRel = ProductEntity.NAME, path = ProductEntity.NAME, collectionResourceRel = ProductEntity.NAME)
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
