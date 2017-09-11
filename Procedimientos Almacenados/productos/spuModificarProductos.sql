use dblavanderia;
delimiter $$
create procedure spuModificarProducto (in aIdproducto int ,
									 in aDescripcion varchar(50) )
begin
	declare coderror bit;
    declare mensaje varchar(60);
	set aDescripcion = lower(adescripcion);
	if exists(select * from tProducto where aIdproducto = Idproducto) then 
		update tProducto set descripcion = adescripcion where aIdproducto = Idproducto;
		set CodError=1;
        set Mensaje='Se modifico el Producto';
	else
		set CodError=10;
        set Mensaje='No existe el producto';
	end if;
end $$