# EJERCICIO

Tomando de referencia los temas vistos en clase realizar un ejercicio que permita almacenar la 
información de los cadetes y docentes, indicando sus datos básico como cédula, nombre y 
apellido.
En el caso específico de los cadetes se requiere saber en qué rango se encuentran y mostrar el 
cadete con mayor y menor edad.
En el caso de los docentes se requiere saber su nivel de formación (pregrado, especialización, 
magister o doctor ) y se debe contar cuantos docentes hay por cada nivel de formación.

# Desarrollo

## 1) Pre-requisitos
* Java 1.7 ó superior
* [Maven](http://maven.apache.org/) en mi caso tengo **Apache Maven 3.2.2** instalado en mi sistema
* Un editor de texto, uso por ejemplo [vim](http://www.vim.org/)


## 2) Creacion del proyecto
Este proyecto lo voy a crear usando maven, basicamente es mas conveniente generar los proyectos desde arquetipos para facilitar su edicion, en este caso es un arquetipo básico, desde la linea de comando ejecuto:

    mvn archetype:create \
     -DgroupId=org.unijac.ingesoft.3.ejecrcio1 \
     -DartifactId=Ejercicio1 \
     -DarchetypeArtifactId=maven-archetype-quickstart

esto genera una estructura de directorios como:

    Ejercicio1
    ├── pom.xml
    ├── readme.md
    └── src
        ├── main
        │   └── java
        │       └── org
        │           └── unijac
        │               └── ingesoft3
        │                   └── ejercicio1
        │                       └── App.java
        └── test
            └── java
                └── org
                    └── unijac
                        └── ingesoft3
                            └── ejercicio1
                                └── AppTest.java

## 3) Creacion del repositorio local "este es un paso opcional"

para el manejo de versiones voy a usar [git](http://git-scm.com/)

1. Primero inicializo el repositorio. en mi caso entro al directorio Ejercicio1 y ejecuto:
    
       git init
    
2. Despues agrego un archivo llamado .gitignore, el contenido de este archivo es:
    
       target/
       build/
       .gradle
       datanucleus.log
       .DS_Store
       out
       *.iml
       *.ipr
       *.iws
       .idea
       .settings
       .classpath
       .project%
              
3. agrego los archivos al repositorio:

       git add .gitignore pom.xml readme.md src

4. los comandos basicos de git se encuentran en el home page de [git](http://git-scm.com/), recomiendo el uso de un manejador de versiones, cvs, subversion, perforce, git, Mercurial, Claear Case, ...

## 4) Creacion de las clases necesarias para satisfacer el requerimiento.
