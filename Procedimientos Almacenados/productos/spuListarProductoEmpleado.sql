use dblavanderia;
delimiter $$
create procedure spuListarProductoEmpleado()
begin
	select * from Tproducto where Estado=1;
end $$