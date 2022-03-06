# Repositório do Curso da udemy
## [REST API's RESTFul do 0 à AWS com Spring Boot 2.x e Docker](https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-springboot-e-docker)

Todos os códigos aqui citados foram realizados durante o curso e após ele, possivelmente melhorados ou implementadas novas funcionalidades.


### DOZER Mapper

Usado pra realizar o mapper do VO (Value Object) para Entity de maneira mais rápida.
É usado perfeitamente pra usos não "REAL TIME" ou com conversão de alguns ms. 

###--------------------------------------------------------------------

## Seção 11 - Flyway
comando usado pra executar na pasta
``` mvn clean-package spring-boot:run ```

comando pra executar as migrate
```mvn flyway:migrate ```

## Seção 12 - JSON Custom
####@JsonPropertyOrder
Usado para adicionar as ordens usando um objeto `{}` com as propriedades que vc quer que apareçam.
Usado nas classes (Veja PersonVO)

#### @JsonProperty
Usado para alterar o nome no JSON que é retornado

#### @JsonIgnore
Usado nas propriedades (atributos) para ocultar nas respostas.

###Observação

O Código gerado na seção de versionamento, se encontra em uma branch separada - chamada de "versionamento".


