## Automatización Demo Serenity

Proyecto de automatización web para la plataforma demo de Serenity, orientado a pruebas funcionales BDD con Cucumber y el patrón Screenplay.

### Resumen general

El objetivo del proyecto es validar flujos críticos de negocio en una aplicación web, como el inicio de sesión y la creación de órdenes de venta, usando escenarios escritos en Gherkin y ejecutados sobre el navegador con Serenity BDD.

La estructura está organizada por capas de automatización:

- **Features**: escenarios BDD en archivos `.feature`.
- **Step Definitions**: traducen cada paso del Gherkin a acciones ejecutables.
- **Tasks**: encapsulan acciones de usuario reutilizables.
- **UI / Targets**: centralizan los selectores de la aplicación.
- **Questions**: validan resultados o estados visibles en pantalla.
- **Runners**: ejecutan los escenarios por etiquetas.

### Funcionamiento

El flujo general de ejecución es el siguiente:

1. El runner inicia la ejecución de los escenarios filtrados por tag.
2. Cucumber lee los escenarios definidos en Gherkin.
3. Los `Step Definitions` invocan `Tasks` de Screenplay para interactuar con la aplicación.
4. Las `Questions` verifican que la pantalla final coincida con el resultado esperado.
5. Serenity genera reportes automáticos al finalizar la ejecución.

En el proyecto se observa, principalmente, el siguiente flujo:

- autenticación en la aplicación,
- navegación al módulo **Northwind**, 
- creación de una nueva orden,
- carga de cabecera y detalle,
- guardado del registro,
- validación de que la orden quedó visible en la tabla de pedidos.

### Stack tecnológico

- **Java**: lenguaje principal del proyecto.
- **Gradle**: gestor de construcción y dependencias.
- **Serenity BDD 4.0.12**: framework principal de automatización y reportes.
- **Cucumber 7.11.0**: sintaxis BDD para escribir escenarios en Gherkin.
- **Screenplay**: patrón de diseño usado para modelar tareas, preguntas e interacciones.
- **Selenium 4.13.0**: automatización del navegador.
- **JUnit**: integración de ejecución de pruebas.
- **WebDriverManager 6.2.0**: administración automática de drivers del navegador.
- **JaCoCo**: generación de cobertura.
- **Log4j**: manejo de logs.

### Estructura general del proyecto

- `src/main/java/com/serenity/tasks`: tareas de negocio reutilizables.
- `src/main/java/com/serenity/ui`: selectores y elementos de la interfaz.
- `src/main/java/com/serenity/questions`: validaciones y verificaciones.
- `src/test/java/com/serenity/stepDefinitions`: definición de pasos Cucumber.
- `src/test/java/com/serenity/runners`: clases ejecutoras de los escenarios.
- `src/test/resources/features`: archivos `.feature` con los escenarios.
- `src/test/serenity.conf`: configuración del entorno de prueba y navegador.

### Ejecución

Para ejecutar los escenarios del proyecto:

```bash
./gradlew clean test
```

Si deseas ejecutar solo los escenarios asociados a una etiqueta específica, puedes usar el runner configurado para ello.

### Reportes

Al finalizar la ejecución, Serenity genera reportes en formato **single-page-html**, lo que facilita revisar el detalle de cada escenario, paso ejecutado y evidencia visual.

