package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Petar Tahchiev
 * @since 2.2.2
 */
@Entity
public class ProductEntity {

    public static final String NAME = "product";

    @Id
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = UnitEntity.class)
    @JoinColumn(name = "unit_id", nullable = true, referencedColumnName = "id")
    private UnitEntity unit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UnitEntity getUnit() {
        return unit;
    }

    public void setUnit(UnitEntity unit) {
        this.unit = unit;
    }
}
