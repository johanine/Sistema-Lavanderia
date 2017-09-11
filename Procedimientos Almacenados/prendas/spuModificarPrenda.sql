use dblavanderia;
delimiter $$
create procedure spuModificarPrenda (in aIdprenda int ,
									 in aDescripcion varchar(50))
begin
	declare coderror bit;
    declare mensaje varchar(60);
	set aDescripcion = lower(adescripcion);
	if exists(select * from tprenda where aidprenda = idprenda) then
		update Tprenda set descripcion = adescripcion where aidprenda = idprenda;
		set CodError=1;
        set Mensaje='Se modifico la Prenda';
	else
		set CodError=0;
        set Mensaje='No existe la prenda';
	end if;
    select coderror,mensaje;
end $$