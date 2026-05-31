package ru.kubsu.contracts.dto.service.application;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.AuthorityType;

import java.time.LocalDate;

/**
 * Запрос на обновление заявления на полномочия и доступы.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class AuthorityApplicationUpdateRequest extends ApplicationUpdateRequest {

    /** Тип полномочия или доступа. */
    @NotNull
    private AuthorityType authorityType;

    /** ФИО лица, которому предоставляются полномочия. */
    @NotBlank
    private String personName;

    /** Номер документа, подтверждающего полномочия. */
    private String documentNumber;

    /** Дата окончания действия полномочий. */
    private LocalDate validUntil;
}
