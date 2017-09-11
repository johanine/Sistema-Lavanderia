use dblavanderia;
delimiter $$
create procedure spuBuscarIdProducto (in aDescripcion varchar(50))
begin
	select IdProducto from TProducto where Descripcion=aDescripcion;
end $$