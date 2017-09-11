use dblavanderia;
delimiter $$
create procedure spuEliminarPrenda (in aIdprenda int)
begin
	declare coderror bit;
    declare mensaje varchar(60);
	if exists (select * from tprenda where IdPrenda = aIdprenda) then
		delete from tPrenda where IdPrenda = aIdprenda;
		set CodError=1;
        set Mensaje='Se elimino la Prenda';
	else
		set CodError=0;
        set Mensaje='No existe la Prenda';
	end if;
    select coderror,mensaje;
end $$
