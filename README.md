# TFG
Programa Python y Java para la creación de una ontología a partir de técnicas de Procesamiento de Lenguaje Natural

Se encontraran dos programas uno java y otro python. Para su correcto funcionamiento se debe procesar el texto en el programa Python que genera un archivo JSON. 
Despues se lanza e programa java para la creación de la ontología.

#Funcinamiento del programa Python
-Antes de lanzar la aplicación cambiar en la linea 105 la ruta del directorio ('C:/Users/admin/Desktop/TFG/final') a la ruta donde se quiere que se cree el archivo JSON
-Se lanza la aplicación, aparecerá en la consola "Text:"
-Se introduce el texto deseado en inglés y se pulsa enter
-Aparecerá en la ruta elegida el archivo data.json 

#Funcionamiento del programa Java
-Antes de lanzar la aplicación cambiar en la linea 38 la ruta en la que se quiere que se cree el fichero de ontología, acabando con el nombre de la ontología deseada (Ej: C:/Users/admin/Desktop/Ciber.owl)
-Tambien cambiar en la linea 56 la ruta en la que esta situado el archivo JSON generado por el programa anterior
-Se lanza la aplicación, al acabar se ha debido generar el fichero de la ontología en la ruta que se ha escrito en la linea 38.
-Se puede abrir la ontología creada en Protege.exe
