<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Textil Tech | Tech Master</title>
    <link rel="icon" href="img/LogoTextil.png" type="image/x-icon" sizes="16x16">
    <style><%@include file="../../../assets/css/jcvm.css"%></style>
</head>
<body class="flex flex-col min-h-screen bg-orchidBlossom font-poppins">
    
    <button data-drawer-target="default-sidebar" data-drawer-toggle="default-sidebar" type="button"
        class="inline-flex items-center p-2 mt-2 ml-3 text-sm text-blazeOrange rounded-lg lg:hidden">
        <span class="sr-only">Abrir</span>
        <svg class="w-6 h-6" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
            <path clip-rule="evenodd" fill-rule="evenodd"
                d="M2 4.75A.75.75 0 012.75 4h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 4.75zm0 10.5a.75.75 0 01.75-.75h7.5a.75.75 0 010 1.5h-7.5a.75.75 0 01-.75-.75zM2 10a.75.75 0 01.75-.75h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 10z">
            </path>
        </svg>
    </button>
    <aside id="default-sidebar"
        class="fixed top-0 left-0 z-40 w-64 h-screen transition-transform -translate-x-full lg:translate-x-0 bg-white">
        <div class="overflow-y-auto py-5 px-3 h-full border-r border-white">
            <a href="jcvm-index.html"
                class="flex items-center uppercase tracking-estatium p-0 text-2xl text-blazeOrange group">
                <img src="img/jcvm.png" alt="Favicon" class="h-26 w- mr-20 invert">
                <span class="ml-0 font-extrabold"></span>
            </a>

            <ul class="pt-5 mt-5 space-y-2 border-t border-blazeOrange">
                <li>
                    <a href="jcvm-index.html"
                        class="flex items-center p-2 text-base text-blazeOrange border border-blazeOrange rounded-lg hover:border-white hover:bg-blazeOrange hover:text-white group">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="currentColor"
                            class="w-6 h-6 text-blazeOrange transition duration-75 group-hover:text-white">
                            <path
                                d="M11.47 3.841a.75.75 0 0 1 1.06 0l8.69 8.69a.75.75 0 1 0 1.06-1.061l-8.689-8.69a2.25 2.25 0 0 0-3.182 0l-8.69 8.69a.75.75 0 1 0 1.061 1.06l8.69-8.689Z" />
                            <path
                                d="m12 5.432 8.159 8.159c.03.03.06.058.091.086v6.198c0 1.035-.84 1.875-1.875 1.875H15a.75.75 0 0 1-.75-.75v-4.5a.75.75 0 0 0-.75-.75h-3a.75.75 0 0 0-.75.75V21a.75.75 0 0 1-.75.75H5.625a1.875 1.875 0 0 1-1.875-1.875v-6.198a2.29 2.29 0 0 0 .091-.086L12 5.432Z" />
                        </svg>
                        <span class="ml-3">Início</span>
                    </a>
                </li>
                <li>
                    <a href="jcvm-index.html"
                        class="flex items-center p-2 text-base text-blazeOrange border border-blazeOrange rounded-lg hover:border-white hover:bg-blazeOrange hover:text-white group">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="currentColor"
                            class="w-6 h-6 text-blazeOrange transition duration-75 group-hover:text-white">
                            <path fill-rule="evenodd"
                                d="M10.5 3A1.501 1.501 0 0 0 9 4.5h6A1.5 1.5 0 0 0 13.5 3h-3Zm-2.693.178A3 3 0 0 1 10.5 1.5h3a3 3 0 0 1 2.694 1.678c.497.042.992.092 1.486.15 1.497.173 2.57 1.46 2.57 2.929V19.5a3 3 0 0 1-3 3H6.75a3 3 0 0 1-3-3V6.257c0-1.47 1.073-2.756 2.57-2.93.493-.057.989-.107 1.487-.15Z"
                                clip-rule="evenodd" />
                        </svg>
                        <span class="ml-3">Adicionar Máquina</span>
                    </a>
                </li>
                <li>
                    <a href="visualizar-maquinas"
                        class="flex items-center p-2 text-base text-blazeOrange border border-blazeOrange rounded-lg hover:border-white hover:bg-blazeOrange hover:text-white group">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="currentColor"
                            class="w-6 h-6 text-blazeOrange transition duration-75 group-hover:text-white">
                            <path fill-rule="evenodd"
                                d="M2.25 13.5a8.25 8.25 0 0 1 8.25-8.25.75.75 0 0 1 .75.75v6.75H18a.75.75 0 0 1 .75.75 8.25 8.25 0 0 1-16.5 0Z"
                                clip-rule="evenodd" />
                            <path fill-rule="evenodd"
                                d="M12.75 3a.75.75 0 0 1 .75-.75 8.25 8.25 0 0 1 8.25 8.25.75.75 0 0 1-.75.75h-7.5a.75.75 0 0 1-.75-.75V3Z"
                                clip-rule="evenodd" />
                        </svg>
                        <span class="ml-3">Visualizar Maquinas</span>
                    </a>
                </li>
            </ul>
            <ul class="pt-5 mt-5 space-y-2 border-t border-blazeOrange">
                <li>
                    <a href="textiltech-visualizarMaquinas.html"
                        class="flex items-center p-2 text-base text-blazeOrange border border-blazeOrange rounded-lg hover:border-white hover:bg-blazeOrange hover:text-white group">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="currentColor"
                            class="w-6 h-6 text-blazeOrange transition duration-75 group-hover:text-white">
                            <path fill-rule="evenodd"
                                d="M7.5 3.75A1.5 1.5 0 0 0 6 5.25v13.5a1.5 1.5 0 0 0 1.5 1.5h6a1.5 1.5 0 0 0 1.5-1.5V15a.75.75 0 0 1 1.5 0v3.75a3 3 0 0 1-3 3h-6a3 3 0 0 1-3-3V5.25a3 3 0 0 1 3-3h3.75a.75.75 0 0 1 0 1.5H7.5ZM16.72 3.53a.75.75 0 0 1 1.06 0l3 3a.75.75 0 0 1-1.06 1.06L17.25 5.06v10.19a.75.75 0 0 1-1.5 0V5.06l-2.47 2.53a.75.75 0 0 1-1.06-1.06l3-3Z"
                                clip-rule="evenodd" />
                        </svg>
                        <span class="ml-3">Sair</span>
                    </a>
                </li>
            </ul>
        </div>
    </aside>
    <div class="lg:ml-64">
        <div class="p-4">
            <div class="header mb-6"> 
                <h1 class="text-4xl font-bold">Visualizar Máquinas</h1>
                <a href="home" class="back-button">Voltar</a>
            </div>
            <!-- Barra de pesquisa -->
            <div class="search-bar-container mb-6"> 
                <form action="resultado-pesquisa-localizar-maquina" method="GET" class="flex w-full">
                    <input type="text" id="searchInput" placeholder="Pesquisar máquinas..." name="nome">
                    <button type="submit">Pesquisar</button>
                </form>
            </div>

            <table class="w-full text-center mt-4 table-auto bg-white shadow-md rounded-lg">
                <thead>
                    <tr class="bg-gray-200">
                        <th class="px-4 py-2">Nome</th>
                        <th class="px-4 py-2">Localização</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="maquina" items="${maquinas}">
                        <tr>
                            <td class="border px-4 py-2">${maquina.nome}</td>
                            <td class="border px-4 py-2">${maquina.localizacao}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
