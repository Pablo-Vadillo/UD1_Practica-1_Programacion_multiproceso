<h1>Aplicación Contador de Vocales</h1>
Esta aplicación te permite contar las ocurrencias de las vocales (a, e, i, o, u) en un archivo de texto dado.

<h2>Estructura</h2>
La aplicación está estructurada en los siguientes paquetes y clases:


<Strong>VowelLauncher:</Strong> Esta clase ofrece un método para iniciar un nuevo proceso de Java que contará una vocal específica en un texto proporcionado.
net.salesianos.lacuesta.processes

<Strong>VowelCounter:</Strong> Un programa de Java independiente que recibe texto y una vocal como argumentos. Luego cuenta las ocurrencias de la vocal especificada en el texto y escribe el conteo en un archivo de salida.
net.salesianos.lacuesta.utils

<Strong>Utils:</Strong> Contiene métodos de utilidad para leer de un archivo de texto y para obtener el conteo de vocales de un archivo de salida.
App (Clase Principal)

La lógica principal de la aplicación está contenida aquí. Lee un archivo de texto, inicia procesos para cada línea del texto y cada vocal, espera a que todos los procesos terminen y luego muestra los resultados.
<h2>Cómo Ejecutar</h2>
Asegúrate de tener el archivo de texto requerido (src\lorem_ipsum.txt u otro de tu elección) en la ruta especificada.
<strong>Compila todas las clases de Java.</strong><br>
<strong>Ejecuta la clase App.</strong><br>
<h2>Salida</h2>
La aplicación mostrará el conteo de cada vocal encontrada en el archivo de texto especificado. El conteo se guarda en archivos de salida individuales para cada vocal, ubicados en el directorio: src/net/salesianos/lacuesta/outputs/.