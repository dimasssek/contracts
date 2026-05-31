package ru.kubsu.contracts.dto.service.application;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ClientChangeType;

/**
 * Запрос на обновление заявления на изменение данных клиента.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ProfileChangeApplicationUpdateRequest extends ApplicationUpdateRequest {

    /** Тип изменяемых данных. */
    @NotNull
    private ClientChangeType changeType;

    /** Старое значение. */
    private String oldValue;

    /** Новое значение. */
    private String newValue;
}
