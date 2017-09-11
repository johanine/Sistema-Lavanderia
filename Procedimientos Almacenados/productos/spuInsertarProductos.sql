use dblavanderia;
delimiter $$
create procedure spuInsertarProducto
  (in aDescripcion varchar(50))
begin
	declare coderror bit;
    declare mensaje varchar(60);
	set aDescripcion = lower(aDescripcion);
	if not exists (select * from Tproducto where aDescripcion = descripcion) then
		insert into tProducto values ( adescripcion,1);
		set CodError=1;
        set Mensaje='Se inserto Producto';
	else
		set CodError=0;
        set Mensaje='Ya existe la Producto'; 
	end if;
    select coderror,mensaje;
end $$