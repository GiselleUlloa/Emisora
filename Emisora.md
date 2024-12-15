
# 📻 **Emisora Giselle** 🎶

**Emisora Giselle** es una aplicación en Java diseñada para gestionar emisoras de radio. Permite a los usuarios ingresar, listar, eliminar y modificar emisoras con diversos atributos, como el canal, la contraseña, el país, la descripción del programa y la marca. 

¡Todo esto a través de una sencilla interfaz en la consola! 😎

## 📋 **Características**:
- **📥 Ingresar emisora**: Añadir nuevas emisoras con su canal, contraseña, país, descripción y marca.
- **📜 Listar emisoras**: Ver todas las emisoras almacenadas en la lista.
- **❌ Eliminar emisora**: Eliminar una emisora por su contraseña.
- **✏️ Modificar emisora**: Cambiar los detalles de una emisora existente.

## ⚙️ **Requisitos**:
- **Java 8 o superior** ☕
- IDE como [NetBeans](https://netbeans.apache.org/) o [IntelliJ IDEA](https://www.jetbrains.com/idea/) 💻

## 🚀 **Instalación**:

1. **Clona este repositorio** o **descarga el archivo Java**.
2. **Abre el proyecto** en tu IDE favorito (NetBeans, IntelliJ, etc.).
3. **Ejecuta el programa**: Solo necesitas ejecutar la clase `Emisoragiselle` para comenzar a usarlo.

## 🖥️ **Uso**:

Al ejecutar la aplicación, el programa interactuará contigo a través de la consola, mostrándote las opciones disponibles:

### Opciones disponibles:
- **1️⃣** Ingresar nueva emisora.
- **2️⃣** Listar todas las emisoras.
- **3️⃣** Eliminar emisora.
- **4️⃣** Modificar emisora.
- **0️⃣** Salir del programa.

### Ejemplo de ejecución:

1. **Ingresar emisora**:
   ```plaintext
   Ingrese el canal:
   radioX
   Ingrese la password:
   pass123
   Ingrese país:
   Colombia
   Ingrese descripción:
   Programa de música
   Ingrese la marca:
   MarcaX

   📡 **Emisora creada:**
   Canal: radioX
   Contraseña: pass123
   País: Colombia
   Descripción: Programa de música
   ```

2. **Listar emisoras**:
   ```plaintext
   📜 **Emisoras:**
   1️⃣ Canal: radioX, Contraseña: pass123, País: Colombia, Descripción: Programa de música
   ```

3. **Eliminar emisora**:
   ```plaintext
   Ingrese la contraseña de la emisora a eliminar:
   pass123
   ✅ **Emisora eliminada.**
   ```

4. **Modificar emisora**:
   ```plaintext
   Ingrese la contraseña de la emisora a modificar:
   pass123
   🔍 **Emisora encontrada:**
   Canal: radioX, Contraseña: pass123

   Ingrese nueva banda AM/FM:
   radioY
   Ingrese nueva contraseña:
   newpass123
   ✏️ **Modificación exitosa.**
   ```

## 📝 **Notas**:
- Los datos de las emisoras se **guardan solo en memoria** mientras el programa está corriendo. Al cerrar la aplicación, los datos se pierden.
- Asegúrate de ingresar correctamente los valores (como las contraseñas) para evitar errores en la modificación o eliminación de emisoras.

## 📜 **Licencia**:
Este proyecto no tiene una licencia establecida, así que si decides usarlo o modificarlo, hazlo bajo tu propia responsabilidad.

---

¡🎉 Gracias por revisar **Emisora Giselle**! Si tienes alguna duda o sugerencia, no dudes en contactarme. 📬
```


