<h1 align = "center"> Estágio Target Sistemas - 2024 </h1><br>

<h2> &#128269; Sobre </h2>

<br><p>Resolução dos desafios para vaga de estágio na Target Sistemas, uma empresa de tecnologia focada em atender necessidades do mercado de distribuição!</p><br>

<h2> &#128296; Dependências e execução </h2>

<br><ol>
   <li>Faça o download do JDK <a href="https://www.oracle.com/br/java/technologies/downloads/" target="_blank">clickando aqui</a>.</li>
   <li>Configure o JDK em sua máquina</li>
   <li>Faça o download do projeto e abra o terminal em <code>/src</code>.</li>
   <li>Com o terminal aberto, insira os comandos em sequência:</li>
</ol>

 	javac Main.java  
<br>

	java Main

<h2> &#129504; Resolução </h2>

<h3>Questão 1</h3>
<p>Para resolver a questão 1, apenas traduzi o pseudo código disponibilizado na questão para uma versão válida em java. Nessa questão não foi necessário interagir com o usuário, o valor é apenas retornado para ser usado no main.</p>

    private static int sumOutput()
    {
        int INDICE = 13, SOMA = 0, K = 0;

        do
        {
            K += 1;
            SOMA += K;
        }
        while (K < INDICE);

        return SOMA;
    }

<h3>Questão 2</h3>
<p>Desenvolvi uma implementação padrão para realizar a sequência de Fibonacci. A unica preocupação foi realizar a verificação da entrada na sequência, que retorna true ou false dependendo da situação.</p>

    private static boolean estaEmFibonacci(int numEntrada)
    {
        int ant1 = 0, ant2 = 1;

        while (ant1 + ant2 <= numEntrada)
        {
            int fibonacci = ant1 + ant2;

            if (fibonacci == numEntrada) {return true;}

            ant1 = ant2;
            ant2 = fibonacci;
        }

        return false;
    }

<h3>Questão 3</h3>
<p>Aqui eu procurei pelo fator de crescimento de cada sequência, que estava sempre variando entre cada situação</p>
<ul>
	<li>a) 1, 3, 5, 7, 9 - Sequência com fator de crescimento costante (sempre de 2 em 2)</li>
 	<li>b) 2, 4, 8, 16, 32, 64, 128 - Sequência constantemente tendo o seu valor atual multiplicado por 2</li>
	<li>c) 0, 1, 4, 9, 16, 25, 36, 49 - Sequência em que o fator de crescimento crescia em 2 a cada número (5, 7, 9, 11, 13...)</li>
	<li>d) 4, 16, 36, 64, 100 - Progrssão aritmética em que o fator de crescimento é aumentado em 8 a cada novo número (12, 20, 28, 36...)</li>
	<li>e) 1, 1, 2, 3, 5, 8, 13 - Sequência de Fibonacci</li>
	<li>f) 2,10, 12, 16, 17, 18, 19, 200 - Não há uma norma de crescimento, mas sim uma sequência de números que iniciam com "D"</li>
</ul>

<h3>Questão 4</h3>
<p>Eu inicialmente ligaria 2 dos 3 interruptores e iria verificar as lâmpadas. Após saber quais lâmpadas estavam acessas, retornaria a sala e desligaria 1 dos interruptores para poder ligar o outro que estava apagado desde o início. Com isso, eu saberia qual interruptor controla a lâmpada que nunca apagou, qual controla a lâmpada que apaguei ao retornar e qual controla a que foi acesa or último.</p>
<img src="https://github.com/Brevex/Estagio-Target-Sistemas-2024/blob/c4d2916f9b4371dadd441528cbf0eb9507cef34f/image.jpg">

<h3>Questão 5</h3>
<P>A forma mais prática que achei para resolver esse problema foi simplesmente transformar a string em um array de caracteres e imprimir esse array do final para o início com base em seu tamanho. Isso evita ter que criar variáveis temporárias para armazenar os caracteres e simplifica a função para apenas 1 loop.</P>

    private static void inverterPalavra(String inputString)
    {
        char[] stringChars = inputString.toCharArray();
        int tamString = stringChars.length - 1;

        for (int charAtual = tamString; charAtual >= 0; charAtual--)
        {
            System.out.print(stringChars[charAtual]);
        }
    }

<br><h3 align = "center"> - By <a href = "https://www.linkedin.com/in/breno-barbosa-de-oliveira-810866275/" target = "_blank">Breno</a> - </h3>
