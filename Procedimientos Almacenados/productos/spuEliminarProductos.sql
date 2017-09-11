use dblavanderia;
delimiter $$
create procedure spuEliminarProducto (in aIdproducto int)
begin
	declare coderror bit;
    declare mensaje varchar(60);
	if exists (select * from tproducto where Idproducto = aIdproducto) then
		delete from tproducto where Idproducto = aIdproducto;
		set CodError=1;
        set Mensaje='Se elimino el Producto';
	else
		set CodError=0;
        set Mensaje='No existe el Producto';
	end if;
end $$
