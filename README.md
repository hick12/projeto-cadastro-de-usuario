---

# 📌 Projeto Cadastro de Usuário

Este projeto é uma API REST desenvolvida com **Spring Boot** para realizar operações de CRUD (Create, Read, Update, Delete) de usuários, utilizando **Spring Data JPA** e banco de dados em memória **H2**.

---

## 🚀 Tecnologias Utilizadas

* Java 21
* Spring Boot 3.5.5
* Spring Data JPA
* Banco de dados H2 (em memória)
* Lombok

---

## ⚙️ Funcionalidades

* Criar um usuário (`POST /usuarios`)
* Buscar usuário por e-mail (`GET /usuarios?email=...`)
* Atualizar usuário por ID (`PUT /usuarios?id=...`)
* Deletar usuário por e-mail (`DELETE /usuarios?email=...`)

---

## 📂 Estrutura do Projeto

```
src/main/java/com/javanauta/projeto_cadastro_de_usuario
│
├── business
│   └── UsuarioService.java   # Lógica de negócios
│
├── controller
│   └── UsuarioController.java  # Endpoints REST
│
├── infraestructure
│   ├── entitys
│   │   └── Usuario.java        # Entidade mapeada para o banco
│   └── repositorys
│       └── UsuarioRepository.java  # Interface JPA
│
└── ProjetoCadastroDeUsuarioApplication.java # Classe principal
```

---

## 🗄️ Configuração do Banco H2

O projeto utiliza banco em memória **H2**. Para acessar o console web:

* URL do console: `http://localhost:8080/h2-console`
* JDBC URL: `jdbc:h2:mem:usuario`
* Usuário: `usuario`
* Senha: *(deixe em branco)*

---

## ▶️ Como Rodar o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/projeto-cadastro-usuario.git
   ```
2. Acesse a pasta do projeto:

   ```bash
   cd projeto-cadastro-usuario
   ```
3. Execute o projeto:

   ```bash
   mvn spring-boot:run
   ```

A aplicação rodará em:
👉 `http://localhost:8080`

---

## 📬 Endpoints

### Criar Usuário

`POST /usuarios`
**Body (JSON):**

```json
{
  "nome": "Henrique",
  "email": "henrique@email.com"
}
```

### Buscar Usuário por E-mail

`GET /usuarios?email=henrique@email.com`

### Atualizar Usuário por ID

`PUT /usuarios?id=1`
**Body (JSON):**

```json
{
  "nome": "Henrique Atualizado",
  "email": "novo@email.com"
}
```

### Deletar Usuário por E-mail

`DELETE /usuarios?email=henrique@email.com`

---





