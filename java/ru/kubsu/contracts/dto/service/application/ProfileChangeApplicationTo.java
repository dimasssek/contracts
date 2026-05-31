package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ClientChangeType;

/**
 * DTO заявления на изменение данных клиента.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ProfileChangeApplicationTo extends ApplicationTo {

    /** Тип изменяемых данных. */
    private ClientChangeType changeType;

    /** Старое значение. */
    private String oldValue;

    /** Новое значение. */
    private String newValue;
}
