use dblavanderia;
delimiter $$
create procedure spuListarProducto()
begin
	select * from Tproducto;
end $$

