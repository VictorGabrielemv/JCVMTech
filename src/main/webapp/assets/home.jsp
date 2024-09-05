<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>In�cio | Jcvm | Tech Master</title>
    <link rel="icon" href="img/jcvm.png" type="image/x-icon" sizes="16x16"''>
    <link rel="stylesheet" href="css/jcvm.css">
    <style><%@include file="../../../assets/css/jcvm.css"%></style>
</head>

<body class="flex flex-col min-h-screen bg-orchidBlossom font-poppins">
    
    <%@include file="../../../assets/menu.jsp"%>
    
    <div id="content-wrapper" class="flex-1 p-6 ml-0 lg:ml-64 transition-margin duration-300 ease-in-out">
        <main class="flex-1 p-6">
            <section id="sobre" class="bg-white border-4 rounded border-blazeOrange">
                <div
                    class="gap-16 items-center py-8 px-4 mx-auto max-w-screen-xl lg:grid lg:grid-cols-2 lg:py-16 lg:px-6">
                    <div class="font-light text-nickel sm:text-lg">
                        <h2 class="mb-4 text-4xl tracking-estatium font-extrabold uppercase text-blazeOrange">
                            Sobre
                            n�s</h2>
                        <p class="mb-4">Somos a JCVM Tech, uma empresa formada por 5 membros: Maria Eduarda (Presidente - Scrum Master),
                            V�ctor Gabriel (Design Gr�fico - Front End Team Scrum), Jo�o Vitor (Banco de Dados - Team Scrum),
                            Camila Elisa (Respons�vel pelo Marketing) e Wallace (Back End - Team Scrum).<br><br>A JCVM Tech � uma
                            empresa fundada com o objetivo de transformar o que est� no papel em realidade. Trabalhamos com
                            o desenvolvimento de MRP para suporte de PCP e ch�o de f�brica, visando sempre a praticidade e
                            clareza para cada usu�rio.<br><br>Proporcionamos um crescimento sustent�vel e competitivo a longo prazo,
                            na qual � poss�vel planejar: quando, quanto, onde produzir e qual o destino do produto final.
                            Quem vai com tudo, vai al�m.</p>
                    </div>
                    <div class="grid grid-cols-2 gap-4 mt-8">
                        <img class="w-full rounded-lg"
                            src="https://flowbite.s3.amazonaws.com/blocks/marketing-ui/content/office-long-2.png"
                            alt="office content 1">
                        <img class="mt-4 w-full lg:mt-10 rounded-lg"
                            src="https://flowbite.s3.amazonaws.com/blocks/marketing-ui/content/office-long-1.png"
                            alt="office content 2">
                    </div>
                </div>
            </section>
            <section>
			<div class="py-8 px-4 mx-auto max-w-screen-xl sm:py-16 lg:px-6">
				<div class="max-w-screen-md mb-8 lg:mb-16">
					<h2
						class="mb-4 text-4xl tracking-estatium font-extrabold uppercase text-blazeOrange">Linguagens
						de programa��o</h2>
					<p class="text-nickel sm:text-xl">
						Na Textil Tech, exploramos as linguagens de programa��o essenciais
						que impulsionam a cria��o de solu��es digitais inovadoras.<br>
						<br>Desde a estrutura��o b�sica com HTML at� a interatividade
						din�mica com JavaScript, cada linguagem desempenha um papel
						crucial na constru��o de experi�ncias web robustas e funcionais.
						Nosso foco principal est� na otimiza��o da cadeia de suprimentos,
						garantindo efici�ncia e qualidade para sua empresa.
					</p>
				</div>
				<div
					class="space-y-8 md:grid md:grid-cols-2 lg:grid-cols-3 md:gap-12 md:space-y-0">
					<div>
						<div
							class="flex justify-center items-center mb-4 w-10 h-10 rounded-full bg-blazeGray lg:h-12 lg:w-12">
							<%@include file="../../../assets/img/HTML-img.jsp"%>
						</div>
						<h3 class="mb-2 text-xl font-bold text-blazeOrange">HTML</h3>
						<p class="text-nickel">HTML permite definir a estrutura b�sica
							de uma p�gina, incluindo elementos como texto, imagens e links.</p>
					</div>
					<div>
						<div
							class="flex justify-center items-center mb-4 w-10 h-10 rounded-full bg-blazeGray lg:h-12 lg:w-12">
							<%@include file="../../../assets/img/CSS-img.jsp"%>
						</div>
						<h3 class="mb-2 text-xl font-bold text-blazeOrange">CSS</h3>
						<p class="text-nickel">CSS � usado para controlar o layout, as
							cores e os estilos de todos os elementos HTML em um site.</p>
					</div>
					<div>
						<div
							class="flex justify-center items-center mb-4 w-10 h-10 rounded-full bg-blazeGray lg:h-12 lg:w-12">
							<%@include file="../../../assets/img/Java.jsp"%>
						</div>
						<h3 class="mb-2 text-xl font-bold text-blazeOrange">Java</h3>
						<p class="text-nickel">Java � amplamente utilizado em
							aplicativos corporativos, desde sistemas financeiros at�
							aplicativos m�veis.</p>
					</div>
					<div>
						<div
							class="flex justify-center items-center mb-4 w-10 h-10 rounded-full bg-blazeGray lg:h-12 lg:w-12">
							<%@include file="../../../assets/img/SQL-SVG.jsp"%>
						</div>
						<h3 class="mb-2 text-xl font-bold text-blazeOrange">SQL</h3>
						<p class="text-nickel">SQL � essencial para consultas
							complexas, inser��es de dados e opera��es de atualiza��o em
							bancos de dados..</p>
					</div>
					<div>
						<div
							class="flex justify-center items-center mb-4 w-10 h-10 rounded-full bg-blazeGray lg:h-12 lg:w-12">
							<%@include file="../../../assets/img/JSP-SVG.jsp"%>
						</div>
						<h3 class="mb-2 text-xl font-bold text-blazeOrange">JSP</h3>
						<p class="text-nickel">JSP � uma forma de implementar o
							conte�do da p�gina din�mica do lado do servidor.</p>
					</div>
				</div>
			</div>
		</section>
            <section class="bg-blazeOrange rounded">
                <div class="py-8 px-4 mx-auto max-w-screen-xl lg:py-16 lg:px-6">
                    <div class="max-w-screen-lg text-white sm:text-lg">
                        <h2 class="mb-4 text-4xl tracking-estatium font-extrabold text-white uppercase">Nosso objetivo
                        </h2>
                        <p class="mb-4 font-light">
                            A JCVM Tech visa um bom desempenho do maquin�rio. Somos especialistas em desenvolver MRP
                            para suporte de PCP e ch�o de f�brica, de forma clara e pr�tica para os usu�rios. Temos o
                            objetivo de transformar o que est� no papel em realidade. Buscamos a otimiza��o de processos
                            e aumento da produtividade, redu��o de custos e otimiza��o de recursos, inova��o e vantagem
                            competitiva e seguran�a da informa��o e prote��o de dados. Venha investir em solu��es
                            tecnol�gicas com a JCVM Tech!
                        </p>
                    </div>
                </div>
            </section>
            <section>
                <div class="py-8 px-4 mx-auto max-w-screen-xl lg:py-16 lg:px-6">
                    <div class="mx-auto max-w-screen-sm text-center mb-8 lg:mb-16">
                        <h2
                            class="mb-4 p-4 text-4xl tracking-estatium uppercase font-extrabold text-blazeOrange bg-white shadow-lg rounded-lg">
                            Nosso time
                        </h2>
                    </div>
                    <div class="mx-auto">
                        <div class="items-center bg-white rounded-lg shadow-lg sm:flex border-4 border-blazeOrange">
                            <img class="w-full rounded-lg" src="img/foto equipe.png" alt="L�der">
                        </div>
                    </div>
                </div>
            </section>
            <section class="bg-blazeOrange rounded">
                <div class="py-8 px-4 mx-auto max-w-screen-xl lg:py-16 lg:px-6">
                    <div class="max-w-screen-lg text-white sm:text-lg">
                        <h2 class="mb-4 text-4xl tracking-estatium font-extrabold text-white uppercase">Nossos valores
                        </h2>
                        <ol class="mb-4 font-light">
                            <li>Inova��o: Comprometimento com a cria��o de solu��es tecnol�gicas avan�adas que atendam
                                �s necessidades em constante evolu��o da ind�stria t�xtil;</li>
                            <br>
                            <li>Qualidade: Foco incessante na entrega de produtos e servi�os que superem as expectativas
                                dos clientes;</li>
                            <br>
                            <li>Transpar�ncia: Manter uma comunica��o clara e honesta com nossos clientes, parceiros e
                                colaboradores;</li>
                            <br>
                            <li>Sustentabilidade: Promover pr�ticas que minimizem o impacto ambiental e contribuam para
                                o desenvolvimento sustent�vel;</li>
                            <br>
                            <li>Excel�ncia no Atendimento: Prover um suporte excepcional, garantindo que nossos clientes
                                obtenham o m�ximo benef�cio de nossas solu��es.</li>
                        </ol>
                    </div>
                </div>
            </section>
        </main>
        <footer class="bg-white rounded-lg shadow m-4">
            <div class="w-full mx-auto max-w-screen-xl p-4 md:flex md:items-center md:justify-between">
                <span class="text-sm text-blazeOrange sm:text-center">Copyright &copy; 2024 | Estatium
                </span>
                <ul class="flex flex-wrap items-center mt-3 text-sm font-medium text-blazeOrange sm:mt-0">
                    <li>
                        <a href="#sobre" class="hover:underline me-4 md:me-6">Sobre</a>
                    </li>
                    <li>
                        <a href="https://www.instagram.com/estatium_?igsh=MWFiejg1YTBpNDlmcw=="
                            class="hover:underline">Instagram</a>
                    </li>
                </ul>
            </div>
        </footer>
    </div>
    <script src="js/estatium.js"></script>
</body>

</html>