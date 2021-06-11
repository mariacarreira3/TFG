# HERRAMIENTAS PARA LA CONSTRUCCIÓN AUTOMÁTICA DEL DOMINIO DE UNA ONTOLOGÍA 

Programa Python y Java para la creación de una ontología a partir de técnicas de Procesamiento de Lenguaje Natural.

## Prerequisitos
Descargar e instalar Anaconda (https://www.anaconda.com/products/individual-b)   
Anaconda instala automaticamente Python  
Librerias necesarias para el funcionamiento del primer programa: 
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

## Instalación

Descargar **PLN-TFG-Maria.py** y **TFG-Maria-Ciber** de github 
Se abre la consola de git en la carpeta en la que se desea descargar los programas y se lanza lo siguiente:
```bash
git clone https://github.com/mariacarreira3/TFG.git
```
Dentro de la carpeta TFG se vuelve a abrir la consola que deberia estar en la rama (main) cambiar a master con el siguiente comando:
```bash
git fetch && git checkout master
```
Se vuelve a lanzar el siguiente comando: 
```bash
git clone https://github.com/mariacarreira3/TFG.git
```
En la carpeta habran aparecido **PLN-TFG-Maria.py** y **TFG-Maria-Ciber**

Además la herramienta Java (**TFG-Maria-Ciber**) se puede importar desde Eclipse.  

  1. Abrir File->Import… y seleccionar Git->Projects from Git ( with smart import).  
  2. En la siguiente pantalla, hay que seleccionar “Clone URI”.  
  3. Proporcionamos la url del repositorio en el campo URI, el resto se rellenará de forma automática.
  4. Seleccionar la rama master.
  5. Al pulsar finish se descargará el repositorio.
 
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



