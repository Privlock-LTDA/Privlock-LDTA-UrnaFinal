# Urna Eletrônica - Projeto Final

Este é um projeto desenvolvido para fins acadêmicos, simulando uma urna eletrônica em Java. O projeto foi criado utilizando o NetBeans e tem como objetivo entender como funciona a votação eletrônica, com funcionalidades como cadastro de candidatos, registro de votos e totalização dos resultados.

## Tecnologias Usadas

- **Java**: Linguagem de programação principal.
- **NetBeans**: Ambiente de desenvolvimento integrado (IDE).
- **JDBC (opcional)**: Caso esteja utilizando banco de dados para armazenar os votos e candidatos.
- **Swing (opcional)**: Caso esteja utilizando para a interface gráfica.

## Funcionalidades

- **Cadastro de Candidatos**: Permite o registro de candidatos e seus dados (nome, número, partido).
- **Votação**: Os eleitores podem votar em um candidato de sua escolha.
- **Totalização**: O sistema calcula e exibe os resultados da votação.
- **Autenticação (opcional)**: O sistema pode exigir login para acessar a urna.

## Como Rodar

1. **Pré-requisitos**:
   - Java 8 ou superior.
   - NetBeans IDE.
   - (Opcional) Banco de Dados, caso esteja implementado.

2. **Instruções para rodar o projeto**:
   - Clone este repositório:
     ```bash
     git clone https://github.com/seu-usuario/urna-eletronica.git
     ```
   - Abra o projeto no NetBeans.
   - Compile e execute o projeto dentro da IDE.

3. **Testando a aplicação**:
   - Após iniciar o sistema, você pode testar as funcionalidades de cadastro, votação e totalização diretamente pela interface gráfica (se estiver usando Swing).
   
4. **Banco de Dados (caso necessário)**:
   - Se o sistema estiver usando banco de dados, configure a conexão JDBC no arquivo `config.properties` (se disponível).
   - Crie o banco de dados com as tabelas necessárias (verifique o esquema no arquivo `database.sql`).

## Status do Projeto

- [x] Cadastro de Candidatos
- [x] Votação
- [ ] Totalização dos Resultados
- [ ] Integração Final

## Como Contribuir

Sinta-se à vontade para fazer sugestões, corrigir bugs ou até melhorar a interface. Se encontrar algum problema, abra uma **issue** ou envie um **pull request**!

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
