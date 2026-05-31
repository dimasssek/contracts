package ru.kubsu.contracts.dto.service.client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.Gender;
import ru.kubsu.contracts.enums.service.client.SourceType;

import java.time.LocalDate;

/**
 * Запрос на создание внешнего запроса с ручным вводом данных клиента.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalRequestManualCreateRequest {

    /** Номер исходящего письма. */
    @NotBlank
    private String letterNumber;

    /** Дата исходящего запроса. */
    @NotNull
    private LocalDate letterDate;

    /** Тип внешнего источника-получателя. */
    @NotNull
    private SourceType sourceType;

    /** Логин пользователя, инициировавшего запрос. */
    @NotBlank
    private String initiatorLogin;

    /** Фамилия. */
    @NotBlank
    private String lastName;

    /** Имя. */
    @NotBlank
    private String firstName;

    /** Отчество. */
    private String patronymic;

    /** Дата рождения. */
    @NotNull
    private LocalDate birthDate;

    /** Пол. */
    @NotNull
    private Gender gender;

    /** Серия паспорта. */
    @NotBlank
    private String identityDocumentSeries;

    /** Номер паспорта. */
    private String identityDocumentNumber;

    /** Дата выдачи паспорта. */
    private LocalDate identityDocumentIssueDate;

    /** ИНН. */
    private String itn;

    /** СНИЛС. */
    private String insuranceNumber;
}
