# Planejador de Viagens

Este projeto é uma aplicação de planejamento de viagens desenvolvida em Java usando o Spring Boot. A aplicação permite o gerenciamento de viagens, participantes, atividades e links relacionados a uma viagem.

## Funcionalidades

- Cadastro de viagens
- Consulta de viagens
- Atualização de viagens
- Confirmação de viagens
- Gerenciamento de participantes
- Gerenciamento de atividades
- Gerenciamento de links

## Tecnologias Utilizadas

- Spring Boot
  - Spring Web
  - Spring Data JPA
  - Spring Dev Tools
- Flyway
- Lombok
- H2 Database

## Migrations

O Flyway é usado para gerenciar a versão do banco de dados. As migrations são armazenadas no diretório `src/main/resources/db/migration`.

## Endpoints

### Viagens

- **Cadastro de viagem**
  - **POST** `/trips`
  
- **Consulta de viagem**
  - **GET** `/trips/{tripId}`
  
- **Atualização de viagem**
  - **PUT** `/trips/{tripId}`
  
- **Confirmação de viagem**
  - **GET** `/trips/{tripId}/confirm`

### Participantes

- **Cadastro de participante**
  - **POST** `/participants`
  
- **Confirmação de participante**
  - **POST** `/participants/{participantId}/confirm`
  
- **Convite de participante**
  - **POST** `/trips/{tripId}/invites`
  
- **Consulta de participantes**
  - **GET** `/trips/{tripId}/participants`

### Atividades

- **Cadastro de atividade**
  - **POST** `/trips/{tripId}/activities`
  
- **Consulta de atividades**
  - **GET** `/trips/{tripId}/activities`

### Links

- **Criação de link**
  - **POST** `/trips/{tripId}/links`
  
- **Consulta de links**
  - **GET** `/trips/{tripId}/links`

## Estrutura do Projeto

- `src/main/java`: Código fonte da aplicação
- `src/main/resources`: Arquivos de configuração e migrations

