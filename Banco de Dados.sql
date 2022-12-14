
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE=`TRADITIONAL,ALLOW_INVALID_DATES`;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Endereco`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `mydb` . `Endereco` (
  `IdEndereco` INT NOT NULL AUTO_INCREMENT,
  `CEP` CHAR(15) NULL,
  `UF` CHAR(10) NULL,
  `Cidade` VARCHAR(30) NULL,
  `Bairro` VARCHAR(50) NULL,
  `Endereco` VARCHAR(100) NULL,
  `Numero` CHAR(10) NULL,
  `Complemento` VARCHAR(30) NULL,
  PRIMARY KEY (`IdEndereco`),
  UNIQUE INDEX `IdEndereco_UNIQUE` (`IdEndereco` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(50) NOT NULL,
  `CPF` CHAR(14) NOT NULL,
  `DataNascimento` CHAR(20) NULL,
  `Sexo` VARCHAR(30) NULL,
  `Fone` CHAR(15) NULL,
  `Celular` CHAR(15) NOT NULL,
  `email` VARCHAR(40) NULL,
  `IdEndereco` INT NOT NULL,
  FOREIGN KEY (`IdEndereco`)
  REFERENCES `mydb`.`Endereco` (`IdEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  PRIMARY KEY (`idCliente`),
  UNIQUE INDEX `idCliente_UNIQUE` (`idCliente` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Vendedor` (
  `idVendedor` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(50) NULL,
  `CPF` CHAR(14) NULL,
  `DataNascimento` CHAR(10) NULL,
  `Sexo` VARCHAR(30) NULL,
  `Comissao` FLOAT NULL,
  `Fone` CHAR(15) NULL,
  `Celular` CHAR(15) NOT NULL,
  `email` VARCHAR(40) NULL,
  `IdEndereco` INT NOT NULL,
  FOREIGN KEY (`IdEndereco`)
  REFERENCES `mydb`.`Endereco` (`IdEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  PRIMARY KEY (`idVendedor`),
  UNIQUE INDEX `idVandedor_UNIQUE` (`idVendedor` ASC))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `User` VARCHAR(30) NOT NULL,
  `Nome` VARCHAR(50) NULL,
  `Email` VARCHAR(100) NULL,
  `Senha` VARCHAR(20) NOT NULL,
  `Administrador` BOOLEAN NOT NULL,
  PRIMARY KEY (`IdUsuario`),
  UNIQUE INDEX `IdUsuario_UNIQUE` (`IdUsuario` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Autor` (
  `IdAutor` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(100) NULL,
  PRIMARY KEY (`IdAutor`),
  UNIQUE INDEX `IdAutor_UNIQUE` (`IdAutor` ASC))
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
  `IdAutor` INT NULL AUTO_INCREMENT,
  UNIQUE INDEX `SKU_UNIQUE` (`SKU` ASC),
  PRIMARY KEY (`SKU`),
  UNIQUE INDEX `ISBN_UNIQUE` (`ISBN` ASC),
  FOREIGN KEY (`IdAutor`)
  REFERENCES `mydb`.`Autor` (`IdAutor`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`FormaDePagamento`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `mydb`.`FormaDePagamento` (
  `idFormaDePagamento` INT NOT NULL AUTO_INCREMENT,
  `FormaDePagamento` VARCHAR(100) NOT NULL,
  `BandeiraCartao` CHAR(30) NULL,
  `ValorTotal` Float NULL,
  `ValorRecebido` Float NULL,
  `ValorTroco` Float NULL,
  PRIMARY KEY (`IdFormaDePagamento`),
  UNIQUE INDEX `IdFormaDePagamento_UNIQUE` (`IdFormaDePagamento` ASC))
  ENGINE = InnoDB;
  
-- -----------------------------------------------------
-- Table `mydb`.`Venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Venda` (
  `idVenda` INT NOT NULL AUTO_INCREMENT, 
  `idFormaPagamento` INT NOT NULL,
  `Data` Date NULL,
  `Valor` Float NULL,
  `Desconto` Float NULL,
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
    CONSTRAINT `fk_Venda_FormaPagamento`
    FOREIGN KEY (`IdFormaPagamento`)
    REFERENCES `mydb`.`FormaDePagamento` (`IdFormaDePagamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Devolucao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Devolucao` (
  `codDevolucao` INT NOT NULL AUTO_INCREMENT,
  `Motivo` VARCHAR(100) NULL,
  `Data` VARCHAR(10) NULL,
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
-- Table `mydb`.`HistoricoDePrecos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`HistoricoDePrecos` (
  `IdHistoricoDePrecos` INT NOT NULL AUTO_INCREMENT,
  `NomeLivro` VARCHAR(100) NULL,
  `SKU` INT NULL,
  `ISBN` VARCHAR(20) NULL,
  `PrecoAnterior` FLOAT NULL,
  `PrecoAtual` FLOAT NULL,
  `DataAlteracao` VARCHAR(10) NULL,
  PRIMARY KEY (`IdHistoricoDePrecos`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Fornecedor` (
  `idFornecedor` INT AUTO_INCREMENT,
  `Nome` VARCHAR(50) NULL,
  `CNPJ` CHAR(20) NOT NULL,
  `Inscricao_Estadual` CHAR(15) NOT NULL,
  `Celular` CHAR(15) NULL,
  `Email` VARCHAR (100) NULL,
  `Telefone` VARCHAR(15)  NULL,
  `IdEndereco` INT NOT NULL,
  INDEX `fk_fornecedor_idFornecedor_idx` (`idFornecedor`),
  FOREIGN KEY (`IdEndereco`)
  REFERENCES `mydb`.`Endereco` (`IdEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  PRIMARY KEY (`idFornecedor`),
  UNIQUE INDEX `idFornecedor_UNIQUE` (`IdFornecedor` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Compra` (
  `IdCompra` INT NOT NULL AUTO_INCREMENT,
  `Quantidade` INT NOT NULL,
  `Valor` DOUBLE NULL,
  `Data` VARCHAR(10) NULL,
  `IdFornecedor` INT NOT NULL,
  PRIMARY KEY (`IdCompra`),
  UNIQUE INDEX `IdCompra_UNIQUE` (`IdCompra` ASC),
  FOREIGN KEY (`IdFornecedor`)
  REFERENCES `mydb`.`Fornecedor` (`IdFornecedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Livro_has_Compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Livro_has_Compra` (
  `Livro_SKU` INT NOT NULL,
  `Compra_IdCompra` INT NOT NULL,
  `Quantidade` INT NOT NULL,
  `ValorItem` FLOAT NOT NULL,
  `ValorTotal` FLOAT NOT NULL,
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
-- Table `mydb`.`Livro_has_Devolucao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Livro_has_Devolucao` (
  `LivroSKU` INT NOT NULL,
  `Devolucao_IdDevolucao` INT NOT NULL,
  `Quantidade` INT NOT NULL,
  `ValorItem` FLOAT NOT NULL,
  `ValorTotal` FLOAT NOT NULL,
  PRIMARY KEY (`LivroSKU`, `Devolucao_IdDevolucao`),
  INDEX `fk_Livro_has_Devolucao_Devolucao1_idx` (`Devolucao_IdDevolucao` ASC),
  INDEX `fk_Livro_has_Devolucao_Livro1_idx` (`LivroSKU` ASC),
  CONSTRAINT `fk_Livro_has_Devolucao_Livro1`
    FOREIGN KEY (`LivroSKU`)
    REFERENCES `mydb`.`Livro` (`SKU`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Livro_has_Devolucao_Devolucao1`
    FOREIGN KEY (`Devolucao_IdDevolucao`)
    REFERENCES `mydb`.`Devolucao` (`codDevolucao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Livro_has_Venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Livro_has_Venda` (
  `Livro_SKU` INT NOT NULL,
  `Venda_idVenda` INT NOT NULL,
  `QuantidadeItem` INT NOT NULL,
  `DescontoItem` FLOAT NOT NULL,
  `ValorItens` FLOAT NOT NULL,
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
  `idFornecedor` INT AUTO_INCREMENT,
  `Nome` VARCHAR(50) NULL,
  `CNPJ` CHAR(20) NOT NULL,
  `Inscricao_Estadual` CHAR(15) NOT NULL,
  `Celular` CHAR(15) NULL,
  `Email` VARCHAR (100) NULL,
  `Telefone` VARCHAR(15)  NULL,
  `IdEndereco` INT NOT NULL,
  INDEX `fk_fornecedor_idFornecedor_idx` (`idFornecedor`),
  FOREIGN KEY (`IdEndereco`)
  REFERENCES `mydb`.`Endereco` (`IdEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  PRIMARY KEY (`idFornecedor`),
  UNIQUE INDEX `idFornecedor_UNIQUE` (`IdFornecedor` ASC))
ENGINE = InnoDB;






SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;