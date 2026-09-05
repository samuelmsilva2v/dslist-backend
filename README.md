# DSList

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
