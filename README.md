# colectivero
Sistema multiagente (JADE) para simulación de plataforma de colectiveros
Sistema Multiagente SMA – App de Colectiveros
Proyecto académico para la Maestría en Ingeniería de Sistemas – UNMSM
Curso: Innovación Disruptiva y Transformación Digital

Descripción del proyecto
Este proyecto implementa un Sistema Multiagente (SMA) usando JADE, simulando una plataforma tipo Uber/Indrive pero enfocada en colectiveros que operan en una sola avenida.

El sistema incluye:

Agente Colectivero

Agente Pasajero

Agente Coordinador

Los agentes se comunican mediante ACLMessage, se registran en las páginas amarillas (DF) y colaboran para asignar viajes.

Arquitectura del SMA
El Colectivero se registra en el DF como servicio:
colectivo-ruta-AvJavierPrado

El Pasajero busca colectiveros disponibles en el DF.

El Coordinador recibe solicitudes y ofertas, decide la mejor asignación y envía confirmaciones.

Tecnologías utilizadas
Java 8+

JADE Framework

IntelliJ IDEA / Eclipse

GitHub

Ejecución
Descargar JADE.

Configurar el classpath.

Ejecutar el contenedor principal:
java -cp jade.jar jade.Boot -gui

Ejecutar los agentes:
java -cp jade.jar;bin jade.Boot colectivero:ColectiveroAgent pasajero:PasajeroAgent coordinador:CoordinadorAgent

Autores
Christian Olivos

Leonidas Prado

Luis Romero

Video de demostración
(Colocar aquí el enlace de YouTube cuando esté listo)

Licencia
Uso académico.
