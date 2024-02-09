# desafio-meu-emprego-api-rest
Este projeto desenvolvido em Java na IDE Eclipse faz parte do processo de busca por emprego e consiste no desenvolvimento de uma API REST utilizando Spring Boot. A fase 3 do desafio visa demonstrar habilidades no desenvolvimento de APIs utilizando uma das principais tecnologias do mercado. 


## Tecnologias Utilizadas no Projeto:
- Java
- Rest-assured
- Spring Boot
- JUnit5
- JSON Simple

  
## Fase 3: Desenvolvimento de API usando Spring
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
- Execute a clase NovaMensagemTest.java com JUnit5.

## Endpoint
"/api/message"

