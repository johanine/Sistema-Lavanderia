use dblavanderia;
delimiter $$
create procedure spuListarPrenda()
begin
	select * from Tprenda; 
end $$