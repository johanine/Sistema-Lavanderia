use dblavanderia;
delimiter $
CREATE DEFINER=`root`@`localhost` PROCEDURE `spuEntregarComprobante_Boleta`(
in adocEntrada  varchar(6),
in anroBoleta  varchar(6),
in afechaEmision datetime)
begin 
	update TBoleta set Entregado = 1, FechaEmision = afechaEmision
	where DocEntrada = adocEntrada and NroBoleta= anroBoleta;
end $