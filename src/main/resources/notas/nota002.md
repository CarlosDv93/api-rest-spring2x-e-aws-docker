#SEÇÃO 14 - HATEOAS

Como estou usando uma versão superior à versão do curso, neste caso,
precisamos seguir o guide do SPRING HATEOAS, que vc pode achar [aqui](https://docs.spring.io/spring-hateoas/docs/current/reference/html/#migrate-to-1.0.changes.representation-models).

Como pode ser visto no link, e transcrevo aqui: 

```text
ResourceSupport is now RepresentationModel
Resource is now EntityModel
Resources is now CollectionModel
PagedResources is now PagedModel
```

Isso faz que com que alteremos algumas das coisas do curso.

##### OBS.: NÃO CONSEGUI USAR A VERSÃO 1.12.1 do HATEOAS. 

## Aula 101

Nesta aula, foi adicionada uma nova config no application.properties
````text
spring.jackson.default-property-inclusion=non_null
````
e para yaml, ele adicionou:
````java
 public YamlJacksonToHttpMessageConverter() {
        super(new YAMLMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL), MediaType.parseMediaType("application/x-yaml"));
    }
````
na classe do serialization.

Entretanto, nos meus testes não aconteceu como aconteceu nos endpoints do professor. 
Com ela ou sem ela, não houve diferença aparente nos endpoints.
Mas, por desencargo, eu preferi adicionar ela assim mesmo.

