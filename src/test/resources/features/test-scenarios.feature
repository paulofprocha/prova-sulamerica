Feature: Cadastro e login de usuário na aplicação

  Background:
    Given que o browser foi iniciado

  Scenario: Realizar cadastro na aplicação
    Given o usuario esta na pagina inicial
    When realizar o cadastro do usuario
    Then a mensagem de retorno deve ser validada

  Scenario: Realizar login na aplicação
    Given o usuario esta na pagina de login
    When realizar o login com o usuario
    Then a mensagem de retorno deve ser validada