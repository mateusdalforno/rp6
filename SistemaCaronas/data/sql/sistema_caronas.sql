SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `sistema_caronas` ;
CREATE SCHEMA IF NOT EXISTS `sistema_caronas` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `sistema_caronas` ;

-- -----------------------------------------------------
-- Table `sistema_caronas`.`tipo_veiculo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema_caronas`.`tipo_veiculo` ;

CREATE  TABLE IF NOT EXISTS `sistema_caronas`.`tipo_veiculo` (
  `id_tipo_veiculo` INT NOT NULL AUTO_INCREMENT ,
  `tipo_veiculo` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  PRIMARY KEY (`id_tipo_veiculo`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_caronas`.`veiculo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema_caronas`.`veiculo` ;

CREATE  TABLE IF NOT EXISTS `sistema_caronas`.`veiculo` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `id_tipo_veiculo` INT NOT NULL ,
  `placa` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_bin' NULL ,
  `quilometragem` FLOAT NULL ,
  `capacidade_passageiro` INT(3) NULL ,
  `cor` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_veiculo_tipoVeiculo_idx` (`id_tipo_veiculo` ASC) ,
  CONSTRAINT `fk_veiculo_tipoVeiculo`
    FOREIGN KEY (`id_tipo_veiculo` )
    REFERENCES `sistema_caronas`.`tipo_veiculo` (`id_tipo_veiculo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_caronas`.`passageiro`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema_caronas`.`passageiro` ;

CREATE  TABLE IF NOT EXISTS `sistema_caronas`.`passageiro` (
  `id_passageiro` INT NOT NULL AUTO_INCREMENT ,
  `rg` VARCHAR(12) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  `nome` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  `telefone` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  PRIMARY KEY (`id_passageiro`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_caronas`.`tipo_usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema_caronas`.`tipo_usuario` ;

CREATE  TABLE IF NOT EXISTS `sistema_caronas`.`tipo_usuario` (
  `id_tipo_usuario` INT NOT NULL AUTO_INCREMENT ,
  `tipo_usuario` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  PRIMARY KEY (`id_tipo_usuario`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_caronas`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema_caronas`.`usuario` ;

CREATE  TABLE IF NOT EXISTS `sistema_caronas`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT ,
  `id_tipo_usuario` INT NOT NULL ,
  `nome` TEXT CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  `rg` VARCHAR(12) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  `nome_usuario` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  `numero_servidor` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  `senha` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  `telefone` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  `email` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL ,
  PRIMARY KEY (`id_usuario`) ,
  INDEX `fk_usuario_tipo_usuario1_idx` (`id_tipo_usuario` ASC) ,
  CONSTRAINT `fk_usuario_tipo_usuario1`
    FOREIGN KEY (`id_tipo_usuario` )
    REFERENCES `sistema_caronas`.`tipo_usuario` (`id_tipo_usuario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_caronas`.`solicitacao_viagem`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema_caronas`.`solicitacao_viagem` ;

CREATE  TABLE IF NOT EXISTS `sistema_caronas`.`solicitacao_viagem` (
  `id_solicitacao_viagem` INT NOT NULL AUTO_INCREMENT ,
  `numero_transportados` INT(3) NULL ,
  `servidores` CHAR(3) NULL ,
  `data_saida` DATE NULL ,
  `hora_saida` TIMESTAMP NULL ,
  `local_saida` TEXT NULL ,
  `data_retorno` DATE NULL ,
  `hora_retorno` TIMESTAMP NULL ,
  `local_retorno` TEXT NULL ,
  `percurso` TEXT NULL ,
  `objetivo_viagem` TEXT NULL ,
  `id_veiculo` INT NOT NULL ,
  `id_responsavel_solicitacao` INT NOT NULL ,
  `id_responsavel_autorizante` INT NOT NULL ,
  PRIMARY KEY (`id_solicitacao_viagem`) ,
  INDEX `fk_solicitacaoViagem_veiculo1_idx` (`id_veiculo` ASC) ,
  INDEX `fk_solicitacaoViagem_usuario1_idx` (`id_responsavel_solicitacao` ASC) ,
  INDEX `fk_solicitacaoViagem_usuario2_idx` (`id_responsavel_autorizante` ASC) ,
  CONSTRAINT `fk_solicitacaoViagem_veiculo1`
    FOREIGN KEY (`id_veiculo` )
    REFERENCES `sistema_caronas`.`veiculo` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_solicitacaoViagem_usuario1`
    FOREIGN KEY (`id_responsavel_solicitacao` )
    REFERENCES `sistema_caronas`.`usuario` (`id_usuario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_solicitacaoViagem_usuario2`
    FOREIGN KEY (`id_responsavel_autorizante` )
    REFERENCES `sistema_caronas`.`usuario` (`id_usuario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_caronas`.`passageiro_solicitacao_viagem`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema_caronas`.`passageiro_solicitacao_viagem` ;

CREATE  TABLE IF NOT EXISTS `sistema_caronas`.`passageiro_solicitacao_viagem` (
  `id_passageiro` INT NOT NULL ,
  `id_solicitacao_viagem` INT NOT NULL ,
  PRIMARY KEY (`id_passageiro`, `id_solicitacao_viagem`) ,
  INDEX `fk_passageiro_has_solicitacao_viagem_solicitacao_viagem1` (`id_solicitacao_viagem` ASC) ,
  INDEX `fk_passageiro_has_solicitacao_viagem_passageiro1` (`id_passageiro` ASC) ,
  CONSTRAINT `fk_passageiro_has_solicitacao_viagem_passageiro1`
    FOREIGN KEY (`id_passageiro` )
    REFERENCES `sistema_caronas`.`passageiro` (`id_passageiro` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_passageiro_has_solicitacao_viagem_solicitacao_viagem1`
    FOREIGN KEY (`id_solicitacao_viagem` )
    REFERENCES `sistema_caronas`.`solicitacao_viagem` (`id_solicitacao_viagem` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `sistema_caronas`.`tipo_veiculo`
-- -----------------------------------------------------
START TRANSACTION;
USE `sistema_caronas`;
INSERT INTO `sistema_caronas`.`tipo_veiculo` (`id_tipo_veiculo`, `tipo_veiculo`) VALUES (1, 'Ônibus');
INSERT INTO `sistema_caronas`.`tipo_veiculo` (`id_tipo_veiculo`, `tipo_veiculo`) VALUES (2, 'Micro-ônibus');
INSERT INTO `sistema_caronas`.`tipo_veiculo` (`id_tipo_veiculo`, `tipo_veiculo`) VALUES (3, 'Veiculo de Passageiro');
INSERT INTO `sistema_caronas`.`tipo_veiculo` (`id_tipo_veiculo`, `tipo_veiculo`) VALUES (4, 'Veiculo Utilitário');
INSERT INTO `sistema_caronas`.`tipo_veiculo` (`id_tipo_veiculo`, `tipo_veiculo`) VALUES (5, 'Veiculo de Carga');

COMMIT;

-- -----------------------------------------------------
-- Data for table `sistema_caronas`.`tipo_usuario`
-- -----------------------------------------------------
START TRANSACTION;
USE `sistema_caronas`;
INSERT INTO `sistema_caronas`.`tipo_usuario` (`id_tipo_usuario`, `tipo_usuario`) VALUES (1, 'Administrador de Frota');
INSERT INTO `sistema_caronas`.`tipo_usuario` (`id_tipo_usuario`, `tipo_usuario`) VALUES (2, 'Servidor Solicitante');
INSERT INTO `sistema_caronas`.`tipo_usuario` (`id_tipo_usuario`, `tipo_usuario`) VALUES (3, 'Motorista');

COMMIT;
