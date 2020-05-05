# Implemente	as	seguintes	classes:
## 1. Classe	**ContaCorrente**
* Contém	os	seguintes	atributos	privados:
    * numero,	do	tipo	int
    * saldo,	do	tipo	double
* Contém	os	seguintes	métodos	públicos:
    * construtor, cujos	parâmetros	são	o	número	e	o	saldo	inicial	da	
    conta	corrente
    * depositar um	valor	(double)	na	conta
    * retirar um	valor	(double)	da	conta,	desde	que	o	saldo seja	
    suficiente
    * imprimir todos	os	dados	da	conta	corrente
* Possui	a	seguinte invariante: o	saldo	nunca	é	negativo.

## 2. Classe	**Cliente**
* Contém	os	seguintes	atributos privados:
    * nome,	do	tipo	String
    * conta	corrente,	do	tipo	ContaCorrente
* Contém	os	seguintes	métodos públicos:
    * construtor,	cujo	parâmetro	é o	nome	do	cliente
    * ligar uma	conta	corrente	(previamente	criada)	ao	cliente
    * depositar um	valor	(double)	na	conta do	cliente
    * retirar um	valor	(double)	da	conta do	cliente
    * imprimir os	dados	do	cliente,	o	que	inclui	o	seu	nome e	todos	
    os	dados	da sua conta	corrente

## 3. Classe	**Banco**
* Contém	somente	o	método	**main**,	com	os	seguintes	passos:
    * criar três instâncias	de	Cliente e	três respectivas instâncias	de	
ContaCorrente,	devidamente	ligadas, com	os	seguintes	dados:
        * Jandira	Silva,	conta número 84037,	saldo	inicial	
        R$2.500,00
        * Sandra	Rodrigues, conta	número	70662,	saldo	inicial	
        R$1.800,00
        * Luciana	Teixeira,	conta	número	20718,	saldo	inicial	
        R$5.000,00
    * Imprimir	os	dados	dos	três	clientes	criados
    * Retirar	R$1.000,00	da	conta	de	Jandira	Silva
    * Imprimir	os	dados	da	cliente	Jandira	Silva
    * Retirar	R$2.000,00	da	conta	de	Sandra	Rodrigues
    * Depositar	R$500,00	na	conta	de	Sandra	Rodrigues
    * Imprimir	os	dados	da	cliente	Sandra	Rodrigues
    * Retirar	R$2.000,00	da	conta	de	Sandra	Rodrigues
    * Imprimir	os	dados	da	cliente	Sandra	Rodrigues
    * Depositar	R$1.000,00	na	conta	de	Luciana	Teixeira
    * Imprimir	os	dados	da	cliente Luciana	Teixeira