# contracts

Общие Java-контракты для микросервисов банковской системы.

## Структура пакетов

```
ru.kubsu.contracts
├── dto.common                    — общие DTO (ErrorResponseTo, PageData, PageMetaData)
├── dto.service.client            — DTO для REST API client-service
├── dto.service.application       — DTO для REST API application-service
├── enums.service.client          — перечисления client-service
├── enums.service.application     — перечисления application-service
├── messaging.service.client      — сообщения RabbitMQ client-service
├── exception.service.client      — исключения client-service
└── exception.service.application — исключения application-service
```

Классы `ErrorResponseTo`, `PageData`, `PageMetaData` в пакете `dto.service.client` — deprecated-обёртки над `dto.common`.

Контракты подключаются в микросервисах через git submodule `src/contracts` и компилируются через `build-helper-maven-plugin`.

Сборка contracts отдельно:

```bash
mvn -f pom.xml install
```
