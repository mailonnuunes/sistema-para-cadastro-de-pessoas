# sistema-para-cadastro-de-pessoas

##Documentação do projeto.
tecnologias utilizadas: java, spring boot, spring mvc, lombok,devtools, thymeleaf e mysql.

Na tela de inicio temos um formulário de cadastro onde é solicitada as seguintes informações para quem for cadastrar uma pessoa: nome, sobrenome e usuario(Campos em branco não são valídos e o cadastrante terá um aviso na tela).

![image](https://github.com/mailonnuunes/sistema-para-cadastro-de-pessoas/assets/100615338/467cca1f-878d-4e27-a5a6-ce83d2827919)

Após a pessoa clicar no botão "Cadastrar" será enviada uma requisição http do tipo post(criação) para o banco de dados onde ele irá salvar todas as informações pertinentes.

Na páginá "Ver pessoas cadastradas" teremos uma solicitção do tipo get onde irá nos retornar todas as pessoas já cadastradas e as informações das mesmas. 
![image](https://github.com/mailonnuunes/sistema-para-cadastro-de-pessoas/assets/100615338/b52739be-f986-4619-81c2-d5614c310245)


