# VERSION 01
# Sistema de Gestión Hospitalaria

Sistema de gestión médica desarrollado en Java que permite administrar pacientes, médicos, historiales clínicos y pruebas médicas siguiendo el patrón arquitectónico Modelo-Vista-Controlador (MVC).

## Descripción:
Este proyecto implementa un consultorio médico que contiene:
- Registro y gestión de pacientes
- Registro y gestión de médicos con especialidades
- Asignación de médicos a pacientes
- Gestión de historiales médicos
- Registro de pruebas médicas (TAC, análisis de sangre, radiografías, etc.)
- Emisión de recetas médicas
- Control de usuarios administrativos

## Características Principales:
- **Gestión de Pacientes**: Crear y consultar perfiles de pacientes con sus datos personales
- **Gestión de Médicos**: Registro de médicos con especialidades médicas variadas
- **Historiales Médicos**: Seguimiento completo de pruebas y tratamientos de cada paciente
- **Pruebas Médicas**: Registro de diferentes tipos de pruebas diagnósticas con resultados
- **Recetas Médicas**: Emisión y almacenamiento de prescripciones farmacológicas
- **Sistema de Usuarios**: Control de acceso con credenciales hasheadas para seguridad
- **Patrón MVC**: Arquitectura limpia y mantenible

## Arquitectura del Proyecto

El proyecto sigue el patrón **MVC (Modelo-Vista-Controlador)**:

## Modelo (Entidades)
- `Persona` - Clase abstracta base
- `Usuario` - Usuario con credenciales de acceso
- `Paciente` - Paciente con historial médico
- `Administrativo` - Personal administrativo del sistema
- `PersonalSanitario` - Clase abstracta para profesionales de la salud
- `Medico` - Médico con especialidad
- `HistorialMedico` - Historial clínico del paciente
- `EntradaHistorial` - Clase abstracta para entradas del historial
- `PruebaMedica` - Prueba diagnóstica realizada
- `Receta` - Receta médica prescrita

## Vista
- `Vista` - Gestiona toda la salida de información al usuario

## Controlador
- `Controlador` - Coordina la lógica de negocio entre Modelo y Vista

## Enumeraciones
- `Especialidad` - Especialidades médicas disponibles
- `TipoPrueba` - Tipos de pruebas médicas


## Ejemplo de salida por pantalla:

Usuarios creados: 
Administrativo - Nombre: Administrativo 1, DNI: 123456789A, Email: administrador1@secmed.com, Dirección: C/Capitan 24, Username: user.Administrador1, ID: idAdministrador1_001
Médico - Nombre: Sandra Fernández, DNI: 123456789B, Email: sandra_fernandez@secmed.com, Dirección: C/Santiago Rusiñol 3, Username: user.SandraFernandez, Nº Colegiado: N.Colegiado_01, Especialidad: PEDIATRIA

Paciente creado: 
Paciente - Nombre: Andrea, DNI: 54901205K, Email: andrea_barcenas@gmail.com, Dirección: C/Alejandro Sureda 1, Médico asignado: Médico - Nombre: Sandra Fernández...

Administrativo 1 ha asignado una prueba médica...

El médico realiza las pruebas...
Prueba Médica - Fecha: 2024-12-16, Tipo: TAC, Causa: Dolor de pecho al respirar, Resultado: Infección en los pulmones

El médico receta en base al resultado de las pruebas...
Receta - Fecha: 2024-12-16, Causa: Dolor de pecho al respirar, Medicamentos: [Antibiótico para la infección, Ibuprofeno 500mg]

Historial completo del paciente
Objeto HistorialMedico { entradas = '[Prueba Médica - ..., Receta - ...]'}
