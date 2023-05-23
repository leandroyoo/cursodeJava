# cursodeJava
Fiz um repositório na intenção de salvar meus projetos feitos na linguagem Java para poder consultar quando houver necessidade


Meu Primeiro Programa
---
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/b45c294f-5553-417a-9a19-dfe60138917f)


Main = Principal
*Ponto de entrada - entry point --> é o ponto onde todos sistemas dão inicio ao projeto

*A programção se resume em manipular dados 
*Dados são amarzenados em variáveis

Metodos/Funções --> Métodos são instruções que definem para o programa executar 
ex:
system.out.println("");


Propriedadadess/Váriaveis
São onde iremos armazenar dadps pra manipurlarmos no futuro


variaveis
---


tipos de erros
---

funções
---

Projeto da Calculadora
---





Parte 1 do projeto (definindo as condições)
-----
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/9c41d20c-21b6-403a-9597-f6605f6cc148)




as  condições do else e  else if são para trazer para o projeto as estruturas condicionais que vão fazer a devida seleção de acordo com a seleção da respectiva função e sua passagem de parametro 

Parte 2 do projeto (criando as funções)
----
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/7fa2a9a5-c396-4721-b5f8-9d034630c220)

então temos as funções de soma, subtração, divisão


Como rodar um programa Java no Terminal
---------



![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/29907eba-1c3e-4bd1-a81f-606918d4d7d6)

se observamos atentamente apos executar a função e passar seu respectivo parametro ele retorna o valor


1 cd (caminho)
------
2 javac calculate.java
------
3 dir
------
4 java calculate
-------










//////


Projeto da MegaSena (LOOPS)
----
Estrutura While
----
fazendo com a estrutura While(enquanto) temos o seguinte resultado:

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/ffaa6e5c-96c6-4d79-9d3a-5afd69f64e8c)







Estrutura for
---
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/04efacc8-4144-4496-97e1-47048989badf)



.
----

.
----



Importação e Packpages
-----
podemos importar os pacotes como podemos ver o import java.util.radom; 
que é basicamente uma biblioteca java


e podemos também criar um arquivo dentro da pastar src como exemplo User e usar ele no nosso projeto.

e podemos também criar uma packpage para criar esse arquivo User e fazer a importação dele no programa principal.


Main
---
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/05dd4c6c-250c-4d86-80ae-9fc02aef0c5a)


User
---
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/b17f9702-1656-4301-953e-001958e1bebe)



Packpage User
--
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/5202c1ac-ec86-4159-948b-019279ebe897)

quais são as diferenças
--
quando escrevemos user na tela principal(main) ele vai perguntar se queremos aquele que está na pasta do main ou na packpage

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/d555ef73-55b3-4b2b-a6ce-feeac1447397)

se escolhermos a opção da packpage ele vai importar observer na linha 1 

import co.leandroariel.principal.User;

User user = new User();
acima temos o pacote e o nome da classe onde ele se encontra

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/e030156b-41bf-430b-9a63-53850b9ba003)



...
---

...
---


Java interativo
----
Vamos tornar o Java interativo primeiro importamos a bibliote Scanner

linha 1 
import  java.util.Scanner;

depois declaramos ela no main 
    Scanner scanner = new Scanner(System.in);

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/30724166-c71f-43d3-a3d1-1c409a0cf620)


o scaner e uma classe do java que permite interagimos com ele.
vamos ver como fazermos essa interação 



usaremos o scanner com o método nextLine();

nextLine espera um input de um novo dado

ou seja a variavel  name do tipo String  vai se tornar um input

   String name =  scanner.nextLine();

e após isso se dermos um print 

  System.out.println(name);

ela vai escrever o dados que foi inserido nesse input

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/326847c2-40f1-4b6c-af67-ec9ca9885b85)



em execução teremos o seguinte 
escrevendo ola mundo na variavel name do tipo string teremos com print ola mundo

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/76df1db7-91ea-431f-b4f2-27debd117627)



podemos melhorar o código trazendo
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/72d806fa-b4c4-439c-af01-6ff915b79aea)




e para ficar mais interessante vamos usar-lo na linha de comando e teremos isso 

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/eeb14548-c670-4c2b-b225-98c2d720efa1)

...
----
...
---
...
---

Tipos Primitivos
-----
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/da8394a6-1cb5-48d1-83db-363b152b57b0)

...
----
Scopo de variavel
---
observer que a variavel x vai dar erro na linha 10


![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/a1b8e620-6d3b-49bd-9dfe-a7ad63ce2b1b)

isso porque ela foi declarada dentro do bloco então ela é uma váriavel local
para que esse código venha funcionar teremos que declarar ela fora do bloco tornando ela uma variavel global

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/474d23b7-b096-4436-b6ab-5eb8713fdee6)

...
----
Visibilidade
---
O conceito de visibilidade serve basicamente a grosso modo como um conceito de permissões.

se observamos o código

teremos a grosso modo uma variavel 
da linha 4 
static int x;
essa variavel será acessada normalmente dentro da class App

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/5ca1dec1-aa97-49f3-a552-0073d2c6f538)

Mas agora observe dentro de outro packpage como se comporta se tentarmos acessar a mesma váriavel
ela não consiguirá acessar porque a variavel int x está declarada como (default) 
observe:

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/fa27b4f3-dffd-4d06-a95d-21ca1f5c3aea)
.
--

agora observe se acessarmos aquela mesma variavel em uma uma classe chamada house que será criada também em src 
Já obteremos exito porque dentro da mesma pasta a variavel declarada como default consegue ser acessada 
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/fb44b113-502d-478e-94d9-c827ff8ef9d4)



Como resolver isso ?
--
Então para obtermos uma solução devemos mover para a pasta co.leandroariel o arquivo App
entao teremos :


 No caminho co.leandroariel teremos o arquivo App.java
 
 
 No caminho co.leandroariel.princiapal teremos o arquivo User.java
 
 
 ![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/f2cde600-815b-41ed-b006-839890d05bd9)


Então após isso declararemos a váriavel como publica observer na linha 7 

![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/e7a13cd0-e7aa-4a60-9012-9a90eeeb69a1)

Depois disso não podemos esquecer de importar na User.java o arquivo App.java


Então poderemos acessar normalmente a váriavel int x do arquivo App.java no Aquivo User.java

    
    
![image](https://github.com/leandroyoo/cursodeJava/assets/94478634/bc500186-aa0d-4c41-a178-3ac15370ca15)

 
    observer na linha 6 não há nenhum tipo de erro:






