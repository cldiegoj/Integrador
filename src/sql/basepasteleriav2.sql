

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


DROP DATABASE IF EXISTS basepasteleria;
CREATE DATABASE basepasteleria;
USE basepasteleria;


CREATE TABLE `cargo` (
  `car_cod` int(11) NOT NULL,
  `car_nom` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



INSERT INTO `cargo` (`car_cod`, `car_nom`) VALUES
(1, 'ADMINISTRADOR'),
(2, 'VENDEDOR'),
(3, 'ENCARGADO DE ALMACEN');


CREATE TABLE `categoria` (
  `cat_cod` int PRIMARY KEY AUTO_INCREMENT,
  `cat_nom` varchar(45) DEFAULT NULL,
  `cat_des` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `categoria` VALUES(null, 'Pasteles', 'Pasteles de cumpleaños');
INSERT INTO `categoria` VALUES(null, 'Galletas', 'Galletas decoradas');
INSERT INTO `categoria` VALUES(null, 'Cupcakes', 'Cupcakes decorados');
INSERT INTO `categoria` VALUES(null, 'Postres', 'Postres individuales');
INSERT INTO `categoria` VALUES(null, 'Dulces', 'Dulces tradicionales');

CREATE TABLE `cliente` (
  `cli_cod` int(11) NOT NULL,
  `cli_nom` varchar(45) DEFAULT NULL,
  `cli_ape` varchar(45) DEFAULT NULL,
  `cli_tel` int(11) DEFAULT NULL,
  `cli_dir` varchar(45) DEFAULT NULL,
  `cli_cor` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cli_cod`);

ALTER TABLE `cliente`
  MODIFY `cli_cod` int(11) NOT NULL AUTO_INCREMENT;


CREATE TABLE `detalle_recibo` (
  `reb_cod` char(5) NOT NULL,
  `prod_can` int(11) DEFAULT NULL,
  `prod_cod` int 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `ingredientes` (
  `prod_cod` int NOT NULL,
  `ins_cod` char(5) DEFAULT NULL,
  `ing_can` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `insumos` (
  `ins_cod` char(5) NOT NULL,
  `ins_nom` varchar(45) DEFAULT NULL,
  `ins_des` varchar(45) DEFAULT NULL,
  `ins_stk` int(11) DEFAULT NULL,
  `pro_cod` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `pago` (
  `pag_cod` char(5) NOT NULL,
  `pag_com` varchar(45) DEFAULT NULL,
  `pag_igv` double DEFAULT NULL,
  `pag_total` double DEFAULT NULL,
  `pag_fec` date DEFAULT NULL,
  `reb_cod` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `producto` (
  `prod_cod` int PRIMARY KEY AUTO_INCREMENT,
  `prod_nom` varchar(45) DEFAULT NULL,
  `prod_des` varchar(45) DEFAULT NULL,
  `prod_pre` double DEFAULT NULL,
  `prod_stk` int(11) DEFAULT NULL,
  `cat_cod` int 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Datos para la categoría 'Pasteles'
INSERT INTO `producto` VALUES (null, 'Pastel de Chocolate', 'Delicioso pastel de chocolate', 25.99, 10, 1);

-- Datos para la categoría 'Galletas'
INSERT INTO `producto` VALUES (null, 'Galletas Navideñas', 'Galletas decoradas con motivos navideños', 12.49, 15, 2);

-- Datos para la categoría 'Cupcakes'
INSERT INTO `producto` VALUES (null, 'Cupcake de Fresa', 'Cupcake con crema de fresa', 3.99, 20, 3);

-- Datos para la categoría 'Postres'
INSERT INTO `producto` VALUES (null, 'Éclair de Vainilla', 'Éclair relleno de crema de vainilla', 4.75, 12, 4);

-- Datos para la categoría 'Dulces'
INSERT INTO `producto` VALUES (null, 'Alfajor de Maicena', 'Dulce tradicional con relleno de dulce de leche', 2.49, 30, 5);


CREATE TABLE `proveedor` (
  `pro_cod` char(5) NOT NULL,
  `pro_nom` varchar(45) DEFAULT NULL,
  `pro_des` varchar(45) DEFAULT NULL,
  `pro_ruc` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



CREATE TABLE `recibo` (
  `reb_cod` char(5) NOT NULL,
  `reb_fec` date DEFAULT NULL,
  `cli_cod` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;




CREATE TABLE `usuario` (
  `usr_cod` int(11) NOT NULL,
  `usr_name` varchar(45) NOT NULL,
  `usr_pass` varchar(45) NOT NULL,
  `usr_nom` varchar(45) NOT NULL,
  `usr_ape` varchar(45) NOT NULL,
  `usr_telf` char(9) NOT NULL,
  `usr_status` int(11) NOT NULL,
  `car_cod` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



INSERT INTO `usuario` (`usr_cod`, `usr_name`, `usr_pass`, `usr_nom`, `usr_ape`, `usr_telf`, `usr_status`, `car_cod`) VALUES
(1, 'kfernandezs', 'Password$1', 'Kevin', 'Fernandez Salas', '914233345', 1, 1),
(3, 'jfernandezs', 'Password$1', 'Jean', 'Fernandez Salas', '987654321', 1, 1);


ALTER TABLE `cargo`
  ADD PRIMARY KEY (`car_cod`);

ALTER TABLE `detalle_recibo`
  ADD PRIMARY KEY (`reb_cod`),
  ADD KEY `fk_detalle_producto` (`prod_cod`);

ALTER TABLE `ingredientes`
  ADD PRIMARY KEY (`prod_cod`),
  ADD KEY `fk_ingredientes_insumos` (`ins_cod`);

ALTER TABLE `insumos`
  ADD PRIMARY KEY (`ins_cod`),
  ADD KEY `fk_insumos_proveedor` (`pro_cod`);

ALTER TABLE `pago`
  ADD PRIMARY KEY (`pag_cod`),
  ADD KEY `fk_pago_recibo` (`reb_cod`);


ALTER TABLE `producto`
  ADD KEY `fk_producto_categoria` (`cat_cod`);

ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`pro_cod`);


ALTER TABLE `recibo`
  ADD PRIMARY KEY (`reb_cod`),
  ADD KEY `fk_recibo_cliente` (`cli_cod`);


ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usr_cod`),
  ADD KEY `fk_usuario_cargo` (`car_cod`);




ALTER TABLE `usuario`
  MODIFY `usr_cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

ALTER TABLE `detalle_recibo`
  ADD CONSTRAINT `fk_detalle_producto` FOREIGN KEY (`prod_cod`) REFERENCES `producto` (`prod_cod`),
  ADD CONSTRAINT `fk_detalle_recibo` FOREIGN KEY (`reb_cod`) REFERENCES `recibo` (`reb_cod`);


ALTER TABLE `ingredientes`
  ADD CONSTRAINT `fk_ingredientes_insumos` FOREIGN KEY (`ins_cod`) REFERENCES `insumos` (`ins_cod`),
  ADD CONSTRAINT `fk_ingredientes_producto` FOREIGN KEY (`prod_cod`) REFERENCES `producto` (`prod_cod`);


ALTER TABLE `insumos`
  ADD CONSTRAINT `fk_insumos_proveedor` FOREIGN KEY (`pro_cod`) REFERENCES `proveedor` (`pro_cod`);


ALTER TABLE `pago`
  ADD CONSTRAINT `fk_pago_recibo` FOREIGN KEY (`reb_cod`) REFERENCES `recibo` (`reb_cod`);


ALTER TABLE `producto`
  ADD CONSTRAINT `fk_producto_categoria` FOREIGN KEY (`cat_cod`) REFERENCES `categoria` (`cat_cod`);



ALTER TABLE `recibo`
  ADD CONSTRAINT `fk_recibo_cliente` FOREIGN KEY (`cli_cod`) REFERENCES `cliente` (`cli_cod`);


ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_usuario_cargo` FOREIGN KEY (`car_cod`) REFERENCES `cargo` (`car_cod`);
COMMIT;


