use dblavanderia;
delimiter $$
create procedure spuListarCompra ()
begin
	select * from TComprobante_Compra;
end $$

