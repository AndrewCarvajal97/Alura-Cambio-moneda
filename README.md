# Proyecto Conversor de Moneda

## Tabla de Contenidos
- [Introducción](#introducción)
- [Características](#características)
- [Instalación](#instalación)
- [Uso](#uso)
- [Dependencias](#dependencias)
- [Contribuir](#contribuir)
- [Licencia](#licencia)

## Introducción
Este proyecto es una aplicación simple de conversor de moneda. Permite a los usuarios seleccionar de una lista de opciones de conversión de moneda disponibles y realizar las conversiones. La aplicación utiliza varios modelos para representar monedas, países y opciones de conversión, e integra APIs externas para obtener tasas de cambio en tiempo real.

## Características
- Interfaz de menú fácil de usar
- Soporte para múltiples opciones de conversión de moneda
- Integración con APIs externas para obtener las últimas tasas de cambio
- Serialización y deserialización de JSON utilizando la biblioteca Gson

## Instalación
1. **Clonar el repositorio:**
    ```sh
    git clone https://github.com/tu-usuario/conversor-de-moneda.git
    cd conversor-de-moneda
    ```

2. **Agregar dependencias:**
    Asegúrate de incluir la biblioteca Gson en el classpath de tu proyecto. Si estás usando una herramienta de construcción como Maven o Gradle, agrega la siguiente dependencia:

    **Para Maven:**
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.6</version>
    </dependency>
    ```

    **Para Gradle:**
    ```groovy
    dependencies {
        implementation 'com.google.code.gson:gson:2.8.6'
    }
    ```

3. **Compilar el proyecto:**
    Usa tu IDE o las herramientas de línea de comandos para compilar el proyecto.

## Uso
1. **Ejecutar la aplicación:**
    ```sh
    java Principal
    ```

2. **Navegar por el menú:**
    La aplicación presentará un menú con varias opciones de conversión de moneda. Usa el menú para seleccionar la opción de conversión deseada ingresando el número correspondiente.

3. **Realizar la conversión de moneda:**
    Según tu selección, la aplicación obtendrá las últimas tasas de cambio y realizará la conversión, mostrando los resultados.

## Dependencias
- **Gson**: Una biblioteca de Java para convertir objetos Java a JSON y viceversa.

## Contribuir
¡Las contribuciones son bienvenidas! Por favor, abre un issue o envía un pull request si tienes alguna mejora o nueva característica para agregar.

