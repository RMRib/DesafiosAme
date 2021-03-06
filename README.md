# Desafios Ame

## Challenge API

- O desafio API foi executado utilizando SoapUI e também um framework para testes BDD em API chamado **Karate**, para visualiza-lo basta importar o projeto **br.com.desafiosAME.API**
- Executar o projeto com: _mvn clean test -Dtest=KarateRunner_

- Relatórios estarão disponíveis em _/target/surefire-reports/_

- Detalhes do Karate desponíveis [Aqui](https://github.com/intuit/karate)

## Challenge Front

- O desafio foi executado utilizando Java + Selenium + Cucumber para definição das features e codificação dos testes, é o projeto **br.com.desafiosAME.front**

- Utilizei o framework **Allure** report para geração de relatórios, para consulta-lo é necessário fazer a instalação no PC onde o teste será executado, detalhes da instalação uso e configuração do Allure disponíveis [Aqui](https://docs.qameta.io/allure/#_installing_a_commandline)

- Executar os testes com: _mvn clean test_

- Para geração do relatório, após a instação do pacote Allure e execução do comando acima, executar o comando: _allure serve /home/path/to/project/target/surefire-reports/_ no terminal


## CI - GitHub
- Criei um workflow simples de CI utilizando o _"actions"_ do proprio GitHub, irá garantir que os testes(somente API por enquanto) sejam executados em cada push que for executado na **Master**
