package ru.kubsu.contracts.messaging.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ClientChangeType;

import java.util.UUID;

/**
 * Сообщение для витрины report_profile_change_application.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ProfileChangeApplicationReportMessage {

    /** Идентификатор заявления. */
    private UUID applicationId;

    /** Тип изменяемых данных. */
    private ClientChangeType changeType;

    /** Старое значение. */
    private String oldValue;

    /** Новое значение. */
    private String newValue;
}
