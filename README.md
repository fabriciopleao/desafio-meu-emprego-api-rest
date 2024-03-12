# projeto-api-spring-rest
Projeto destinado à criação de uma API utilizando Spring Boot, e utilizar a tecnologia Restassured para validações da mesma.


## Tecnologias Utilizadas no Projeto:
- Java
- Rest-assured
- Spring Boot
- JUnit5
- JSON Simple

  
## Desenvolvimento de API usando Spring
Desenvolvimento de uma API REST utilizando Spring Boot. O endpoint foi implementado e validado, garantindo que o status HTTP 200 seja retornado e que o corpo da resposta contenha a mensagem esperada.

      Mensagem esperada: Eu posso conquistar tudo o que eu me comprometo.

## Instruções para executar o projeto api-spring
- Clone este repositório.
- Abra o prompt de comando.
- Navegue até a pasta localizado o projeto, e execute esse comando para rodar a aplicação: mvn spring-boot:run
- Abra o projeto em uma IDE Java (Eclipse de preferência).
- Caso tenha problema com porta do servidor, vá em application.properties na package src/main/resources e digite o seguinte comando: server.port=*informe a porta desejada*.
  Exemplo: server.port=*8080*.


## Instruções para executar o projeto api-spring-restassured
- Abra o projeto.
- Verifique a porta do servidor se está correta.
- Execute a classe NovaMensagemTest.java com JUnit5.

## Endpoint
"/api/message"

