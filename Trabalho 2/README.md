# Acrescente	as	seguintes classes ao	projeto	organizado nos	pacotes	Matematica	e	Especialista	que	contêm,	respectivamente,	as	classes	Circulo	e	Arquiteto, estudadas	em	aula:

## 1. Classe	**Retangulo**
* Contida no	pacote	Matematica.
* Contém	os	seguintes	atributos	privados	do	tipo	float:	**ladoH** e	
**ladoV**.
* Contém	os	seguintes	métodos	públicos:
    * **definir_lados**:	atribui	dois	valores fornecidos	como	
parâmetros aos	atributos **ladoH** e	
**ladoV**.
    * **area**:	retorna	a	área	de	um	retângulo	cujas	medidas dos lados	
são dadas	por	**ladoH** e	
**ladoV**.
    * **perimetro**:	retorna	o	perímetro	de	um	retângulo cujas	
medidas	dos	lados	são	dadas	por	**ladoH** e	
**ladoV**.
d. Possui	a	seguinte invariante: as	medidas	dos	lados	são	positivas.

## 2. Classe	**EngenheiroCivil**
* Contida no	pacote	Especialista.
* Contém	o	método	**exibir_dados_pessoais** de	forma	análoga	à	
classe	Arquiteto.
* Contém	o	método	**main** com	os	seguintes	passos:
    * Chama	o	método	**exibir_dados_pessoais**.
    * Chama	o	método	**definir_lados** da	classe	Retangulo	com	os	
valores	4.7	e	8.2	como	parâmetros.
    * Chama	os	métodos	**area** e	**perimetro** da	classe	Retangulo e	
imprime	os	resultados	dessas	chamadas.
