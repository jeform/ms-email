# MS-Email

Micro serviço de envio de e-mails desenvolvido com Spring Boot.

## Descrição

O **MS-Email** é um microserviço para envio de e-mails, utilizando o Spring Boot e o JavaMailSender. Ele permite o envio de mensagens de e-mail e armazena o status do envio em um banco de dados PostgreSQL.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
  - Spring Data JPA
  - Spring Mail
- **PostgreSQL**
- **Lombok**

## Configuração do Projeto

### Dependências

Certifique-se de que as seguintes dependências estão configuradas no arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
</dependency>
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>
```

# Configuração do Banco de Dados
No arquivo application.properties, configure o acesso ao banco de dados PostgreSQL:

# Configuração do Servidor de E-mail
Adicione as configurações do servidor SMTP no arquivo application.properties:

Nota: Para usar o Gmail, ative a autenticação de dois fatores e gere uma senha de aplicativo.

Estrutura do Projeto
models: Contém a classe EmailModel, que representa a entidade de e-mail.
repositories: Contém a interface EmailRepository para acesso ao banco de dados.
services: Contém a classe EmailService, responsável pelo envio de e-mails.
enums: Contém o enum StatusEmail, que define os possíveis status de envio.

# Endpoints
Enviar E-mail
URL: /emails

Método: POST

Body:

Resposta:

## Como Executar
Clone o repositório:

Configure o banco de dados PostgreSQL e atualize o arquivo application.properties.

Execute o projeto:

Acesse o serviço na URL: http://localhost:8080.

# Licença
Este projeto está licenciado sob a MIT License.

Desenvolvido por [Jessé Formigoni Machado]

