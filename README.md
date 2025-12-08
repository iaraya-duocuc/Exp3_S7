# Semana 7 – Profundizando en sobrecarga, sobrescritura y polimorfismo

## Objetivo
Implementar una jerarquía de clases basada en herencia simple, agregando el método polimórfico mostrarInformacion(). Luego, crear una colección de objetos de diferentes subclases y recorrerla utilizando polimorfismo.
## Clases incluidas
- **UnidadOperativa**: clase abstracta que define nombre, comuna y el método abstracto mostrarInformacion().
- **PlantaProceso**: ssubclase que agrega capacidad de proceso e implementa mostrarInformacion()
- **CentroCultivo**: subclase que agrega toneladas producidas e implementa mostrarInformacion().
- **GestorUnidades**: genera una lista List<UnidadOperativa> con distintos tipos de unidades.
- **Main**: recorre la colección y muestra la información usando polimorfismo.

## Cómo ejecutar en IntelliJ (Maven)
1. Abrir IntelliJ y cargar el proyecto.
2. Abrir `src/main/java/cl/salmontt/colecciones/ui/Main.java`.
3. Ejecutar la clase Main.
4. La información de cada unidad se mostrará por consola según su tipo concreto.
