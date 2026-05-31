package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.AuthorityType;

/**
 * Параметры поиска заявлений на полномочия и доступы.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class AuthorityApplicationQueryParams extends BaseApplicationQueryParams {

    /** Тип полномочия или доступа. */
    private AuthorityType authorityType;

    /** ФИО лица, которому предоставляются полномочия (частичное совпадение). */
    private String personName;
}
