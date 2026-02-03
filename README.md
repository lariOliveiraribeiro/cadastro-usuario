📌 Cadastro de Usuário (API com Spring Boot)

Uma API REST simples em Java usando Spring Boot que permite realizar as operações básicas de um CRUD (Criar, Ler, Atualizar e Deletar) de usuários.
Esse projeto foi desenvolvido como exercício prático de backend para reforçar conceitos de desenvolvimento de APIs com Spring Boot e Java.

🚀 Funcionalidades

✔ Criar um novo usuário
✔ Buscar usuário por email
✔ Atualizar usuário por id
✔ Deletar usuário por email

Essas funcionalidades são expostas via endpoints REST.

📋 Tecnologias Utilizadas

📌 Linguagem: Java
📌 Framework: Spring Boot
📌 Gerenciador de dependências: Maven
📌 Banco de dados: (configurável — H2, MySQL, etc.)
📌 Biblioteca útil: Lombok
📌 Controle de versão: Git e GitHub

🛠️ Como Rodar o Projeto Localmente
📌 Pré-requisitos

Você precisa ter instalado em sua máquina:

JDK 17 ou superior

Maven

IDE (IntelliJ, Eclipse ou VS Code)

📥 Clone o repositório
git clone https://github.com/lariOliveiraribeiro/cadastro-usuario.git

📁 Acesse a pasta do projeto
cd cadastro-usuario

📦 Instale as dependências e compile
mvn clean install

▶️ Execute a aplicação
mvn spring-boot:run


A API estará disponível em:
➡ http://localhost:8080

📍 Endpoints (Principais)
Método	Rota	Descrição
POST	/usuarios	Cria um novo usuário
GET	/usuarios?email=...	Busca usuário por e-mail
PUT	/usuarios/{id}	Atualiza usuário pelo id
DELETE	/usuarios?email=...	Remove usuário pelo e-mail

As requisições são feitas via JSON no corpo (@RequestBody) e alguns parâmetros via query (@RequestParam).

💡 Exemplos de Requisição
🟩 Criar usuário
POST /usuarios
Content-Type: application/json

{
  "nome": "Larissa",
  "email": "larissa@email.com"
}

🔍 Buscar por email
GET /usuarios?email=larissa@email.com

🧩 Observações e Boas Práticas

✔ Separei as responsabilidades em camadas (Controller, Service e Repository)
✔ Uso de validações e tratamentos de erros
✔ Estrutura limpa e fácil de entender
✔ Base para outros projetos backend

📌 Autor

👩‍💻 Larissa Oliveira Ribeiro
Estudante de Tecnologia e entusiasta em desenvolvimento backend.
LinkedIn: https://www.linkedin.com/in/larissa-oliveira-ribeiro/
GitHub: https://github.com/lariOliveiraribeiro

📄 Licença

Esse projeto é aberto e pode ser usado para aprendizado e portfólio 📍
