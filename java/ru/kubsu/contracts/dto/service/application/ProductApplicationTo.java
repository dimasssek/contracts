package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ProductCategory;

import java.math.BigDecimal;

/**
 * DTO заявления на банковский продукт.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ProductApplicationTo extends ApplicationTo {

    /** Категория банковского продукта. */
    private ProductCategory productCategory;

    /** Код банковского продукта. */
    private String productCode;

    /** Наименование банковского продукта. */
    private String productName;

    /** Сумма продукта. */
    private BigDecimal amount;

    /** Срок продукта в месяцах. */
    private Integer termMonths;

    /** Цель оформления продукта. */
    private String purpose;

    /** Код тарифа. */
    private String tariffCode;

    /** Внешний идентификатор продукта. */
    private String externalProductId;
}
