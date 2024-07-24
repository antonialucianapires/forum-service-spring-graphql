# Spring com Graphql

Este é um projeto simples para validar o uso de Spring Boot, Spring Web e GraphQL. 

## Tecnologias
- Spring Boot
- Spring Web
- Spring GraphQL

## Conceito
GraphQL é uma linguagem de consulta para APIs e um runtime para atender a essas consultas com os dados existentes. Ele permite que os clientes solicitem exatamente os dados de que precisam, sem mais, nem menos.

- **Query:** Utilizada para leitura/busca de dados. Não altera o estado do servidor.
- **Mutation:** Utilizada para modificar dados no servidor, como criar, atualizar ou deletar dados.

## Compilar e executar o projeto
```
./mvnw spring-boot:run
```
### Acessar o playground do GraphQL
```
http://localhost:8080/graphiql
```

### Referências
[https://graphql.org/](https://graphql.org/)

[https://spring.io/projects/spring-graphql](https://spring.io/projects/spring-graphql)

[https://www.youtube.com/watch?v=-0od_vt0s6A](https://www.youtube.com/watch?v=-0od_vt0s6A)