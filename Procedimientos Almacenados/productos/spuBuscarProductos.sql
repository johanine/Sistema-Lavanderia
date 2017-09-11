use dblavanderia;
delimiter $$
create procedure spuBuscarProducto (in aCampo varchar(50), 
									  in aContenido varchar(50))
begin
	if(lower(@Campo)='descripcion') then
		select * from Tproducto where descripcion = acontenido+'%';
	end if;
end $$

