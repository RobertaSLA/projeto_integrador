-- MySQL Script generated by MySQL Workbench
-- Thu Aug 18 10:07:08 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL,
  `Nome` VARCHAR(50) NULL,
  `Telefone` CHAR(15) NULL,
  `CPF` CHAR(14) NULL,
  `Endereco` VARCHAR(100) NULL,
  `CEP` CHAR(9) NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE INDEX `idCliente_UNIQUE` (`idCliente` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Vendedor` (
  `idVendedor` INT NOT NULL,
  `Comissao` FLOAT NULL, /* é FLOAT */
  `Nome` VARCHAR(50) NULL,
  `Endereco` VARCHAR(100) NULL,
  `CEP` CHAR(9) NULL,
  `CPF` CHAR(14) NULL,
  `Telefone` CHAR(15) NULL,
  PRIMARY KEY (`idVendedor`),
  UNIQUE INDEX `idVandedor_UNIQUE` (`idVendedor` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `User` Varchar(30) NOT NULL,
  `Nome` VARCHAR(50) NULL,
  `Email` VARCHAR(100) NULL,
  `Senha` VARCHAR(20) NOT NULL,
  `Administrador` BOOLEAN NOT NULL,
  PRIMARY KEY (`IdUsuario`),
  UNIQUE INDEX `IdUsuario_UNIQUE` (`IdUsuario` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Venda` (
  `idVenda` INT NOT NULL,
  `SKULivro` INT NULL,  /* não é aqui, tem que ser uma foreign key */
  `FormaPagamento` VARCHAR(45) NULL,
  `Data` DATE NULL,
  `Valor` DOUBLE NULL,
  `Cliente_idCliente` INT NOT NULL,
  `Vendedor_idVendedor` INT NOT NULL,
  PRIMARY KEY (`idVenda`, `Cliente_idCliente`, `Vendedor_idVendedor`),
  UNIQUE INDEX `idVenda_UNIQUE` (`idVenda` ASC),
  INDEX `fk_Venda_Cliente1_idx` (`Cliente_idCliente` ASC),
  INDEX `fk_Venda_Vendedor1_idx` (`Vendedor_idVendedor` ASC),
  CONSTRAINT `fk_Venda_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venda_Vendedor1`
    FOREIGN KEY (`Vendedor_idVendedor`)
    REFERENCES `mydb`.`Vendedor` (`idVendedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_VendaLivro` 
	FOREIGN KEY (`SKULivro`) 
	REFERENCES `Livro` (`SKU`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Devolucao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Devolucao` (
  `codDevolucao` INT NOT NULL,
  `IdProduto` INT NULL,
  `IdVenda` INT NULL,
  `Motivo` VARCHAR(100) NULL,
  `Data` DATE NULL,
  `Venda_idVenda` INT NOT NULL,
  `Venda_Cliente_idCliente` INT NOT NULL,
  PRIMARY KEY (`codDevolucao`, `Venda_idVenda`, `Venda_Cliente_idCliente`),
  UNIQUE INDEX `codDevolucao_UNIQUE` (`codDevolucao` ASC),
  INDEX `fk_Devolucao_Venda1_idx` (`Venda_idVenda` ASC, `Venda_Cliente_idCliente` ASC),
  CONSTRAINT `fk_Devolucao_Venda1`
    FOREIGN KEY (`Venda_idVenda` , `Venda_Cliente_idCliente`)
    REFERENCES `mydb`.`Venda` (`idVenda` , `Cliente_idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Livro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Livro` (
  `SKU` INT NOT NULL,
  `ISBN` VARCHAR(20) NOT NULL,
  `Nome` VARCHAR(100) NULL,
  `Editora` VARCHAR(50) NULL,
  `Estoque` INT NULL,
  `Genero` VARCHAR(30) NULL,
  `Preco` FLOAT NULL,
  `IdAutor` INT NULL,
  UNIQUE INDEX `SKU_UNIQUE` (`SKU` ASC),
  PRIMARY KEY (`SKU`),
  UNIQUE INDEX `ISBN_UNIQUE` (`ISBN` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Autor` (
  `IdAutor` INT NOT NULL,
  `Nome` VARCHAR(100) NULL,
  PRIMARY KEY (`IdAutor`),
  UNIQUE INDEX `IdAutor_UNIQUE` (`IdAutor` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`HistoricoDePrecos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`HistoricoDePrecos` (
  `IdHistoricoDePrecos` INT NOT NULL,
  `DataAlteracao` DATE NULL,
  `Preco` DOUBLE NULL,
  `SKULivro` VARCHAR(45) NULL, /* tem que ser SKU e foreign key */
  PRIMARY KEY (`IdHistoricoDePrecos`),
  CONSTRAINT `fk_HisPrecoLivro` 
	FOREIGN KEY (`SKULivro`) 
	REFERENCES `Livro` (`SKU`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Compra` (
  `IdCompra` INT NOT NULL,
  `SKULivro` INT NOT NULL,
  `Quantidade` INT NOT NULL,
  `Valor` FLOAT NULL, /* tem que ser float */
  `Data` DATE NULL,
  PRIMARY KEY (`IdCompra`),
  UNIQUE INDEX `IdCompra_UNIQUE` (`IdCompra` ASC),
  UNIQUE INDEX `SKULivro_UNIQUE` (`SKULivro` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Livro_Venda`
-- -----------------------------------------------------
/* CREATE TABLE IF NOT EXISTS `mydb`.`Livro_Venda` (
  `SKULivro` INT NOT NULL,
  `IdVenda` INT NULL,
  `QuantidadeItem` INT NULL,
  PRIMARY KEY (`SKULivro`)) 
ENGINE = InnoDB; 

ver para excluir isso */


-- -----------------------------------------------------
-- Table `mydb`.`Livro_has_Autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Livro_has_Autor` (
  `Livro_SKU` INT NOT NULL,
  `Autor_IdAutor` INT NOT NULL,
  PRIMARY KEY (`Livro_SKU`, `Autor_IdAutor`),
  INDEX `fk_Livro_has_Autor_Autor1_idx` (`Autor_IdAutor` ASC),
  INDEX `fk_Livro_has_Autor_Livro_idx` (`Livro_SKU` ASC),
  CONSTRAINT `fk_Livro_has_Autor_Livro`
    FOREIGN KEY (`Livro_SKU`)
    REFERENCES `mydb`.`Livro` (`SKU`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Livro_has_Autor_Autor1`
    FOREIGN KEY (`Autor_IdAutor`)
    REFERENCES `mydb`.`Autor` (`IdAutor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Livro_has_HistoricoDePrecos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Livro_has_HistoricoDePrecos` (
  `Livro_SKU` INT NOT NULL,
  `HistoricoDePrecos_IdHistoricoDePrecos` INT NOT NULL,
  PRIMARY KEY (`Livro_SKU`, `HistoricoDePrecos_IdHistoricoDePrecos`),
  INDEX `fk_Livro_has_HistoricoDePrecos_HistoricoDePrecos1_idx` (`HistoricoDePrecos_IdHistoricoDePrecos` ASC),
  INDEX `fk_Livro_has_HistoricoDePrecos_Livro1_idx` (`Livro_SKU` ASC),
  CONSTRAINT `fk_Livro_has_HistoricoDePrecos_Livro1`
    FOREIGN KEY (`Livro_SKU`)
    REFERENCES `mydb`.`Livro` (`SKU`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Livro_has_HistoricoDePrecos_HistoricoDePrecos1`
    FOREIGN KEY (`HistoricoDePrecos_IdHistoricoDePrecos`)
    REFERENCES `mydb`.`HistoricoDePrecos` (`IdHistoricoDePrecos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Livro_has_Compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Livro_has_Compra` (
  `Livro_SKU` INT NOT NULL,
  `Compra_IdCompra` INT NOT NULL,
  `Quantidade` INT NOT NULL,
  PRIMARY KEY (`Livro_SKU`, `Compra_IdCompra`),
  INDEX `fk_Livro_has_Compra_Compra1_idx` (`Compra_IdCompra` ASC),
  INDEX `fk_Livro_has_Compra_Livro1_idx` (`Livro_SKU` ASC),
  CONSTRAINT `fk_Livro_has_Compra_Livro1`
    FOREIGN KEY (`Livro_SKU`)
    REFERENCES `mydb`.`Livro` (`SKU`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Livro_has_Compra_Compra1`
    FOREIGN KEY (`Compra_IdCompra`)
    REFERENCES `mydb`.`Compra` (`IdCompra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Livro_has_Venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Livro_has_Venda` (
  `Livro_SKU` INT NOT NULL,
  `Venda_idVenda` INT NOT NULL,
  `Quantidade` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Livro_SKU`, `Venda_idVenda`),
  INDEX `fk_Livro_has_Venda_Venda1_idx` (`Venda_idVenda` ASC),
  INDEX `fk_Livro_has_Venda_Livro1_idx` (`Livro_SKU` ASC),
  CONSTRAINT `fk_Livro_has_Venda_Livro1`
    FOREIGN KEY (`Livro_SKU`)
    REFERENCES `mydb`.`Livro` (`SKU`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Livro_has_Venda_Venda1`
    FOREIGN KEY (`Venda_idVenda`)
    REFERENCES `mydb`.`Venda` (`idVenda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Fornecedor` (
  `CNPJ` INT NOT NULL,
  `Razao_Social` INT NOT NULL,
  `Endereco` VARCHAR(100) NULL,
  `Email` VARCHAR (100) NULL,
  `Telefone` VARCHAR(15)  NULL,
  PRIMARY KEY (`CNPJ`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Compra_has_Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Compra_has_Fornecedor` (
  `CNPJ_Fornecedor` INT NOT NULL,
  `Id_Compra` INT NOT NULL,
  PRIMARY KEY (`CNPJ_Fornecedor`, `Id_Compra`),
  CONSTRAINT `fk_Compra_has_FornecedorCNPJ`
    FOREIGN KEY (`CNPJ_Fornecedor`)
    REFERENCES `mydb`.`Fornecedor` (`CNPJ`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Forneecdor_has_Compra_ID_compra`
    FOREIGN KEY (`Id_Compra`)
    REFERENCES `mydb`.`Compra` (`IdCompra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
