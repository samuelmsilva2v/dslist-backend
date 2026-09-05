# DSList
[🇺🇸 Read in English](#dslist-1)

API REST para listas de jogos ranqueadas — cadastro de jogos, listas temáticas e reordenação (drag-and-drop) dos jogos dentro de uma lista. Desafio do curso DevSuperior.

## Tecnologias
Java 21, Spring Boot 3.4.5, Spring Data JPA, H2 (perfil de teste) / PostgreSQL (produção)

## Endpoints
| Método | Rota | Descrição |
|---|---|---|
| GET | `/games/{id}` | Detalhes de um jogo |
| GET | `/games` | Lista todos os jogos |
| GET | `/lists` | Lista todas as listas de jogos |
| GET | `/lists/{listId}/games` | Jogos de uma lista, na ordem de ranking |
| POST | `/lists/{listId}/replacement` | Move um jogo de posição (`{ sourceIndex, destinationIndex }`) |

## Como executar
```bash
./mvnw spring-boot:run
```
Sobe no perfil `test` com H2 em memória e dados de seed.

---

# DSList
[🇧🇷 Leia em Português](#dslist)

REST API for ranked game lists — game registration, themed lists and reordering (drag-and-drop) of games within a list. DevSuperior course challenge.

## Technologies
Java 21, Spring Boot 3.4.5, Spring Data JPA, H2 (test profile) / PostgreSQL (production)

## Endpoints
| Method | Route | Description |
|---|---|---|
| GET | `/games/{id}` | Details of a game |
| GET | `/games` | Lists all games |
| GET | `/lists` | Lists all game lists |
| GET | `/lists/{listId}/games` | Games in a list, in ranking order |
| POST | `/lists/{listId}/replacement` | Moves a game's position (`{ sourceIndex, destinationIndex }`) |

## How to run
```bash
./mvnw spring-boot:run
```
Runs on the `test` profile with in-memory H2 and seed data.
