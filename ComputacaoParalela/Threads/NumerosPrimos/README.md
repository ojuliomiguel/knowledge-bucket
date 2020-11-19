# Computação Paralela 

## Cálculo de números primos
 
> Questão: O cálculo de números primos demanda uma carga de processamento alta que pode ser aliviada com o uso de threads. Implemente uma versão que use 10 threads para mostrar os números primos entre 2 e 1000000. Marque o tempo para comparar a versão sequencial (em anexo) e a concorrente.

### Resultados:

### Versão sequencial:

```console
my@user:~$ Tempo 3643  ms
```

#### Codigo levemente adaptado para melhor exibir os dados

```java
public static void main(String[] args) throws Exception {
    long  startTime = System.currentTimeMillis();
    String primeNumbers  = "";
    boolean flag;
      for(int i = 2; i < 1000000; i++){
        flag = false;
        for (int j = 2; (j*j <= i); j++)
          if (i%j == 0){
            flag = true;
            break;
          }
          if(!flag)
            primeNumbers += Integer.toString(i) + ", ";    
      }
    
    long totalTime = System.currentTimeMillis() - startTime; 
    
    System.out.println(primeNumbers);

    System.out.println("\n Tempo total: " + totalTime + " ms");
```

### Versão usando 10 threads

[Codigo fonte aqui](src/PrimeNumberThread.java)
[Codigo Principal App.java](src/App.java)

```console
my@user:~$ Tempo 323 ms
```
