# Escreva	um	código	Java	composto	pelas	seguintes	classes:
## 1. Classe	**Semaforo**
- Atributo:	cor,	representada	com	um	valor	inteiro	==> 0	(verde),	1	
(amarelo)	ou	2	(vermelho),	sendo	o	valor	inicial	igual	a	2.
- Métodos: 
    * MudaProximaCor:	sem	parâmetros	e	sem	retorno	==>	
muda	a	cor	atual	do	semáforo para	a	próxima	cor (se	
estiver	verde,	fica	amarelo;	se	estiver	amarelo,	fica	
vermelho;	se	estiver	vermelho,	fica	verde).
    * MudaCorFixa:	com	parâmetro	inteiro,	sem	retorno	==>	
muda	a	cor	atual	do	semáforo	para	a	cor	fornecida	como	
parâmetro.
    * MostraCor:	sem	parâmetro,	com	retorno	inteiro	==>	
retorna	a	cor	atual	do	semáforo.
## 2. Classe	**Controle**
1. Contém o	método	**main** com	os	seguintes	passos:
    * Imprime	a	cor	do	semáforo
    * Repete	10	vezes	as	seguintes	operações:
        1. Muda	a	cor	atual	do	semáforo	para	a	próxima	cor
        2. Imprime	a	cor	do	semáforo
    * Fixa	a	cor	do	semáforo	em	amarelo
    * Imprime	a	cor	do	semáforo
