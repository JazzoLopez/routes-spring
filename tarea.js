const example ={
    "datos_principales": {
        "nombre_sensor": "String"
    },
    "diccionario_datos": {
        "nombre_sensor": "String",
        "descripcion": "String",
        "medida": "String", // Lo que el sensor mide (temperatura, humedad, concentración de gas, etc.)
        "tipo_medida": "String", // Tipo de medida (por ejemplo, grados Celsius, porcentaje, partes por millón, etc.)
        "consumo": "String",
        "fechaActivo": "String",
        "fechaInactivo": "String",
        "estatus": "String"
    },
    "registros_ejemplo": [
        {
            "nombre_sensor": "DHT11",
            "descripcion": "Sensor de temperatura y humedad",
            "medida": "Temperatura y Humedad",
            "tipo_medida": "Grados Celsius, Porcentaje",
            "consumo": "5W",
            "fechaActivo": "2024-02-18 10:00:00",
            "fechaInactivo": "",
            "estatus": "Activo"
        },
        {
            "nombre_sensor": "Sensor de Gas",
            "descripcion": "Detector de concentración de gas",
            "medida": "Concentración de gas",
            "tipo_medida": "ppm", // Partes por millón
            "consumo": "8W",
            "fechaActivo": "2024-02-18 09:30:00",
            "fechaInactivo": "",
            "estatus": "Activo"
        },
        {
            "nombre_sensor": "Servomotor",
            "descripcion": "Actuador para control de apertura/cierre",
            "medida": "N/A",
            "tipo_medida": "N/A",
            "consumo": "12W",
            "fechaActivo": "2024-02-18 11:15:00",
            "fechaInactivo": "",
            "estatus": "Activo"
        }
    ]
}
