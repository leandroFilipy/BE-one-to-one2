# 🔗 Backend One-to-One II - API REST 🚀

![Java](https://img.shields.io/badge/Java-Backend-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-Boot-green?style=for-the-badge)
![JPA](https://img.shields.io/badge/JPA-Hibernate-blue?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-Database-orange?style=for-the-badge)

---

# 🚀 Sobre o Projeto

Este projeto é uma evolução do estudo de **relacionamento One-to-One (1:1)** em uma API backend com **Spring Boot**.

Aqui são aplicadas práticas mais próximas de um sistema real, incluindo:

🔗 Relacionamento mais estruturado  
🔁 Possível associação bidirecional  
📦 Organização em camadas  
🧠 Boas práticas de desenvolvimento  

---

# 🎯 Objetivo

Aprofundar conhecimentos em:

✔ Relacionamento One-to-One avançado  
✔ Mapeamento com JPA/Hibernate  
✔ Arquitetura de APIs REST  
✔ Separação de responsabilidades  

---

# 🧠 One-to-One na Prática

No relacionamento **1:1**, cada entidade possui apenas uma associação com outra.

### 📌 Exemplo:

```
Usuário → Endereço
```

---

# 🔁 Bidirecionalidade

Neste projeto, o relacionamento pode ser:

### 🔹 Unidirecional
Apenas uma entidade conhece a outra.

### 🔹 Bidirecional
Ambas as entidades se conhecem:

```java
@OneToOne(mappedBy = "usuario")
private Endereco endereco;
```

💡 Isso permite navegação nos dois lados da relação.

---

# 🏗 Arquitetura do Projeto

```
src
│
├── controller
├── service
├── repository
├── model
└── dto
```

---

# 📂 Camadas

## 🌐 Controller

Responsável pelos endpoints da API.

```http
GET /dados
POST /dados
```

---

## ⚙ Service

Regras de negócio da aplicação.

✔ valida dados  
✔ controla fluxo  

---

## 🗄 Repository

Comunicação com banco de dados.

✔ CRUD automático  

---

## 📦 Model

Define entidades e relacionamento.

Exemplo:

```java
@OneToOne
@JoinColumn(name = "endereco_id")
private Endereco endereco;
```

---

## 🔄 DTO

Evita exposição direta das entidades.

---

# 🔄 Fluxo da Aplicação

```
Cliente → Controller → Service → Repository → Banco
```

---

# 🌐 Endpoints

```http
GET /entidades
POST /entidades
PUT /entidades/{id}
DELETE /entidades/{id}
```

---

# 🛠 Tecnologias Utilizadas

- ☕ Java  
- 🌱 Spring Boot  
- 🗄 JPA / Hibernate  
- 🐬 MySQL  
- 📄 JSON  

---

# 💻 Como Rodar

### 1️⃣ Clonar

```bash
git clone https://github.com/seu-repositorio/backend-onetoone2.git
```

---

### 2️⃣ Configurar banco

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=root
spring.datasource.password=senha
```

---

### 3️⃣ Executar

Rodar a aplicação pela classe principal.

---

# 🔥 Melhorias Futuras

✨ Controle de cascata (CascadeType)  
✨ FetchType (LAZY / EAGER)  
✨ Validações com Bean Validation  
✨ Tratamento de exceções  
✨ Swagger  

---

# 👨‍💻 Autor

**Leandro Mogador ++ 🚀**

---

# ⭐ Conclusão

Este projeto aprofunda o uso do relacionamento **One-to-One**, abordando cenários mais realistas e boas práticas.

---

🔥 Fundamental para dominar modelagem de banco e APIs profissionais!
