package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @author Petar Tahchiev
 * @since 2.2.2
 */
@Repository(value = "unitRepository")
@RepositoryRestResource(itemResourceRel = UnitEntity.NAME, path = UnitEntity.NAME, collectionResourceRel = UnitEntity.NAME)
public interface UnitRepository extends CrudRepository<UnitEntity, Long> {
}
