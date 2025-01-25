# Trabalho Redes - Acompanhamento formulário Web com Wireshark

## Descrição do Projeto
Este projeto consiste em um formulário web que exibe conteúdo dinâmico, recebido através de um servidor web HTTP. O foco é demonstrar como o tráfego de dados pode ser monitorado utilizando o Wireshark.

## Pré-requisitos
- **Node.js e Vite** para rodar o frontend no localhost.
- **Spring Boot** para rodar o backend.
- **Npcap e Wireshark** para monitoramento local da rede.

## Instruções de Instalação

### 1. Download e Instalação do Node.js e Vite (Frontend)

#### Passo 1: Instalar o Node.js
- Acesse o site do Node.js: [https://nodejs.org/](https://nodejs.org/)
- Escolha a versão LTS (Long Term Support) e faça o download.
- Após o download, execute o instalador e siga as instruções. Isso instalará o Node.js e o npm (Node Package Manager).

#### Passo 2: Instalar o Vite
- Abra o terminal ou o prompt de comando.
- Instale o Vite globalmente com o seguinte comando:
  ```bash
  npm install -g create-vite

Para criar um novo projeto com o Vite, execute:
  ```bash
npm create vite@latest nome-do-projeto
```

Navegue até o diretório do seu projeto:
  ```bash
cd nome-do-projeto
```

Instale as dependências:
  ```bash
npm install
```

Para rodar o servidor de desenvolvimento, execute:
  ```bash
npm run dev
```

Seu frontend estará rodando no localhost (geralmente em http://localhost:3000).

### 2. Download e Instalação do Spring Boot (Backend)

#### Passo 1: Baixar o Spring Boot
- Acesse o site do Spring: [https://start.spring.io/](https://start.spring.io/)
- Preencha os campos:
  - **Project**: Maven ou Gradle (recomendo Maven)
  - **Language**: Java
  - **Spring Boot**: A versão mais recente
  - **Project Metadata**: Preencha com as informações do seu projeto (como Group, Artifact, etc.).
  - **Dependencies**: Escolha as dependências, como "Spring Web" para APIs REST.
- Clique em **Generate** para gerar um arquivo `.zip`.
- Descompacte o arquivo em um diretório e abra-o no seu editor de código favorito (por exemplo, IntelliJ IDEA ou VSCode).

#### Passo 2: Instalar o JDK
- Baixe a versão mais recente do JDK em: [https://adoptopenjdk.net/](https://adoptopenjdk.net/)
- Instale a versão 21 ou superior do JDK.
- Após a instalação, verifique se o Java foi instalado corretamente:
 
 ```bash
java -version
```

#### Passo 3: Rodar o Backend com Spring Boot
- Dentro do diretório do seu projeto Spring Boot, execute:

 ```bash
./mvnw spring-boot:run
```

Isso iniciará seu backend, geralmente em http://localhost:8080.

### 3. Download e Instalação do Npcap e Wireshark (Monitoramento de Rede)

#### Passo 1: Baixar e Instalar o Npcap
- Acesse o site do Npcap: [https://nmap.org/npcap/](https://nmap.org/npcap/)
- Baixe a versão mais recente do Npcap e instale-a. Durante a instalação, marque a opção para permitir a captura de pacotes em modo promíscuo (caso queira monitorar todo o tráfego de rede).

#### Passo 2: Baixar e Instalar o Wireshark
- Acesse o site do Wireshark: [https://www.wireshark.org/download.html](https://www.wireshark.org/download.html)
- Escolha a versão para o seu sistema operacional e faça o download.
- Execute o instalador e siga as instruções. Durante a instalação, o Wireshark pode sugerir a instalação do Npcap, que você já instalou, então apenas marque a opção para confirmar a instalação do Npcap.

#### Passo 3: Usar o Wireshark para Monitoramento de Rede
- Abra o Wireshark e selecione a interface de rede que deseja monitorar (por exemplo, Wi-Fi ou Ethernet).
- Clique em **Start** para começar a capturar pacotes de rede. Agora você pode visualizar o tráfego em tempo real.

---

Esses são os passos para instalar o **Node.js e Vite** para o frontend, **Spring Boot** para o backend, e o **Npcap e Wireshark** para monitoramento de rede.

## Autoria e Contribuições

- **Gabrielle De Oliveira**: Desenvolvimento Frontend e Monitoramento Wireshark
- **Daniel Campos**: Desenvolvimento Backend e Monitoramento Wireshark
- **Ana Carolina Soares**: Monitoramento Wireshark













