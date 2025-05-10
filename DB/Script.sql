-- Tabla de Sucursales
CREATE TABLE sucursal (
    id_sucursal SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    ubicacion VARCHAR(200) NOT NULL
);

-- Tabla de Carros
CREATE TABLE carro (
    id_carro SERIAL PRIMARY KEY,
    modelo VARCHAR(100) NOT NULL,
    marca VARCHAR(100) NOT NULL,
    anio INT NOT NULL,
    precio DECIMAL(10,2) NOT NULL
);

-- Tabla de Inventario
CREATE TABLE inventario (
    id_inventario SERIAL PRIMARY KEY,
    id_sucursal INT REFERENCES sucursal(id_sucursal),
    id_carro INT REFERENCES carro(id_carro),
    cantidad INT NOT NULL
);

-- Tabla de Ventas
CREATE TABLE venta (
    id_venta SERIAL PRIMARY KEY,
    fecha DATE NOT NULL,
    id_carro INT REFERENCES carro(id_carro),
    id_sucursal INT REFERENCES sucursal(id_sucursal),
    cantidad_vendida INT NOT NULL
);
