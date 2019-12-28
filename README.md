# Desafios Ame

## Challenge API

- O desafio API foi executado utilizando SoapUI e também um framework para testes BDD em API chamado **Karate**, para visualiza-lo basta importar o projeto maven br.com.desafiosAME.API
- Executar o projeto com _mvn clean test -Dtest=KarateRunner_

- Relatórios estarão disponíveis em _/target/surefire-reports/_

- Detalhes do Karate desponíveis [Aqui](https://github.com/intuit/karate)

## Challenge Front

- O desafio foi executado utilizando Java + Selenium + Cucumber para definição das features e codificação dos testes

- Utilizei o framework **Allure** report para geração de relatórios, para consulta-lo é necessário fazer a instalação no PC onde o teste será executado, detalhes da instalação uso e configuração do Allure disponíveis [Aqui](https://docs.qameta.io/allure/#_installing_a_commandline)
- Para geração do relatório, após a instação do pacote, executar o comando: _allure serve /home/path/to/project/target/surefire-reports/_

- Executar os testes com: _mvn clean install_
