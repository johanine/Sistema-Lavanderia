use dblavanderia;
delimiter $$
create procedure spuBuscarCompras (aUsuario varchar(50))
begin
	select * from TComprobante_Compra where usuario=aUsuario;
end $$
