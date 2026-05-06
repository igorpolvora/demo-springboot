### CRUD 

API REST com operações CRUD desenvolvida em Java com Spring Boot.

## 🛠️ Tecnologias

- **Java 25**
- **Spring Boot 4.0.6**
- **Spring Web MVC** — camada de controllers REST
- **Spring Data JPA** — persistência e acesso a dados com Hibernate
- **H2 Database** — banco de dados em memória para desenvolvimento/testes
- **PostgreSQL** — banco de dados relacional para produção
- **Maven** — gerenciamento de dependências e build

## 📋 Pré-requisitos

- Java 25+
- Maven 3.9+ (ou utilize o wrapper `./mvnw` incluído no projeto)
- PostgreSQL (para ambiente de produção)

## 🚀 Como executar

### Clonando o repositório

```bash
git clone https://github.com/igorpolvora/demo-springboot.git
cd demo-springboot
```

### Executando com H2 (desenvolvimento)

```bash
./mvnw spring-boot:run
```

A aplicação será iniciada em `http://localhost:8080`.

O console do H2 estará disponível em `http://localhost:8080/h2-console`.

### Executando com PostgreSQL (produção)

Configure as variáveis de ambiente ou edite o `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

Em seguida, execute:

```bash
./mvnw spring-boot:run
```

## 🏗️ Build

Para gerar o `.jar` executável:

```bash
./mvnw clean package
```

O artefato será gerado em `target/demo-0.0.1-SNAPSHOT.jar`.

Para executar o `.jar` diretamente:

```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

## 🧪 Testes

```bash
./mvnw test
```

## 📁 Estrutura do Projeto

```
demo-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/know/demo/
│   │   └── resources/
│   └── test/
│       └── java/com/know/demo/
├── .mvn/wrapper/
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## 📄 Licença

Este projeto está disponível para uso acadêmico e de estudo.
