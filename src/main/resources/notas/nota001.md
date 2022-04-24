#NOTA de OBSERVAÇÃO 001
##**Aula 94 - Depreciado - implementado como query param**
## Onde encontrar?
Veja o arquivo WebConfig.java

### Observação
O curso é realizado na versão do Spring 2.3.1, entretanto como pode ser visto no pom, estamos na versão 2.5.4.
Na versão 2.5.4, o uso do .json ou .xml no final das urls já estava depreciado. Sendo necessário realizar algumas modificações para poder funcionar na versão atual. 

Segue o código da aula do professor:

```java
public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
    configurer.favorParameter(false)
        .parameterName("mediaType")
        .ignoreAcceptHeader(false)
        .defaultContentType(MediaType.APPLICATION_JSON)
        .mediaType("json", MediaType.APPLICATION_JSON)
        .mediaType("xml", MediaType.APPLICATION_XML);
}
...
```

Segue o código que foi alterado conforme link do [baeldung](https://www.baeldung.com/spring-mvc-content-negotiation-json-xml).

```java
...

public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
    configurer.favorParameter(true)
        .parameterName("mediaType")
        .ignoreAcceptHeader(false)
        .defaultContentType(MediaType.APPLICATION_JSON)
        .mediaType("json", MediaType.APPLICATION_JSON)
        .mediaType("xml", MediaType.APPLICATION_XML);
}
...
```

Desta maneira, a URL muda de ```/api/person/v1/1.xml``` para ```/api/person/v1/1?mediaType=xml``` <br />
Os restantes dos arquivos ficaram exatamente iguais. <br />

#### Acabei implementando a aula 95 sem saber. 