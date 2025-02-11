# ⚙ Urna Eletrônica - Projeto de Simulação ⚙ | Privlock LTDA

Este repositório contém o código-fonte de uma urna eletrônica desenvolvida como parte de um projeto acadêmico da *Privlock LTDA*, uma empresa especializada em soluções de segurança digital. O sistema visa simular o processo de votação eletrônica, abordando aspectos fundamentais como a segurança, integridade e privacidade dos votos, elementos essenciais em qualquer sistema digital de eleições.

A aplicação foi desenvolvida em Java, utilizando o NetBeans IDE, com foco em proporcionar uma experiência segura, robusta e confiável para os eleitores e administradores.

## Sobre a Privlock LTDA

A *Privlock LTDA* é uma empresa que oferece soluções de segurança digital de última geração, especializando-se em proteção de dados, sistemas de votação eletrônica e criptografia. Nosso compromisso é garantir que nossos clientes desfrutem de um ambiente digital seguro, protegendo suas informações contra acessos não autorizados e ataques cibernéticos.

Este projeto de urna eletrônica é uma demonstração de como a tecnologia pode ser utilizada para criar sistemas seguros e transparentes, com o objetivo de garantir a integridade e o sigilo da informação no processo eleitoral.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **NetBeans**: IDE escolhida para o desenvolvimento.
- **Swing (opcional)**: Utilizado para a criação da interface gráfica.
- **JDBC (opcional)**: Caso o sistema utilize banco de dados para armazenar os dados de candidatos e votos.
- **Criptografia (opcional)**: Implementações de segurança para garantir a integridade e privacidade dos votos.

## Funcionalidades

- **Cadastro de Candidatos**: Permite o registro seguro de candidatos com dados como nome, número e partido.
- **Votação Eletrônica**: Permite que eleitores realizem seus votos de maneira simples e segura.
- **Totalização dos Resultados**: O sistema calcula e exibe os resultados de forma automatizada e transparente.
- **Autenticação de Eleitores (opcional)**: Implementação de medidas de segurança para garantir que apenas eleitores autorizados possam votar.

## Passo a Passo: Como Utilizar a Urna Eletrônica

### 1. **Abertura da Urna**
   Ao iniciar o sistema, a urna eletrônica irá exibir a tela inicial com a opção de autenticação (se implementada) ou diretamente o menu de votação. 
   
   Caso o sistema requeira login:
   - Digite suas credenciais de administrador ou eleitor.
   - Caso o login não seja necessário, pule esta etapa e vá diretamente para a tela de votação.

### 2. **Cadastro de Candidatos (Administração)**
   Se você for o administrador do sistema e desejar cadastrar candidatos:
   - Acesse a tela de administração.
   - Clique na opção **Cadastrar Candidato**.
   - Preencha as informações necessárias:
     - **Nome do Candidato**
     - **Número do Candidato**
     - **Partido**
   - Após preencher, clique em **Salvar** para registrar o candidato no sistema.

### 3. **Votação**
   Para os eleitores realizarem a votação:
   - Na tela inicial, selecione a opção **Iniciar Votação**.
   - Será exibida a lista de candidatos disponíveis para voto.
   - O eleitor deve selecionar o número do candidato desejado e clicar em **Votar**.
     - **Importante**: O voto será registrado de forma segura e anônima. Não é possível alterar um voto após ser registrado.
   
### 4. **Finalizando a Votação**
   Quando todos os eleitores tiverem votado ou quando o administrador decidir finalizar a votação:
   - Acesse a tela de administração e selecione **Finalizar Votação**.
   - O sistema irá calcular automaticamente os resultados e exibir o número de votos de cada candidato.

### 5. **Consulta aos Resultados**
   - Após a votação ser finalizada, o administrador pode consultar os resultados acessando a opção **Resultados**.
   - Os resultados serão exibidos de forma clara, com o total de votos por candidato e o vencedor da eleição.

### 6. **Encerramento**
   - Após consultar os resultados, o administrador pode encerrar a urna clicando na opção **Encerrar Urna**.
   - Isso irá finalizar o processo de votação, tornando os dados inacessíveis para edições futuras.


## Como Rodar

1. **Pré-requisitos**:
   - Java 8 ou superior.
   - NetBeans IDE.
   - (Opcional) Banco de Dados, caso esteja implementado.
   
2. **Instruções para rodar o projeto**:
   - Clone este repositório para sua máquina local:
     ```bash
     git clone https://github.com/seu-usuario/urna-eletronica.git
     ```
   - Abra o projeto no NetBeans.
   - Compile e execute o projeto na IDE.

3. **Testando a aplicação**:
   - Após iniciar o sistema, você pode testar as funcionalidades de cadastro, votação e totalização diretamente pela interface gráfica.

4. **Banco de Dados (se necessário)**:
   - Se estiver utilizando banco de dados, configure a conexão JDBC no arquivo `config.properties` (se aplicável).
   - Importe ou crie as tabelas do banco de dados conforme o arquivo `database.sql` fornecido (caso exista).

## Status do Projeto

- [x] Cadastro de Candidatos
- [x] Votação Eletrônica
- [ ] Totalização de Resultados
- [ ] Integração e Testes Finais

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Caso tenha dúvidas ou queira saber mais sobre a *Privlock LTDA*, entre em contato conosco:

- **E-mail**: privlockltda@gmail.com
