# Spring Boot REST - BÁSICO

## Instruções 
Primeiro execute ese comando para verificar as dependencias do projeto:
```
mvn clean dependency:tree
mvn test
mvn clean compile
```

Verificar a versão do java:
```
java --version
```
Verificar a versão do maven:
```
mvn --version
```

## Possíveis erros:
pom.xml
```
  <properties>
      <java.version>21</java.version>
  </properties>
```
<i>Versão do java, indicada pela variável de ambiente <b>JAVA_HOME</b> NUNCA pode ser menor que indicada no arquivo <b>pom.xml</b></i><br />
Exemplo:<br />
JAVAHOME = C:\Program Files\Java\jdk-<b>20</b><br />
Versão do jdk instalada é menor que a versao usada / definida no arquivo pom.xml<br />

### Solução:
- Acesse o site, enconte a versão necessária, nesse caso a "21": https://jdk.java.net/21/
- Baixe a versão Windows / x64 ou 32 (zip) 
- Extraia o arquivo (openjdk-21.0.1_windows-x64_bin.zip) na pasta "C:\Program Files\Java"
- Atualize a variável JAVA_HOME para : C:\Program Files\Java\jdk\jdk-21.0.1
- Reinicie a máquina, caso necessário



### Database :
Criar uma base de dados com nome "dass21_db"


### Alterar dados do arquivo ".\src\main\resources\application.properties" :
#datasource
```
spring.datasource.url=jdbc:mysql://localhost:3306/dass21_db
spring.datasource.username=root
spring.datasource.password=123456
```

### Executar aplicação:
* Abrir e executar no VS Code  o arquivo ".\src\main\java\com\fiesc\restapi\RestapiApplication.java"


----------------------------------------------------------------




### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.0/maven-plugin/reference/html/#build-image)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/3.2.0/reference/htmlsingle/index.html#howto.data-access.exposing-spring-data-repositories-as-rest)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)

