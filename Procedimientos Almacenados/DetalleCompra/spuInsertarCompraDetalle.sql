use dblavanderia;
delimiter $$
create procedure spuInsertarCompraDetalle(in aCantidad int,
										  in aPrecioUnitario numeric(15,2),
										  in aIdProducto int,
										  in aDocSalida int(11))
begin
	declare coderror bit;
    declare mensaje varchar(0);
	if not exists (select * from TComprobante_Compra_Detalle where DocSalida=aDocSalida and IdProducto=aIdProducto) then
		insert into TComprobante_Compra_Detalle values ( aPrecioUnitario,aIdProducto,aDocSalida,aCantidad);
		set CodError=1; 
        set Mensaje='Se inserto Producto al Comprobante';
	else
		set CodError=1;
        set Mensaje='Ya existe Producto al Comprobante'; 
	end if;
    select coderror, mensaje;
end $$