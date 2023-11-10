DROP DATABASE IF EXISTS `basepasteleria`;
CREATE DATABASE `basepasteleria`;
USE `basepasteleria`;

CREATE TABLE Categoria(
    cat_cod char(5) PRIMARY KEY,
    cat_nom varchar(45),
    cat_des varchar(45)
);

CREATE TABLE Proveedor(
    pro_cod char(5) PRIMARY KEY,
    pro_nom varchar(45),
    pro_des varchar(45),
    pro_ruc int
);

CREATE TABLE Usuario(
    usr_cod char(5) PRIMARY KEY,
    usr_name varchar(45),
    usr_pass varchar(45),
    usr_aut int,
    car_cod int
);

CREATE TABLE Cargo(
    car_cod int PRIMARY KEY,
    car_nom varchar(45)
);

CREATE TABLE Cliente(
    cli_cod char(5) PRIMARY KEY,
    cli_nom varchar(45),
    cli_ape varchar(45),
    cli_tel int,
    cli_dir varchar(45),
    cli_cor varchar(45)
);

CREATE TABLE Producto(
    prod_cod char(5) PRIMARY KEY,
    prod_nom varchar(45),
    prod_des varchar(45),
    prod_pre double,
    prod_stk int,
    cat_cod char(5)
);

CREATE TABLE Insumos(
    ins_cod char(5) PRIMARY KEY,
    ins_nom varchar(45),
    ins_des varchar(45),
    ins_stk int,
    pro_cod char(5)
);

CREATE TABLE Ingredientes(
    prod_cod char(5) PRIMARY KEY,
    ins_cod char(5),
    ing_can int
);

CREATE TABLE Recibo(
    reb_cod char(5) PRIMARY KEY,
    reb_fec date,
    cli_cod char(5)
);

CREATE TABLE Detalle_Recibo(
    reb_cod char(5) PRIMARY KEY,
    prod_can int,
	prod_cod char(5)
);

CREATE TABLE Pago(
    pag_cod char(5) PRIMARY KEY,
    pag_com varchar(45),
	pag_igv double,
	pag_total double,
	pag_fec date,
	reb_cod char(5)
);

ALTER TABLE `Producto`
ADD CONSTRAINT `fk_producto_categoria` FOREIGN KEY (`cat_cod`) REFERENCES `categoria` (`cat_cod`);

ALTER TABLE `Insumos`
ADD CONSTRAINT `fk_insumos_proveedor` FOREIGN KEY (`pro_cod`) REFERENCES `proveedor` (`pro_cod`);

ALTER TABLE `Ingredientes`
ADD CONSTRAINT `fk_ingredientes_insumos` FOREIGN KEY (`ins_cod`) REFERENCES `insumos` (`ins_cod`);

ALTER TABLE `Ingredientes`
ADD CONSTRAINT `fk_ingredientes_producto` FOREIGN KEY (`prod_cod`) REFERENCES `producto` (`prod_cod`);

ALTER TABLE `Usuario`
ADD CONSTRAINT `fk_usuario_cargo` FOREIGN KEY (`car_cod`) REFERENCES `cargo` (`car_cod`);

ALTER TABLE `Detalle_Recibo`
ADD CONSTRAINT `fk_detalle_producto` FOREIGN KEY (`prod_cod`) REFERENCES `producto` (`prod_cod`);

ALTER TABLE `Detalle_Recibo`
ADD CONSTRAINT `fk_detalle_recibo` FOREIGN KEY (`reb_cod`) REFERENCES `recibo` (`reb_cod`);

ALTER TABLE `Recibo`
ADD CONSTRAINT `fk_recibo_cliente` FOREIGN KEY (`cli_cod`) REFERENCES `cliente` (`cli_cod`);

ALTER TABLE `Pago`
ADD CONSTRAINT `fk_pago_recibo` FOREIGN KEY (`reb_cod`) REFERENCES `recibo` (`reb_cod`);


