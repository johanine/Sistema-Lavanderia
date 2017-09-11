use dblavanderia;
delimiter $$
create procedure spuDeshabilitarPrenda (in aIdPrenda int)
begin
	update TPrenda set Estado=0 where IdPrenda=aIdPrenda;
end $$