# curso-alura-intellij
<p>
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/my-study-area/curso-alura-intellij">
    <a href="https://github.com/my-study-area">
        <img alt="Made by" src="https://img.shields.io/badge/made%20by-adriano%20avelino-gree">
    </a>
    <img alt="Repository size" src="https://img.shields.io/github/repo-size/my-study-area/curso-alura-intellij">
    <a href="https://github.com/EliasGcf/readme-template/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/my-study-area/curso-alura-intellij">
    </a>
</p>
Curso de IntelliJ IDEA: aumente a sua produtividade em projetos Java

## Comandos
- `alt + 1`: abre a aba project (visualização dos arquivos do projeto)
- `alt + insert`: dentro da aba project, abre menu com opções para criar classes, arquivos ou pacotes.
- `ctrl + shift + f10`: executa a classe do arquivo atual.
- `shift + f10`: executa a classe principal do projeto.
- `f6`: dentro da aba project com a classe selecionada, abre uma caixa para mover a classe para um pacote
- `alt + shift + insert`: permite criar multiplos cursores verticalmente para serem criados usando a tecla `shift + arrow up ou arrow down`.
- `alt + insert`: permitr gerar getters, setters, construtores e etc nas classes.
- `ctrl + n`: permite pesquisar e abrir um arquivo do projeto. Também é possível abrir uma classe numa linha em específico, como por exemplo, digitando `Principal:12`
- `alt + enter`: exibe e executa dicas, com por exemplo, atribuir uma instância em uma varável.
- `ctrl + d`: duplica a linha
- `ctrl + y`: apaga a linha
- `ctrl + shif + a`: acessa uma barra de pesquisa para os comandos e funcionalidades.
- `ctrl + shif + f12`: esconde a aba project e as demais telas.
- `ctrl + b`: com o cursor posicionado no nome da classe, acessa o arquivo que possui a classe.
- `alt + arrow right ou arrow left`: percorre entre as abas dos arquivos abertos para direita ou esquerda.
- `alt + shift + x`: fecha todas as abas abertas.
- `f5`: com o cursor em cima do nome da classe, faz a copia da classe atual possibilitando a renomeação.
- `ctrl + alt + l`: reformata o código atual.
- `shift + f6`: refatora nome de variável, classe, interface e etc.
- `ctrl + shift + arrow up ou arrow down`: move a linha atual somente do contexto válido, por exemplo, uma variável criada dentro de um método somente poderá ser movida dentro do próprio método.
- `shift shift`: buscar por qualquer tipo de arquivo no projeto
- `ctrl + e`: acessar os últimos arquivos acessados
- `ctrl + shif + n`: procura por atributos e métodos dentro das classes.
- `ctrl + shift + f`: busca por um texto (conteúdo) de um arquivo.
- `ctrl + f12`: mostra a estrutura da classe, exibindo os nomes dos atributos e métodos da classe.
- `alt + f7`: (find usages) com o cursor em cima do método, verifica as ocorrências de uso do método no projeto.
- `ctrl + h`: abre a visualização da hierarquia de uma classe.
- `alt + home`: (navigation bar) navegação no projeto, semelhante a aba project, porém na barra próxima a barra de menu (breadcrumbs).
- `ctrl + alt + shift + t`: com o trecho de código selecionado (por exemplo, o método), você pode extrair o método para uma nova classe, extrair para uma super classe ou para uma interface. Também é possível passar métodos e propriedades de uma classe filha para a classe mãe através da opção `Pull Members Up ...` e da classe mãe para a classe filha através da opção `Push Members Down ...`.
- `ctrl + shift + f6`: (type migration) com a classe selecionada, permite alterar o tipo (classe) de uma propriedade de uma classe.
- `ctrl + shift + alt + s`: (project structure) abre uma janela que permite adicionar ou remover bibliotecas.
- `ctrl + w`: com o cursor no nome do método, seleciona a palavra e conforme for pressionando novamento o atalho é selecionado o método e assim progressivamente até selecionar o arquivo todo.
- `alt + shift + f9`: executa a classe em modo debug.
  - `f7`: (step into) a execução passa para o próximo passo, entrando nas implementações.
  - `f8`: (step over) a execução passa para o próximo passo, sem entrar na implementações.
  - `shift + f8`: (step out) a execução avança para o próximo passo, sem passar pelas implementações.
  - `alt + shift + f9`: (run to cursor) executa o degug na linha do cursor.
  - `alt + f8`: (Evaluate Expression) permite acessar variáveis e métodos, mostrando os seus valores.
- `ctrl + /`: comenta linha do codigo.
- `ctrl + alt + v`: depois de criar alguma instância `(new LeitorCSV())`, cria uma variável local.
- `ctrl + alt + f`: depois de criar alguma instância `(new LeitorCSV())`, cria uma nova propriedade na classe.
- `ctrl + alt + c`: depois de criar alguma instância `(new LeitorCSV())`, cria uma nova constante na classe.
- `ctrl + j`: lista os lives templates
- `ctrl + at + o`: atualiza os imports
- `ctrl + shift + alt + j`: com a palavra selecionada, seleciona todas as ocorrências da palavra criando multiplos seletores.
- `alt + j`: com a palavra selecionada, seleciona a próxima ocorrência da palavra criando multiplos seletores. Obs: para avançar uma palavra não desejada utilize a tecla `f3`. Fonte: [Stackoverflow](https://stackoverflow.com/a/30054997/6415045)
- `alt +shift + j`: após utilizar o atalho `alt + j`, volta para a palavra selecionada anteriormente.
- `alt + /`: (autocomplete de hardcode) com algumas letras digitadas e executar a combinação de teclas, completa a palavra com as possíveis ocorrências no arquivo atual. É possível repetir o comando e percorrer pelas possíveis combinações ou pressionar `enter` para aceitar a sugestão.

### Outros
- `Help > Keymap Reference`: abre a URL [https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf) com os atalhos de teclado.
- `main` ou `psvm` + `ctrl + espaço`: cria o método main dentro da classe. Ex:
```java
public static void main(String[] args) {

}
```
- `sout` + `ctrl + espaço`:  cria o método `System.out.println();`.
- `File > Settinhs ... > Keymap`: visualiza ou pesquisa os atalhos disponíveis.
- `Refactor > Encapsulate fields` ou `alt + r depois alt + r`: possibilita a adição da visibilidade das propriedades de uma classe e criação de métodos getter e setter.
- `alt + enter` com o cursor em cima do nome da classe e selecione a opção `Create Test`: abre uma caixa com as opções para criação de testes unitários.
- ao digitar `new LeitorCSV().var` e pressionar `ctrl + espaço` e depois `enter` gera uma variável com o seguinte conteúdo: `LeitorCSV leitorCSV = new LeitorCSV();`.
- ao digitar `new LeitorCSV().field` e pressionar `ctrl + espaço` e depois `enter` gera um campo `private static LeitorCSV leitorCSV;`e uma variável `leitorCSV`.
- para criar uma live template consulte `Live template` na pesquisa de actions (ctrl + shift + a) e clique em incluir. Exemplo de texto:
```java
static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger($CLASSNAME$.class);
```
Exemplo usando `$SELECTION$` para criar um `Surround with ...`:
```java
if($END$) {
    $SELECTION$
}
```
