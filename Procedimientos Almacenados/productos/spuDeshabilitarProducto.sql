use dblavanderia;
delimiter $$
create procedure spuDeshabilitarProducto (in aIdProducto int)
begin 
	update TProducto set Estado=0 where IdProducto=aIdProducto;
end $$