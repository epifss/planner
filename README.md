# Travel Planning System

Este é um sistema de planejamento de viagens desenvolvido em Java e Spring Boot.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Flyway
- Spring Boot Dev Tools
- Lombok
- Spring Data JPA
- H2 Database

## Configuração do Banco de Dados

O banco de dados H2 é configurado na aplicação. As migrações de banco de dados são gerenciadas pelo Flyway.

## Funcionalidades

### Viagem

- **Criar Viagem**: `POST /trips`
- **Consultar Viagem**: `GET /trips/{tripId}`
- **Atualizar Viagem**: `PUT /trips/{tripId}`
- **Confirmar Viagem**: `GET /trips/{tripId}/confirm`

### Participantes

- **Criar Participante**: `POST /participants`
- **Confirmar Participante**: `POST /participants/{participantId}/confirm`
- **Convidar Participante**: `POST /trips/{tripId}/invites`
- **Consultar Participantes**: `GET /trips/{tripId}/participants`
