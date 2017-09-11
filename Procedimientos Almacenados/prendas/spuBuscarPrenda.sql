use dblavanderia;
delimiter $$
create procedure spuBuscarPrenda (in aCampo varchar(50), 
									  in aContenido varchar(50))
begin
	if(lower(aCampo)='descripcion') then
		select * from Tprenda  where descripcion = aContenido+'%';
	end if;
end $$
