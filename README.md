# HERRAMIENTAS PARA LA CONSTRUCCIÓN AUTOMÁTICA DEL DOMINIO DE UNA ONTOLOGÍA 

Programa Python y Java para la creación de una ontología a partir de técnicas de Procesamiento de Lenguaje Natural.

## Instalación

Descargar e intalar Anaconda (https://www.anaconda.com/products/individual-b)  
  - Paso 1 : Instalar spaCy  
   En la consola de Anaconda se lanza el siguiente comando
   ```bash
   conda install -c conda-forge spacy
   ```
  - Paso 2 : Instalar el modelo de lenguaje  
   En la consola de Anaconda se lanza el siguiente comando
  ```bash
   python -m spacy download en_core_web_md # larger English model 
   ```
## Estructura directorios

En la carpeta se encuentran dos herramientas cuyo objetivo es la creación de una ontología.  
  
El directorio **PLN-TFG-Maria.py**: programa Python cuyo objetivo es la generación de un archivo JSON a partir del procesamiento de un texto mediante técnicas de Procesamiento del Lenguaje Natural.  
  
La carpeta **TFG-Maria-Ciber**: proyecto java para la creación de una ontología partiendo del archivo JSON generado por la herramienta anterior.  

## Uso

Se encontraran dos programas uno java y otro Python. Para su correcto funcionamiento se debe procesar el texto en el programa Python que genera un archivo JSON. 
Despues se lanza e programa java para la creación de la ontología.

## Uso programa Python
  - Abrir proyecto en editor de Python, por ejemplo Visual Studio Code
  - Antes de lanzar la aplicación cambiar en la linea 105 la ruta del directorio ('C:/Users/admin/Desktop/TFG/final') a la ruta donde se quiere que se cree el archivo JSON.  
  - Se lanza la aplicación, aparecerá en la consola "Text:".  
  - Se introduce el texto deseado en inglés y se pulsa enter.  
  - Aparecerá en la ruta elegida el archivo data.json.   


## Uso programa Java
  - Abrir proyecto en eclipse
  - Antes de lanzar la aplicación cambiar en la linea 38 la ruta en la que se quiere que se cree el fichero de ontología, acabando con el nombre de la ontología deseada (Ej: C:/Users/admin/Desktop/Ciber.owl).  
  - Tambien cambiar en la linea 56 la ruta en la que esta situado el archivo JSON generado por el programa anterior.  
  - Se lanza la aplicación, al acabar se ha debido generar el fichero de la ontología en la ruta que se ha escrito en la linea 38.  
  - Se puede abrir la ontología creada en Protege.exe.  



