# Clean Architecture Project
Este projeto é uma implementação de uma arquitetura limpa (Clean Architecture) utilizando Spring Boot, MongoDB e Kafka. O objetivo é fornecer uma estrutura modular e escalável para o desenvolvimento de aplicações Java.

# Objetivo do Projeto
O objetivo principal deste projeto foi criar uma aplicação seguindo os princípios da Clean Architecture, garantindo uma separação clara de responsabilidades e facilitando a manutenção e escalabilidade do sistema.

#Estrutura do Projeto
A estrutura do projeto foi organizada de forma a seguir os princípios da Clean Architecture, separando claramente as responsabilidades em diferentes camadas:

## config: Contém as classes de configuração do Spring.
## core: Contém as interfaces e implementações dos casos de uso e entidades de domínio.
## dataprovider: Contém as implementações dos provedores de dados, como repositórios e clientes externos.
## entrypoint: Contém os controladores REST e consumidores Kafka.
# Tecnologias Utilizadas
Durante o desenvolvimento do projeto, foram utilizadas as seguintes tecnologias:

Java 17: Linguagem de programação principal.
Spring Boot 3.3.2: Framework para criação de aplicações Java.
Spring Data MongoDB: Integração com o banco de dados MongoDB.
Spring Cloud OpenFeign: Cliente HTTP declarativo para chamadas a serviços externos.
Spring Kafka: Integração com a plataforma de streaming Kafka.
MapStruct: Ferramenta para mapeamento de objetos.
Lombok: Biblioteca para reduzir o código boilerplate.
Docker: Ferramenta para criar e gerenciar contêineres.
Configuração do Ambiente
Pré-requisitos
Para configurar o ambiente de desenvolvimento, são necessários os seguintes pré-requisitos:

Java 17
Docker
Docker Compose
Configuração do Docker
Para facilitar a configuração dos serviços necessários, foi criado um arquivo docker-compose.yml que configura os seguintes serviços:

Zookeeper: Serviço de coordenação para Kafka.
Kafka: Plataforma de streaming distribuída.
Kafdrop: Interface web para visualizar tópicos Kafka.
MongoDB: Banco de dados NoSQL.
Mongo Express: Interface web para MongoDB.
Para iniciar os serviços, basta executar o comando:
