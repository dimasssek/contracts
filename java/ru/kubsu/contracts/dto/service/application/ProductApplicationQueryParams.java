package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ProductCategory;

/**
 * Параметры поиска заявлений на банковский продукт.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ProductApplicationQueryParams extends BaseApplicationQueryParams {

    /** Категория банковского продукта. */
    private ProductCategory productCategory;

    /** Код банковского продукта. */
    private String productCode;

    /** Наименование банковского продукта (частичное совпадение). */
    private String productName;
}
