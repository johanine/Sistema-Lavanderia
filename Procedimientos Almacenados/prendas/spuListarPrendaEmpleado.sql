use dblavanderia;
delimiter $$
create procedure spuListarPrendaEmpleado()
begin
	select * from Tprenda where Estado=1;
end $$

