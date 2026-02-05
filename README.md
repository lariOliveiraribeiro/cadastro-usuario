📌 Cadastro de Usuário — API REST com Spring Boot

API REST desenvolvida em **Java com Spring Boot** para gerenciamento de usuários, implementando as operações básicas de um CRUD (**Criar, Buscar, Atualizar e Deletar**).

Este projeto faz parte do meu **portfólio backend**, com foco em boas práticas de arquitetura, organização em camadas e **testes unitários**, visando oportunidades de **estágio em desenvolvimento de software**.

---
🚀 Funcionalidades

- ✔ Criar um novo usuário  
- ✔ Buscar usuário por e-mail  
- ✔ Atualizar usuário por ID  
- ✔ Deletar usuário por e-mail  

As funcionalidades são expostas por meio de **endpoints REST**.

---

 🧪 Testes Unitários

O projeto possui **testes unitários implementados na camada de Service**, utilizando:

- **JUnit 5**
- **Mockito**

### Cenários testados:
- ✔ Salvar usuário com sucesso  
- ✔ Buscar usuário por e-mail com sucesso  
- ✔ Lançar exceção ao buscar usuário inexistente  

Os testes validam as **regras de negócio de forma isolada**, sem dependência de banco de dados ou contexto Spring.

---

📋 Tecnologias Utilizadas

- 📌 **Linguagem:** Java  
- 📌 **Framework:** Spring Boot  
- 📌 **Gerenciador de dependências:** Maven  
- 📌 **Banco de dados:** Configurável (H2, MySQL, etc.)  
- 📌 **Testes:** JUnit 5 e Mockito  
- 📌 **Outros:** Lombok  
- 📌 **Controle de versão:** Git e GitHub  

---

🛠️ Como Rodar o Projeto Localmente

 📌 Pré-requisitos
- JDK 17 ou superior  
- Maven  
- IDE (IntelliJ, Eclipse ou VS Code)

📥 Clonar o repositório
```bash
git clone https://github.com/lariOliveiraribeiro/cadastro-usuario.git
📁 Acessar a pasta do projeto
cd cadastro-usuario
📦 Compilar o projeto
mvn clean install
▶️ Executar a aplicação
mvn spring-boot:run
A API estará disponível em:
➡ http://localhost:8081

📍 Endpoints Principais
Método	Rota	Descrição
POST	/usuarios	Cria um novo usuário
GET	/usuarios?email=...	Busca usuário por e-mail
PUT	/usuarios/{id}	Atualiza usuário pelo ID
DELETE	/usuarios?email=...	Remove usuário por e-mail

💡 Exemplo de Requisição
🟩 Criar usuário
POST /usuarios
Content-Type: application/json

{
  "nome": "Larissa",
  "email": "larissa@email.com"
}

🧩 Boas Práticas Aplicadas
✔ Arquitetura em camadas (Controller, Service, Repository)

✔ Separação de responsabilidades

✔ Tratamento de exceções

✔ Testes unitários focados em regras de negócio

✔ Código organizado e legível

📌 Autora
👩‍💻 Larissa Oliveira Ribeiro
Estudante de Tecnologia da Informação com foco em desenvolvimento backend.

🔗 LinkedIn: https://www.linkedin.com/in/larissa-oliveira-ribeiro
🔗 GitHub: https://github.com/lariOliveiraribeiro

📄 Licença
Este projeto é de uso livre para fins de estudo e portfólio.

