QuickSort es un algoritmo de ordenamiento eficiente basado en la estrategia de dividir.
Se elige un pivote, se particiona el arreglo en dos: elementos menores (o iguales) al pivote por un lado, y mayores por otro. 
Luego se aplica QuickSort recursivamente a cada partición hasta que las sublistas tienen tamaño 0 o 1.

Cómo funciona en esta implementación:
1. Se selecciona el pivote: se toma el elemento en la posición 'high' (última posición del subarreglo) como pivote.  
2. Partición:  
   - Se mantiene un índice 'i' para la posición de los elementos menores, y se recorre 'j' desde 'low' hasta 'high-1'.  
   - Si 'arreglo[j]' es menor o igual al pivote, se incrementa 'i' y se intercambian 'arr[i]' y 'arr[j]'.  
   - Al final, se coloca el pivote en su posición correcta.  
3. Recursión:  
   - Se llama 'quickSort' para el subarreglo izquierdo (desde 'low' hasta 'i') y para el subarreglo derecho (desde 'i + 2' hasta 'high'), dependiendo de cómo se particiona exactamente.  
4. Este proceso se repite hasta que la sublista tenga tamaño 1 o 0.

