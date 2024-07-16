# DesafioLiterAlura
## LiterAlura

Este é um projeto desenvolvido como parte de um desafio da Alura Oracle ONE, utilizando Java com o framework Spring Boot. O objetivo do projeto é permitir a busca e armazenamento de informações sobre livros e autores utilizando a API do Gutendex.

## Funcionalidades

- **Buscar por nome do livro:** Permite buscar informações detalhadas de um livro pelo seu título.
- **Buscar por autor:** Busca informações de um livro baseado no nome do autor.
- **Buscar todo histórico de livros no banco:** Mostra todos os livros que foram previamente buscados e armazenados no banco de dados.
- **Buscar todo histórico por idioma no banco:** Permite filtrar e exibir livros com base no idioma.
- **Buscar todo histórico por autor no banco:** Mostra todos os autores que foram previamente buscados e armazenados no banco de dados.
- **Buscar autores vivos no ano digitado:** Encontra autores que estavam vivos durante o ano especificado.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.5
- Spring Data JPA
- PostgreSQL (banco de dados utilizado)
- Maven (gestão de dependências)
- Jackson JSON (para desserialização de dados JSON)
- Gutendex API (fonte de dados externa)

## Estrutura do Projeto

O projeto está estruturado com os seguintes pacotes principais:

- **`br.com.bruna.literalura.model`**: Contém as entidades `Author` e `Book`, mapeadas como entidades JPA para persistência no banco de dados.
- **`br.com.bruna.literalura.repository`**: Repositórios JPA para acesso aos dados de `Author` e `Book`.
- **`br.com.bruna.literalura.service.api`**: Serviços para integração com a API do Gutendex.
- **`br.com.bruna.literalura.menu`**: Implementação do menu de interação com o usuário.
- **`br.com.bruna.literalura`**: Classe principal (`LiteraluraApplication`) que inicializa o Spring Boot e configura o menu como um `CommandLineRunner`.


