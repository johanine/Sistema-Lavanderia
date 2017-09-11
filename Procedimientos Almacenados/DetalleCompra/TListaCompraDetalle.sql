use dblavanderia;
delimiter $$
create procedure TListaCompraDetalle()
begin
	select * from TComprobante_Compra_Detalle;
end $$