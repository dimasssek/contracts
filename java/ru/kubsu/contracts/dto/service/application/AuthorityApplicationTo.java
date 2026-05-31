package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.AuthorityType;

import java.time.LocalDate;

/**
 * DTO заявления на полномочия и доступы.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class AuthorityApplicationTo extends ApplicationTo {

    /** Тип полномочия или доступа. */
    private AuthorityType authorityType;

    /** ФИО лица, которому предоставляются полномочия. */
    private String personName;

    /** Номер документа, подтверждающего полномочия. */
    private String documentNumber;

    /** Дата окончания действия полномочий. */
    private LocalDate validUntil;
}
