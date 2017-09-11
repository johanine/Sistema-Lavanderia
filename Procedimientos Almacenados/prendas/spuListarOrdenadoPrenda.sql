use dblavanderia;
delimiter $$
create procedure spuListarOrdenadoPrenda()
begin
	select * from TPrenda order by descripcion;
end $$