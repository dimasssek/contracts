# contracts

Общие Java-контракты для микросервисов банковской системы.

## Структура пакетов

```
ru.kubsu.contracts
├── dto.service.client          — DTO для REST API client-service
├── enums.service.client        — перечисления client-service
├── messaging.service.client    — сообщения RabbitMQ client-service
└── exception.service.client    — исключения client-service
```

Контракты подключаются в client-service через git submodule `src/contracts` и компилируются через `build-helper-maven-plugin`.
