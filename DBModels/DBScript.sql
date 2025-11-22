/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     10/9/2025 2:09:05 AM                         */
/*==============================================================*/

DROP TABLE IF EXISTS CONTACTOS;

/*==============================================================*/
/* Table: CONTACTOS                                             */
/*==============================================================*/
CREATE TABLE CONTACTOS
(
   IDCONTACTO           INT NOT NULL AUTO_INCREMENT,
   NOMBRECONTACTO       VARCHAR(20) NOT NULL,
   APELLIDOCONTACTO     VARCHAR(20) NOT NULL,
   TELEFONOCONTACTO     VARCHAR(15),
   EMAILCONTACTO        VARCHAR(50),
   DIRECCIONCONTACTO    VARCHAR(100),
   ESTADOCONTACTO       BOOLEAN NOT NULL,
   NOTASCONTACTO        VARCHAR(255),
   PRIMARY KEY (IDCONTACTO)
);


