package ru.kubsu.contracts.enums.service.application;

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
    APPLIED
}
