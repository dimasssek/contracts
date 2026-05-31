package ru.kubsu.contracts.dto.service.client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.SourceType;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * Запрос на создание внешнего запроса по списку клиентов из БД.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalRequestBatchCreateRequest {

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

    /** Идентификаторы клиентов для включения в запрос. */
    @NotEmpty
    private List<UUID> clientIds;
}
