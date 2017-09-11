use dblavanderia;
delimiter $$
create procedure spuListarOrdenadoProducto()
begin
	select * from TProducto order by descripcion;
end $$

