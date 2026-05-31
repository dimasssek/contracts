package ru.kubsu.contracts.dto.service.application;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.Gender;

import java.time.LocalDate;

/**
 * Базовый запрос на обновление заявления.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ApplicationUpdateRequest {

    /** Фамилия клиента. */
    @NotBlank
    private String lastName;

    /** Имя клиента. */
    @NotBlank
    private String firstName;

    /** Отчество клиента. */
    private String patronymic;

    /** Дата рождения клиента. */
    @NotNull
    private LocalDate birthDate;

    /** Пол клиента. */
    @NotNull
    private Gender gender;

    /** Серия документа клиента. */
    @NotBlank
    private String identityDocumentSeries;

    /** Номер документа клиента. */
    private String identityDocumentNumber;

    /** ИНН клиента. */
    private String itn;

    /** СНИЛС клиента. */
    private String insuranceNumber;
}
