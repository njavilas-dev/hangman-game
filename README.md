## 🕹️ Juego del Ahorcado en Java

Este proyecto es una implementación simple del clásico **juego del ahorcado** utilizando Java puro y la consola como interfaz de usuario.

### 🎯 Objetivo del juego

El jugador debe adivinar una palabra secreta, letra por letra, con un número limitado de intentos fallidos. Si el jugador adivina todas las letras antes de alcanzar el máximo de errores permitidos, gana. De lo contrario, pierde el juego.

### ⚙️ Características

* Entrada de palabra secreta desde consola.
* Conversión automática de la palabra a minúsculas para uniformidad.
* Visualización progresiva de la palabra a medida que se aciertan letras.
* Control de intentos fallidos (máximo de 3 por defecto).
* Validación de entrada para asegurar que solo se ingresen letras individuales.
* Mensajes de estado durante el juego: progreso, errores, éxito o finalización del juego.

### 📦 Requisitos

* JDK 8 o superior
* Consola/Terminal

### ▶️ Cómo jugar

1. Ejecuta el programa.
2. Ingresa una palabra secreta (no será ocultada, así que úsalo con otro jugador o para testeo).
3. Intenta adivinar la palabra, una letra a la vez.
4. Gana si completas la palabra, o pierde si superas los intentos fallidos.

### 🛠️ Compilación y ejecución

Sigue estos pasos para compilar y ejecutar el juego desde tu terminal:

#### 1. Guarda el archivo

Asegúrate de que el código esté guardado en un archivo llamado `App.java`.

#### 2. Compila el programa

Abre una terminal en la carpeta donde se encuentra el archivo y ejecuta:

```bash
javac App.java
```

Esto generará un archivo `App.class` si no hay errores de compilación.

#### 3. Ejecuta el programa

Una vez compilado, ejecuta el programa con:

```bash
java App
```
