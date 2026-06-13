package ru.kubsu.contracts.enums.service.application;

import java.util.Set;

/**
 * Бизнес-статус заявления для отображения на UI и отчётов.
 */
public enum ApplicationStatusBusiness {

    /** Не прошло проверки пре-обработки (ФЛК, дубликат). */
    BAD,

    /** Отклонено по результатам обработки. */
    REJECTED,

    /** В очереди на обработку. */
    IN_QUEUE,

    /** Успешно обработано. */
    APPLIED;

    /** Статусы, включаемые в отчёт general-check. */
    public static final Set<ApplicationStatusBusiness> GENERAL_CHECK_REPORT_STATUSES = Set.of(
            IN_QUEUE,
            BAD,
            APPLIED,
            REJECTED);
}
