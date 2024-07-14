                                                  Foro Alura

Es una aplicación de foro diseñada para comunicarse y debatir entre usuarios mediante la creación de tópicos en el que se pueden responder a los mismos.
También permite realizar las siguientes tareas:

- Registrar y autenticar usuarios mediante JSON WEB TOKEN.
- Crear, modificar y eliminar tópicos.
- Responder a tópicos existentes.
- Mostrar lista de usuarios y de tópicos.

## Herramientas utilizadas ⚒

- Java 17
- Spring Boot
- Spring Security
- MYSQL
- JPA
- JWT 
- Insomnia

Algunos de los Endpoints son los siguientes:
- /login: Endpoint para autenticar usuarios. 
- /usuarios: Endpoint para listar usuarios mediante un token JWT.
- /topicos: Endpoint para la crear, modificar y eliminar tópicos.

Ej: Para loguearse se puede realizar de la siguiente forma:

## Login

POST http://localhost:8080/login

Body:

{
    "username": "email",
    
    "password": "contraseña"
}

Respuesta:

{
    "token": "abcdfg12346mgtr"
}

  ![Badge-Spring](https://github.com/user-attachments/assets/6ca7a171-ce0c-4728-9083-74170acbc841)
